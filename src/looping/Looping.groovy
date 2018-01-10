package looping

/*
    FOR IN
 */

//iterating using a range
def x = 0

for(i in 0..9){
    x+=i
}

assert x == 45

// iterating over a list
x = 0

for(i in [0,1,2,3,4]){
    x += i
}

assert x == 10

//iterating over map values
def map = ['abc':1, 'def':2, 'xyz':3]

x = 0
for ( v in map.values() ) {
    x += v
}
assert x == 6


