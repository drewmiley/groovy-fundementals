package oo.classes.fields

/*
    When a class is declared with a field that has an associated access modifier it is up to the developer to provide
    the related getter and setter methods. These are know as fields.

    However if no access modifier is provided, a private field is created with public getter and setters

 */

class Person {

    private String name
    Integer age

    static void main(String[] args){
        def person1 = new Person()

        // a setProperty method can be used
        person1.setProperty('name','John')
        assert person1.getProperty('name') == 'John'

        person1.setAge(36)
        assert person1.getAge() == 36
    }
}
