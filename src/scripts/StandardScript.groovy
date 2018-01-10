package scripts

// standard print statement
println "Groovy world"

assert squared(16) == 256


//You can define methods within a script
int squared(int number){
    number * number
}

//assert squared(16) == 256

//variables in a script do not require a type definition. If they don't have one they will be added to the script binding
x = 1
y = 2
assert x+y ==3
assert variableBindingAccess() == 3

int variableBindingAccess(){
    x + y
}

/*
   Adding the type definition to a variable in a script will cause it to become a local variable
   The variables scope will be the run method.
 */
int localX = 1
int localY = 2

assert (localX + localY) == 3


int localVariableAccess(){
    localX + localY

}

//can't access local variables outside of the run method
groovy.test.GroovyAssert.shouldFail {
    localVariableAccess()
}