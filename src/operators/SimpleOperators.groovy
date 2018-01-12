package operators

/*
   POWER
 */
assert 2 ** 4 == 16

/*
   TERNARY
 */
def name = 'John'

// standard ternary
result = (name != null && name.length() > 0) ? 'Found' : 'Not found'
assert result == 'Found'
