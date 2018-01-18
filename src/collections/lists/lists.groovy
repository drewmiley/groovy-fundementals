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
    ACCESS METHODS
 */
def accessList = ['a', 'b', 'c', 'd', 'e'];

assert 'c' == accessList.get(2), 'get method'
assert 'd' == accessList[3], 'index access'
assert 'a' == accessList.first(), 'first method'
assert 'e' == accessList.last(), 'last method'
assert 'a' == accessList.head(), 'head method'
assert ['b', 'c', 'd', 'e'] == accessList.tail(), 'tail method'

assert null == accessList[1000]

assert 'e' == accessList[-1]
assert 'c' == accessList.getAt(-3)

/*
    ADDING OR REMOVING
 */

list.add(9)
assert list[4] == 9

list.putAt(1,1)
assert list[1] == 1

list[2] = 2
assert list.getAt(2) == 2

list.set(3, 8)
assert list[3] == 8

list << 10
assert list[5] == 10

list += 7
assert list[6] == 7

list.addAll([2, 3])
assert list.getAt(7) == 2
assert list[8] == 3

list.addAll(1, [4, 6])
assert list[1] == 4
assert list.getAt(2) == 6

// + is not mutating and will create a new list
assert[1,2,3] + 4 + [5,6] == [1,2,3,4,5,6]

assert list.remove(10) == 3

assert list.remove(0) == 5

/*
    SLICING A LIST
 */
def slicingList = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'];

assert ['b', 'c', 'd'] == slicingList[1..3]
assert ['a', 'c', 'e'] == slicingList[0,2,4]
assert ['a', 'c', 'e', 'f', 'g', 'h', 'i'] == slicingList[0,2,4,5..8]

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