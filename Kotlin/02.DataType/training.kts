// 자료형 추론
// val/var 변수명: 타입 = 값
// 기본 자료형이 모두 대문자로 시작
// 정수의 경우 앞에 U를 추가하여 Unsigned로 쓸 수 있음
// Kotlin은 primitive 타입과 wrapper 타입을 구분하지 않음
// Kotlin은 숫자 타입을 자동으로 형변환 해주지 않는다. Int 값을 Long 타입에 대입하면 컴파일 에러 발생

var changeYes1: Byte = 100
var chagneYes2 = 100    // 정수는 기본적으로 Int형으로 추론

var realNumber1: Float = 10.0f
var realNumber2: Double = 10.0  // 실수는 기본적으로 Double형으로 추론
//var wrongRealNumber: Double = 10    // error: the integer literal does not conform to the expected type Double

// 추론 힌트 주기
var number1 = 100       // Int
var number2 = 100L      // Long
var number3 = 0x100     // 16진수 표기가 사용된 Int
var number4 = 100u      // UByte

// 큰 수의 자릿수 구분을 위해 언더스코어 사용 가능
val BIG_NUMBER = 100_000_000

// 추론 힌트를 사용하지 않으려면 직접 자료형을 표시
val BYTE_INT: Byte = 10
val SHORT_INT: Short = 10
val INTEGER_INT: Int = 10
val LONG_INT: Long = 10

//val WRONG_BYTE: Byte = 10000      // error: the integer literal does not conform to the expected type Byte
//val WRONG_TYPE: Byte = "Hello"    // error: type mismatch: inferred type is String but Byte was expected

val YES: Boolean = true
val NO: Boolean = false

val TEXT1: Char = 'Q'

val TEXT2: String = "Hello World"

// Kotlin 선점 키워드는 변수명으로 사용 불가
//var true: Int = 10      // error: expecting property name or receiver type