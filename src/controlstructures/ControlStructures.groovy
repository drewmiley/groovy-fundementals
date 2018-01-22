package controlstructures

/*
   SWITCH

   Similar to the Java switch statement, however Groovy can handle amy kind of switch value and different kinds of matching
   can be performed.
 */

def x = 7
def result

switch (x){

    case "foo":
        result = "found foo"
        break

    case [4,5,6]:
        result = "list contains"
        break

    case 12..30:
        result = "range contains"
        break

    case Integer:
        result = "integer"
        break

    default:
        result = "default"
        break
}

println result
assert result == 'integer'