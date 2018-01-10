package traits.state

/*
   Traits can hold state
 */

trait Counter {

    private int count = 0
    int count(){
        count +=1
        count
    }
}