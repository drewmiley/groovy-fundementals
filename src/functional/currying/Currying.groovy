package functional.currying

/*
  In Groovy, currying refers to the concept of partial application. It does refer to the real concept of currying
  due to different scoping rules Groovy applies on closures

  Left currying is the fact of setting the left-most parameter of a closure.
 */
def nCopies = { int n, String str -> str * n }

// define a new closure that accepts a String as input
def twice = nCopies.curry(2)
assert twice('bla') == 'blabla'

/*
   Right currying is where the right most parameter is set
 */
def rightCurry = nCopies.rcurry('bla')
assert rightCurry(2) == 'blabla'
