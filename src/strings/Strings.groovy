package strings

/*
   SINGLE QUOTE
 */

// plain old java.lang.String that does not accept string interpolation
def singleQuote = 'Single quote strings'

/*
    DOUBLE QUOTE
 */

def name = 'John'
def doubleQuote = "This is a GString. $name, the date is ${new Date()} "
println doubleQuote

/*

   TRIPLE QUOTE
 */
def triple = ''' This string can spread across
                 multiple lines '''

println(triple)

/*
   CONCAT
 */

def concat = name + " Lewis" << "."
println(concat)

/*
   SLASHY
 */

// slash strings use / as a delimiter. They are particularly useful for defining regular expressions.
def groovyPattern = /groovy/
assert groovyPattern == 'groovy'