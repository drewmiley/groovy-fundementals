package unitTesting

import groovy.mock.interceptor.MockFor
import groovy.mock.interceptor.StubFor

/*
    tests needs to be prefixed with test for the groovy runtime to pick it up.
 */
class BankAccountTest extends GroovyTestCase {

    private account

    void setUp() {
        account = new BankAccount(10)
    }

    void tearDown() {
        account = null
    }

    void testCanDepositMoney() {
        account.deposit(5)
        assert account.balance == 15
    }

    void testCanWithdrawMoney() {
        account.withdraw(5)
        assert account.balance == 5
    }

    void testCanNotWithdrawMoreMoneyThanBalance() {
        shouldFail(InsufficientFundsException){
            account.withdraw(15)
        }
    }

    void testCanAccrueInterestUsingStub() {
        /*
            would like to test with interest rate at 10%

            11 = 10 + (10 * 0.10)

            this can be achieved using a stub

         */
        def service = new StubFor(InterestRateService)

        // tell the stub what to return for a given method call
        service.demand.getInterestRate {
            return 0.10
        }

        //tell the stub the running context
        service.use {
            account.accrueInterest()
        }

        assert account.balance == 11
    }

    void testCanAccrueInterestUsingMock() {

        // MockFor will make sure the InterestRateService is invoked unlike StubFor.
        def service = new MockFor(InterestRateService)

        // tell the stub what to return for a given method call
        service.demand.getInterestRate {
            return 0.10
        }

        //tell the stub the running context
        service.use {
            account.accrueInterest()
        }
        
        assert account.balance == 11
    }
}
