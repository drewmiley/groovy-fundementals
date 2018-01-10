package scripts

import org.codehaus.groovy.runtime.InvokerHelper

class CompiledScript extends Script {

    int x = 1
    int y = 2

    int squared(int number){
        number * number
    }

    int variableBindingAccess(){
        x + y
    }

    //can't access local variables outside of the run method
    int localVariableAccess(){
        localX + localY
    }

    @Override
    Object run() {

        println "Groovy world"
        assert squared(16) == 256

        int localX = 1
        int localY = 2

        assert localX + localY == 3
        assert variableBindingAccess() == 3

        groovy.test.GroovyAssert.shouldFail {
            localVariableAccess()
        }

    }

    static void main(String[] args){
        InvokerHelper.runScript(CompiledScript,args)
    }
}