package oo.classes.methods

class Person {

    Integer age

    //default values can be specified
    def increaseAge(Integer years = 1){
        this.age += years
    }

    static void main(String... args){
        def person = new Person(age:36)

        //should make use of default value
        person.increaseAge()
        assert person.age == 37
    }


}
