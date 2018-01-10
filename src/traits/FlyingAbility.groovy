package traits

/*
    Traits allow composition of behaviours
    View them as Interfaces carrying both default implementations and state

 */

trait FlyingAbility implements Named{

    // traits support default behaviour
    String fly(){
        "${greetingMessage()} I'm flying!"
    }

    // private methods are allowed, protected are not
    private String greetingMessage(){
        "Hello from a private method"
    }

    //abstract methods perform in the usual way
    abstract Integer flyingHeight()

    //this represents the implementing instance. In this case think of a Trait as a superclass
    def whoAmI(){this}

}