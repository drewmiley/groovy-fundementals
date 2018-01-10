package oo.classes.constructors

/*
     If no constructor was declared it is possible to create objects by passing parameters in the form of a map

 */
class PersonWithoutConstructor {

    String name
    Integer age

    static void main(String[] args){
        def person1 = new PersonWithoutConstructor() //standard default
        def person2 = new PersonWithoutConstructor(name: 'John')
        def person3 = new PersonWithoutConstructor(name: 'John',age:36)
    }

}
