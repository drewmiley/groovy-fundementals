package functional.closures

/*
    A closure is an open, anonymous block of code that can take arguments, return a value and be assigned to a variable

    A closure may reference variables declared in its surrounding scope.

    In opposition to the formal definition of a closure, a closure in Groovy can also contain free variables which are
    defined outside of its surrounding scope.


 */
def squared = { e ->  e * e }

assert squared instanceof Closure
assert squared(3) == 9

// if not using def, the type Closure can be used
Closure callBack = {println 'Done!'}

//Generic type can be used
Closure<Boolean> isEvenNumber = { num -> num % 2 == 0 }

assert isEvenNumber(2) == true


//closure can be called using the call method
assert isEvenNumber.call(3) == false


//closure with one argument
def closureWithOneArg = {str -> str.toUpperCase()}
assert closureWithOneArg('groovy') == 'GROOVY'

//closure with an explicit type
def closureWithOneArgAndExplicitType = { String str -> str.toUpperCase() }
assert closureWithOneArgAndExplicitType('groovy') == 'GROOVY'

//multi arg
def closureWithTwoArgs = { a,b -> a+b }
assert closureWithTwoArgs(1,2) == 3

//mixed
def closureWithTwoArgsAndOptionalTypes = { a, int b -> a+b }
assert closureWithTwoArgsAndOptionalTypes(1,2) == 3

def closureWithTwoArgAndDefaultValue = { int a, int b=2 -> a+b }
assert closureWithTwoArgAndDefaultValue(1) == 3

def closureWithImplicitParameter = {"Hello $it"}
assert closureWithImplicitParameter("John") == "Hello John"