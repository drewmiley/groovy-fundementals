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
result = (name!=null && name.length() > 0) ? 'Found':'Not found'
assert result == 'Found'

/*
    Groovy allows it to be shortened due to its principles of Groovy truth
    Non-empty Strings, GStrings and CharSequences are coerced to true
 */
result = name ? 'Found' : 'Not Found'
assert result == 'Found'

/*
    An empty list is coerced to false
 */
result = [] ? 'Groovy Truth' : 'Groovy False'
assert result == 'Groovy False'

/*
    An empty closure is coerced to true
 */
result = {} ? 'Groovy Truth' : 'Groovy False'
assert result == 'Groovy Truth'

/*
   The elvis operator shortens the ternary operator further.
    Given    result = name ? name: 'NotFound'
 */
result = name ?: 'Not Found'
assert result == 'John'