// when은 일반 프로그래밍 언어의 switch를 대체함
var sample = 3
when (sample) {
    1 -> println("one")
    2 -> {
        println("two")
    }
    3 -> println("three")
    else -> println("what")
}

when (sample) {
    4 -> println("four")
//    "Hello" -> println("hello")             // error: incompatible types: String and Int
//    is Boolean -> println("is Boolean")     // error: incompatible types: Boolean and Int
}

when (sample) {
    in 1..10 -> println("number is in 1..10")
    in 11..20 -> println("number is in 11..20")
    in 21..30 -> println("number is in 21..30")
}