package traits.inheritance.multiple

class Employee implements Identified{
    static void main(String... args){

        def employee1 = new Employee(id:123456789l,name:'John')
        assert employee1.name == 'John'
        assert employee1.id == 123456789
    }
}
