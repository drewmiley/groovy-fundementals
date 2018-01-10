package collections.ranges

//Ranges are lists with sequential values
//Inclusive: both begin and end values are in the
def ints = 1..10
assert ints == [1,2,3,4,5,6,7,8,9,10]
assert ints.from == 1
assert ints.to == 10


//just a list
assert ints[0] == 1

//Iterating
ints.each {
    println it
}

def inclusive = ''

(2..4).each {
    inclusive += it
}
assert inclusive == '234'

def exclusive = ''

2..<4.each{
    exclusive += '23'
}