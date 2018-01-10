package characters

/*
   Groovy does not have an explicit character literal
 */

// explicitly specifying the char type
char c1 = 'A'
char c3 = "c"
assert c3 instanceof Character
assert c1 instanceof Character

def s1 = 'A'
assert s1 instanceof String

def c2 = 'B' as char
assert c2 instanceof Character