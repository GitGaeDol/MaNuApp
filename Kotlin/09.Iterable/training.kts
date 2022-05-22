// Collection, Array, Progression

// Progression
// 시작점과 끝점이 있고 범위를 정할 수 있다
// step 키워드로 구간 지정 가능
println(1..10 step 2)
println(10 downTo 1 step 2)
println((1..10).reversed() step 5)

// Range는 구간이 1인 Progression
println(1..10)                   // 1~10
println(1.rangeTo(10))     // 1~10
println(1 until 10)              // 1~9

println('A'..'Z')
val rangeKor = 'ㄱ'..'ㅎ'
rangeKor.forEach {
    println(it)
}

val progressionRange = 1..10 step 2
println(progressionRange)      // 1..9 step 2
progressionRange.forEach {
    println(it)
}
val progressionDowntoRange = 10 downTo 1 step 2
println(progressionDowntoRange)      // 10 downTo 2 step 2
progressionDowntoRange.forEach {
    println(it)
}