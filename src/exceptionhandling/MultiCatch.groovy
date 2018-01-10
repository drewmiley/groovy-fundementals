package exceptionhandling

String name = null

try{
    name.length()
}catch(IOException | NullPointerException e){
    println(e)
}