package traits

class Bird implements FlyingAbility{

    static void main(String... args){
        def b = new Bird()
        assert b.fly() == "Hello from a private method I'm flying!"
        assert b.flyingHeight() == 30
        assert b.whoAmI() == b
        assert b.name() == "Sparrow"
    }

    @Override
    Integer flyingHeight() {
        30
    }

    @Override
    String name() {
        "Sparrow"
    }
}
