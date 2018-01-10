package functional.closures.thismeaning

/*
   THE MEANING OF THIS
 */


class Enclosing {
    void run(){

        // a closure defined inside a class that returns getThisObject
        def whatIsThisObject = { getThisObject() }

        //calling the closure will return an instance of Enclosing where the closure is defined
        assert whatIsThisObject() == this
    }
}

new Enclosing().run()

class EnclosedInInnerClass{

    class Inner{
        // a closure defined inside an inner class that returns this
        Closure cl = { this }
    }

    void run(){
        def inner = new Inner()

        // this within the closure will return the inner class
        assert inner.cl() == inner
    }

}

new EnclosedInInnerClass().run()



class NestedClosures{

    void run(){

        def outerClosure = {

            def innerClosure = { this }
            innerClosure()
        }

        // this within the innerClosure refers to closest outer class, not the outer closure
        assert outerClosure() == this
    }
}

new NestedClosures().run()


class Person{

    String name
    int age
    String toString() {"$name is $age years old"}

    String infoDump(){
        def cl ={
            String message = this.toString()
            message
        }
        cl()
    }
}

def person = new Person(name:'John',age:36)
assert person.infoDump() == 'John is 36 years old'