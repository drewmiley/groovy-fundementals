package oo.interfaces

class CoercedGreeter {

    void greet(String name){
        println("hello $name")
    }

    static void main(String[] args){

        def greeter = new CoercedGreeter()
        // as CoercedGreeter does not implement the method it will not be an instanceof
        assert !(greeter instanceof Greeter)

        def coerced = greeter as Greeter
        assert coerced instanceof Greeter

    }

}
