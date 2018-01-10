package oo.classes.inner

class Outer {

    private String privateString = "private string"

    def callInnerMethod(){
        new Inner().methodA()
    }

    def startThread(){
        new Thread(new Runnable() {
            @Override
            void run() {
                println privateString
            }
        }).start()
    }


    class Inner{
        def methodA(){
            // inner classes can access the private field
            println(privateString)
        }
    }

    class InnerRunnable implements Runnable{

        @Override
        void run() {
            println(privateString)
        }
    }

    static void main(String... args){

        //standard way to call inner class
        def outer = new Outer()
        outer.callInnerMethod()

        //accessing the inner class via the outer class
        new Thread(new InnerRunnable(outer)).start()

        //anonymous inner class
        outer.startThread()


    }

}
