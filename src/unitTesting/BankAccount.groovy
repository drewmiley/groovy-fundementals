package unitTesting

class BankAccount {

    private balance

    BankAccount(openingBalance){
        balance = openingBalance
    }

    void deposit(amount){
        balance += amount
    }

    void withdraw(amount){

        if(amount > balance)
            throw new InsufficientFundsException()
        balance -= amount
    }

    void accrueInterest(){
       def service = new InterestRateService()
       def rate = service.getInterestRate()

       def accruedInterest = balance * rate
        deposit(accruedInterest)
    }
}
