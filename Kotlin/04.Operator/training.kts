// 할당할 값의 타입을 파악하기 어려운 경우 Kotlin의 추론에 맡겨도 됨
var resultVal = 10030490 / 143.3 * 234532
println(resultVal)      // 1.6416405308304256E10. Double 타입으로 추론

var nullTest: Int? = null
if (nullTest === null) {
    println("same")
} else {
    println("nope")
}