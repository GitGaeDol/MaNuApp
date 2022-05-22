// 고차함수
// (파라미터 자료형) -> 결과 자료형
fun function1(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun function2(function: (Int, Int) -> Int) {
    val result: Int = function(10, 9)
    println(result)
}

// 고차함수 호출
function2(::function1)

// 람다
// 람다 함수 자체가 고차함수이므로 별도의 연산자 없이 변수에 담을 수 있음
// 람다 함수 안에서는 리턴 사용 불가. 마지막 라인이 리턴
val function3: (String) -> Unit = { str: String -> println(str) }
val function4: (String) -> Unit = { println(it) }      // 파라미터 1개면 그냥 it로 씀

val function5: (Int, Int) -> Int = { number1: Int, number2: Int ->
    number1 + number2
}
// 아래의 경우 : 한 쪽에 데이터타입을 지정하고 나머지 부분을 Kotlin이 추론하여 사용하는 방식
// 생략 버전 1 : 오른쪽 생략
val function6: (Int, Int) -> Int = { number1, number2 ->
    number1 + number2
}
// 생략 버전 2 : 왼쪽 생략
val function7 = { number1: Int, number2: Int ->
    number1 + number2
}
// 초 간단한 경우
function2 { number1, number2 -> number1 + number2 }
// 파라미터 없음
val function8: () -> Int = {
    10 + 8
}

// 람다 함수 호출
// :: 필요 없음
function2(function5)
function2(function6)
function2(function7)
function8()