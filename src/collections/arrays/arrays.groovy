package collections.arrays


/*
    DEFINING
 */

//explicit declaration of arrays
String[] fruits = ['Apple','Banana','Orange']
assert fruits instanceof String[]

def numbers = [1,4,3,2] as int[]
assert numbers instanceof int[]


/*
    ACCESSING
 */

assert fruits[0] == 'Apple'
assert fruits.getAt(1) == 'Banana'


/*
   SETTING A VALUE
 */

fruits[1] = 'Peach'
assert fruits[1] == 'Peach'

/*
    ITERATING

 */
fruits.each {
    println(it)
}

for(fruit in fruits){
    println fruit
}