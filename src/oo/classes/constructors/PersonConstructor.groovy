package oo.classes.constructors

class PersonConstructor {

    String name
    Integer age

    PersonConstructor(name, age){
        this.name = name
        this.age = age
    }

    static void main(String[] args){

        def person1 = new PersonConstructor('John', 36) //standard
        def person2 = ['Bob',20] as PersonConstructor //using coercion with as
        PersonConstructor person3 = ['Marie',25] // coercion in assignment

        assert person1 instanceof PersonConstructor
        assert person2 instanceof PersonConstructor
        assert person3 instanceof PersonConstructor

    }
}
