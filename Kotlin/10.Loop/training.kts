// for, forEach
for (number in 1..10 step 3) {
    println(number)
}

val numbers = listOf<Int>(4, 5, 6, 7)
// withIndex를 사용하여 인덱스를 같이 사용할 수 있다
for ((index, number) in numbers.withIndex()) {
    println("" + index + " | " + number)
}

numbers.forEach {
    println(it)
}
numbers.forEach { number ->
    println(number)
}

// while, do/while
var i: Int = 0
do {
    if (i == 0) {
        println("Hey 모두들 안녕 내가 누군지 아니?")
    } else {
        println("이한위다!")
    }
    i++
} while (i < 3)

// label 키워드
// break, continue, return의 탈출지점
loop@ for (a in 1..3) {
    println("a : " + a)
    for (b in 1..3) {
        if (b == 2) {
            continue@loop
        } else {
            println("b : " + b)
        }
    }
}

// forEach는 continue, break 사용 불가
fun forEachTest(): Unit {
    listOf(1, 2, 3).forEach loop@{
        if (it == 2) {
            return@loop
        } else {
            println(it)
        }
    }
}
forEachTest()

// 인덱스만
for (index in numbers.indices) {
    println("index is " + index)
}
numbers.forEachIndexed { index, i ->
    println("forEach index is " + index + " and value is " + i)
}