package functional.memoization

def startTime = new Date().getTime()

// Need to assign variable without value to avoid undefined error
def fib
fib = { Integer n -> n < 2 ? n : fib(n -2) + fib(n - 1) }

// THIS IS SLOW!!
assert fib(15) == 610

def fibTime = new Date().getTime()
println fibTime - startTime

def fibWithMemo
fibWithMemo = { Integer n -> n < 2 ? n : fib(n -2) + fib(n - 1) }.memoize()
assert fibWithMemo(15) == 610

println new Date().getTime() - fibTime
