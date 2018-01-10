package oo.classes.standard

/*
    Public fields are turned into properties automatically
    Any property or method without an access modifier are public not package.
    Classes do not need to have the same name of the files where they are defined
    One file may contain one or more classes. If it has 0 it is considered a script.
    It is good practice to define the type for a field
 */

class Person {

    String name
    Integer age

    def increaseAge(Integer years){
        this.age += years
    }

    static void main(String... args){

        def person = new Person()
        person.setName("John Lewis")
        person.setAge(36)

        println person.age + " " + person.getName()

        println "New age is " + person.increaseAge(1)
    }
}
