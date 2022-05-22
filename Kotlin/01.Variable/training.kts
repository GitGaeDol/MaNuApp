// Kotlin은 변수의 선언과 할당을 따로 할 수 없음. 반드시 선언과 동시에 할당이 이루어져야 함

//var wrongTest
//wrongTest = 200       // error: this property must either have a type annotation, be initialized or be delegated

// 1. var 변수 선언
var changeYes = 100
println(changeYes)
//var changeYes       // error: property must be initialized or be abstract
//changeYes = 444     // error: overload resolution ambiguity

changeYes = 400
println(changeYes)

// 2. val 변수 선언
// 무조건 val이라고 대문자를 쓰지는 않음. 보통 상수(const val)일 때 이렇게 쓰는 듯..
// 더 알아볼 것. 강사가 대강 설명하고 넘어가버림
val CHANGE_NO = 300
println(CHANGE_NO)
//CHANGE_NO = 500     // error: val cannot be reassigned