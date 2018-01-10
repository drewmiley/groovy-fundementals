package traits.state

class CounterImpl implements Counter {
    static void main(String... args){

        def counter1 = new CounterImpl()
        assert counter1.count() == 1
        assert counter1.count() == 2
    }
}
