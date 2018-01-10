package traits.inheritance.simple

class Person implements Polite{

    static void main(String... args){
        def p = new Person(name: 'John')
        assert p.introduce() == 'Hello, I am John'
    }
}
