package characters

/*
   Groovy does not have an explicit character literal
 */

// explicitly specifying the char type
char c1 = 'A'
assert c1 instanceof Character

def c2 = 'B' as char
assert c2 instanceof Character

char c3 = "c"
assert c3 instanceof Character

def s1 = 'A'
assert s1 instanceof String
