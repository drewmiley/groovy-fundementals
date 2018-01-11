package collections.lists

/*
    DEFINING LISTS
 */
def list = [5,6,7,8]

assert list.get(2) == 7
assert list[2] == 7
assert list.size() == 4

//different types are supported, duplicates are allowed
def multiType = [1,'a']

assert multiType[0] == 1
assert multiType.get(1) == 'a'


/*
    ADDING OR REMOVING
 */

list.add(9)
assert list[4] == 9

list.putAt(1,1)
assert list[1] == 1

list[2] = 2
assert list.getAt(2) == 2

list << 10
assert list[5] == 10

// + is not mutating and will create a new list
assert[1,2,3] + 4 + [5,6] == [1,2,3,4,5,6]

//remove the first element
assert list.remove(0) == 5


/*
    ITERATING OVER A LIST
 */

list.each{
    println "Item: $it"
}

// it is the iterator or next element and i is the index
['a','b','c'].eachWithIndex{ it, i ->
    println "$i: $it"
}

/*
   CREATING A NEW LIST VIA TRANSFORMATION
 */
assert[1,2,3].collect {it * 2} == [2,4,6]

assert [1,2,3].findAll {it > 1} == [2,3]