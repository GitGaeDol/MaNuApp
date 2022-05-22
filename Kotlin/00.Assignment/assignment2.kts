//1. 주어진 문자를 n번 반복해서 출력하는 함수를 만들어 보자
fun printStringloop(a: String, loopCnt: Int): Unit {
    val loop = 1..loopCnt
    loop.forEach {
        println(a)
    }
//    for (i in 1..loopCnt) println(a)
//    for (i in 0 until loopCnt) println(a)
}
//printStringloop("하하", 3)

//2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자
fun sumNumbers(number: Int): Int? {
    if (number < 1) {
        return null
    }

    val loop = 1..number
    var sum = 0
    loop.forEach {
        sum += it
    }
    return sum
}
//println(sumNumbers(5))

//3. 1부터 100까지의 수 중에서 7의 배수의 합을 구하는 함수를 만드시오
fun multipleOfSeven(): Int {
    val loop = 1..100
    var result = 0
    loop.forEach {
        if (it % 7 == 0) result += it
    }
    return result
}
//println(multipleOfSeven())

//4. 100 보다 작은 숫자를 넣어주면, 1씩 증가 시키고 100이 되면 종료되는 함수를 만드시오
fun sumUntilOneHundred(number: Int): Unit {
    if (number < 100) {
        var num = number
        while (num < 100) {
            num++
            println("up")
        }
    }
}
//sumUntilOneHundred(99)

//5. 시험 성적 리스트 [70, 71, 72, 77, 78, 79, 80, 82, 90, 99]와 동일한 크기의 배열을 만들고,
//   합격이면 true, 불합격이면 false를 담는 함수를 만드시오
//   (80점 이상 부터 합격, 정답 예시 (False,False,...))
fun checkPassOrNot(scoreList: List<Int>): Array<Boolean> {
    val resultArray = Array<Boolean>(scoreList.size, { false })
    scoreList.forEachIndexed { index, i ->
        if (i >= 80) {
            resultArray[index] = true
        }
    }
    return resultArray
}

val resultArray = checkPassOrNot(listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99))
resultArray.forEach {
//    println(it)
}

//6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
//   -> [[3,3],[1,5],...]
fun numberOfCases(): List<List<Int>> {
    val resultList = mutableListOf<List<Int>>()

    for (dice1 in 1..6) {
        for (dice2 in 1..6) {
            if (dice1 + dice2 == 6) {
                resultList.add(listOf<Int>(dice1, dice2))
            }
        }
    }

    return resultList
}
//println(numberOfCases())

//7. 배부르기 위해서 먹어야하는 총 밥먹기 횟수, 현재 밥먹은 횟수, 두 개를 받는 함수를 만드시오
//   함수는 "밥을 먹었다" 한 번 출력을 할 때마다 밥을 1회 먹은 것으로 간주를 하고,
//   배가 부를 때까지 밥을 먹여야 한다
//   배가 부를 경우에는 "배가 부르다"를 출력한다
//   배가 아무리 불러도 최소 한 번은 무조건 먹는다
//   fun eat(3,2):{}
//   ->"밥을 먹었다"
//   ->"배가 부르다"
fun eat(full: Int, current: Int): Unit {
    var ate = current
    do {
        println("밥을 먹었다")
        ate++
    } while (full > ate)
    println("배가 부르다")
}
//eat(10, 5)

//8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두 개의 병사
//   그룹을 합쳐주는 함수를 만드시오
//   fun abc( ["A", "B", "C", "D", "E"] ,  ["A", "B", "C"], 2)
//   -> [["A", "B", "D", "E"], ["A", "B"]]
//   (함수 실행이 어려운 조건을 만나면 null을 리턴해야한다)
//   fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 100)
//   -> null
fun removeElement(
    firstGroup: List<String>,
    secondGroup: List<String>,
    removeIdx: Int
): List<List<String>>? {
    if (firstGroup.size <= removeIdx || secondGroup.size <= removeIdx) {
        return null
    }
    val afterFirstGroup = mutableListOf<String>()
    afterFirstGroup.addAll(firstGroup)
    afterFirstGroup.removeAt(removeIdx)
    val afterSecondGroup = mutableListOf<String>()
    afterSecondGroup.addAll(secondGroup)
    afterSecondGroup.removeAt(removeIdx)

    val resultList = listOf<List<String>>(afterFirstGroup, afterSecondGroup)
    return resultList
}
//println(removeElement(listOf<String>("A", "B", "C", "D", "E"), listOf<String>("A", "B", "C"), 2))

//9. 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오
//   fun abc(3)
//   ->[3,6,9,12,15,18,21,24,27]
fun multiplicationTable(number: Int): List<Int> {
    val resultList = mutableListOf<Int>()

    for (i in 1..9) {
        resultList.add(number * i)
    }

    return resultList
}
//println(multiplicationTable(3))

//10. 숫자 리스트 두개를 넣어주면 짝수 홀수로 분리된 Map을 만드는 함수를 만드시오
//    (Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수")
fun evenOrOdd(first: List<Int>, second: List<Int>): Map<String, List<Int>> {
    val totalList = mutableListOf<Int>()
    totalList.addAll(first)
    totalList.addAll(second)

    val EVEN = mutableListOf<Int>()
    val ODD = mutableListOf<Int>()
    totalList.forEach {
        if (it % 2 == 0) {
            EVEN.add(it)
        } else {
            ODD.add(it)
        }
    }

    val resultMap = mutableMapOf<String, List<Int>>(Pair("짝수", EVEN), Pair("홀수", ODD))
    return resultMap
}
println(evenOrOdd(listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9), listOf<Int>(11, 12, 13, 14, 15)))

//땡땡땡.기능()
//-> 을 사용해야 하는 경우가 있을 수 있습니다
//-> 기능을 사용하는 방법은 이전 강의에서 알려드렸지만, .문법은 클래스 강의 이후에 이해가 가능합니다.
//-> 과제에서는 이해는 미뤄두고 우선 사용해주세요ㅠ