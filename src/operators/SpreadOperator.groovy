package operators

/*
    LIST ACTIONS
 */
class Car {
    String make
    String model
}

def cars = [ new Car(make: 'Peugeot', model: '508'),
    new Car(make: 'Renault', model: 'Clio')]

// Spread operator is user to invoke an action on all items of an aggregate object
// It is equivalent to calling the action on each item and collecting the result into a list
def makes = cars*.make
assert makes == ['Peugeot', 'Renault']

cars = [new Car(make: 'Peugeot', model: '508'),
    null,
    new Car(make: 'Renault', model: 'Clio')]

// It is null-safe meaning that if an element is null, it will return null instead of a NullPointerException
assert cars*.make == ['Peugeot', null, 'Renault']

/*
    METHOD CALL
 */
int function(int x, int y, int z) {
    x * y + z
}

// Spread operator can be used to call a method when the arguments can be found in a list
def args = [4, 5, 6]
assert function(*args) == 26

args = [4]
assert function(*args, 5, 6) == 26

/*
    LIST ELEMENTS
 */
// When used inside a list literal, it acts as if the spread element contents were inlined into the list
def items = [4, 5]
def list = [1, 2, 3, *items, 6]
assert list == [1, 2, 3, 4, 5, 6]
