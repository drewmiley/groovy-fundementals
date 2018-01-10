package functional.closures.owner

/*
    THE OWNER OF A CLOSURE

    The owner of a closure is similar to that of this, with a subtle difference. It will return the direct enclosing
    object, be it a closure or a class.

 */

class Enclosing {
    void run(){

        // a closure defined inside a class that returns the owner of the closure
        def whatIsOwnerMethod = { getOwner() }

        //calling the closure will return an instance of Enclosing where the closure is defined
        assert whatIsOwnerMethod() == this

        def whatIsOwner = { owner }
        assert whatIsOwner() == this
    }
}

new Enclosing().run()


class EnclosedInInnerClass{

    class Inner{
        // a closure defined inside an inner class that returns the owner
        Closure cl = { owner }
    }

    void run(){
        def inner = new Inner()

        // owner within the closure will return the inner class
        assert inner.cl() == inner
    }

}

new EnclosedInInnerClass().run()


class NestedClosures{

    void run(){

        def outerClosure = {

            def innerClosure = { owner }
            innerClosure()
        }

        // owner within the innerClosure refers to the outer closure, not the outer class
        assert outerClosure() == outerClosure
    }
}

new NestedClosures().run()