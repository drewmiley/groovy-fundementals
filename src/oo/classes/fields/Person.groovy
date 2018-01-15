package oo.classes.fields

class Person {

    /*
        When a class is declared with a field that has the access modifier in place it is referred to as a field.
        Groovy will provide methods to access this in the form of person.name
     */
    private String name

    /*
        If is possible to omit the type of a field though this is considered bad practise unless you really need to take
        advantage of duck typing
     */
    private weight

    /*
        When the access modifier is omitted the field becomes a property. Groovy will provide the private backing
        adding a get and set method
     */
    Integer age  // property



    static void main(String[] args){
        def person1 = new Person()

        person1.name = 'John'
        assert person1.name == 'John'

        person1.weight = 76.2
        assert person1.weight == 76.2

        person1.setAge(36)
        assert person1.getAge() == 36


    }
}
