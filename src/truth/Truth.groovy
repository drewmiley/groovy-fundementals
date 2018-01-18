package truth

/*
    Groovy allows it to be shortened due to its principles of Groovy Truth
    Non-empty Strings, GStrings and CharSequences are coerced to true
 */
def name = 'John'

result = name ? 'Found' : 'Not Found'
assert result == 'Found'

/*
    An empty object is coerced to true
 */
result = new Object() ? 'Groovy Truth' : 'Groovy False'
assert result == 'Groovy Truth'

/*
    An empty collection is coerced to false
 */
result = [] ? 'Groovy Truth' : 'Groovy False'
assert result == 'Groovy False'

/*
    An empty closure is coerced to true
 */
result = {} ? 'Groovy Truth' : 'Groovy False'
assert result == 'Groovy Truth'

/*
    An empty map is coerced to false
 */
result = [:] ? 'Groovy Truth' : 'Groovy False'
assert result == 'Groovy False'

/*
   The elvis operator shortens the ternary operator further.
    Given    result = name ? name: 'NotFound'
 */
result = name ?: 'Not Found'
assert result == 'John'
