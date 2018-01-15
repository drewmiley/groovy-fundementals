package operators

class User {
    Integer id
    String name
    User(Integer id, String name) {
        this.id = id
        this.name = name
    }
    String getName() {
        "Name: $name"
    }
}

/*
    SAFE NAVIGATION
 */
// Used to avoid a NullPointerException, as it will return null where an exception would normally be thrown
def people = [new User(1, 'John'),
              new User(2, 'Endeavour')]
def person = people.find{ it.id == 3}
assert person?.name == null

/*
    DIRECT FIELD ACCESS
 */
def user = new User(3, 'Bob')
assert user.name == 'Name: Bob'
// Use the operator to access the field directly rather than the getter
assert user.@name == 'Bob'

/*
    METHOD POINTER
 */
// Can be used to store a reference to a method in a variable, in order to call it later
def str = 'example of method reference'
def fun = str.&toUpperCase
def upper = fun()
assert upper == str.toUpperCase()

// As a method pointer is also a closure, we can use it in place of a closure on a list
class Person {
    String name
    Integer age
}

def transform(List elements, Closure action) {
    def result = []
    elements.each {
        result << action(it)
    }
    result
}

String describe(Person p) {
    "$p.name is $p.age"
}

def action = this.&describe
def list = [
        new Person(name: 'Bob', age: 42),
        new Person(name: 'Julia', age: 35)]
assert transform(list, action) == ['Bob is 42', 'Julia is 35']
