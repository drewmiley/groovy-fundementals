package semantics

// def is the replacement for a type name. It is used to indicate that you don't care about the type
def undefinedInt = 1
int definedInt = 1

//multiple assignment
def a,b,c = [10,20,'foo']
assert a instanceof int
assert c instanceof String

// you can specify a type
def (int intVal, String stringVal) = [10,'foo']

//overflow and underflow
def e,f,g = [1,2]
assert g == null

def h,i = [1,2,3] //3 will be ignored

