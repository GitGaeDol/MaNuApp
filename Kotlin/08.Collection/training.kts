// List
val immutableList = listOf<Int>(1, 2, 3)
val mutableList = mutableListOf<Int>(1, 2, 3)

// Set
// 집합. 중복 값을 허용하지 않음
val immutableSet = setOf<Int>(1, 2, 3, 1, 1)    // setOf<Int>(1, 2, 3)
val mutableSet = mutableSetOf<Int>(1, 2, 3)

// Map
// K, V
val IMmutableMap = mapOf<String, String>("1" to "one", "2" to "two")
val mutableMap = mutableMapOf<String, String>("1" to "one", "2" to "two")
val pairMap = mapOf<String, String>(Pair("1", "one"), Pair("2", "two"))

// 배열과 달리 println으로 내용 표시 가능
println(immutableList)      // [1, 2, 3]
println(immutableSet)      // [1, 2, 3]
println(IMmutableMap)      // {1=one, 2=two}

// mutable일 경우에만 값을 바꿀 수 있다
//immutableList[0] = 4        // error: no set method providing array access
mutableList[0] = 4

// 컬렉션 값 호출
immutableList[0]
immutableList.get(0)
immutableList.indexOf(3)
// 가변 컬렉션 값 수정
mutableList.add(4)
mutableList.removeAt(0)
mutableList.addAll(2, listOf<Int>(100, 100))

immutableSet.contains(1)

mutableMap.keys
mutableMap.values
mutableMap.size
mutableMap.get(1)       // 존재하지 않는 key로 사용할 경우 null로 표시 됨
mutableMap[1]
mutableMap.getOrDefault(4, "four")