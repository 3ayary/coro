import kotlinx.coroutines.*
fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(10000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}
// coroutines tutorial

    //main for ui
    // io dispatcher for data
    // default for complex calculations





fun task1(){

    print("hello")
}
fun  task2(){
    print("world")
}