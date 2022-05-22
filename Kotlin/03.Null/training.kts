// 왜 null을 씀?
// null은 값뿐만 아니라 상태의 비교가 가능

// Null Safety는 코틀린의 특징 중 하나
var nullVailable: String? = null            // nullable
var nullAvailable: String = "non null"      // non-null

var number: Int? = null
println(number)


// nullable 변수는 연산 불가
var number1: Int? = 2 + 5
var number2: Int? = 10

//var numberResult: Int? = number1 + number2
//println(numberResult)       // error: operator call corresponds to a dot-qualified call 'number1.plus(number2)' which is not allowed on a nullable receiver 'number1'

// nullable 변수 뒤에 !!를 붙여 null이 아님을 보장할 수 있으나, 변수의 값이 null일 경우 NPE 발생
var numberResult2: Int? = number1!! + number2!!
println(numberResult2)

// null은 비교연산 가능
if (null == 5) {
    println("not same")
}

if (null == null) {     // 값 비교가 아닌 상태 비교
    println("same")
}