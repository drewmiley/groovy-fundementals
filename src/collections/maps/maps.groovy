package collections.maps

// Groovy maps are instances of java.util.LinkedHashMap

/*
   DEFINING MAPS
 */


//map literal values, keys are Strings by default
def capitals = [England:'London',France:'Paris', Germany:'Berlin',Spain:'Madrid']

assert capitals['England'] == 'London'
assert capitals.France == 'Paris'

// unknown values are null
assert capitals.unknown == null


/*
   ADDING VALUES
 */
capitals << [Ireland:'Dublin']
assert capitals['Ireland'] == 'Dublin'

capitals.put('Portugal','Lisbon')
assert capitals['Portugal'] == 'Lisbon'

def key = 'Japan'
capitals.put(key,'Tokyo')
assert capitals['Japan'] == 'Tokyo'

/*
   ITERATING
 */

capitals.each {k,v ->
    println "$k:$v"
}

capitals.each{
    println it.value
}




