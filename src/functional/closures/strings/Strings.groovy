package functional.closures.strings

def number = 1

// interpolate within a gstring as an expression
def eagerGString = "value == $number"

// interpolate within a gstring as a closure
def lazyGString = "value == ${-> number}"

assert eagerGString == "value == 1"
assert lazyGString == "value == 1"

//update the number
number = 2

// for the exprssion, the value was bound at the time of the GString creation and thus remains as 1
assert eagerGString == "value == 1"

// The closure is called upon each coercion of the GString into the String resulting in an updated value appearing
assert lazyGString == "value == 2"