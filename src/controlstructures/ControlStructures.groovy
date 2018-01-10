package controlstructures

/*
   SWITCH

   Similar to the Java switch statement, however Groovy can handle amy kind of switch value and different kinds of matching
   can be performed.
 */

def x = 3
def result = ""

switch (x){

    case "foo":
        result = "found foo"
        break

    case [4,5,6]:
        result = "list"
        break

    case 4..30:
        result = "range"
        break

    case Integer:
        result = "integer"
        break

    default:
        result = "default"
        break
}
println result
//assert result == 'integer'