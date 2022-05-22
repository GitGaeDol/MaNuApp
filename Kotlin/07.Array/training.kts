// 배열 선언 방법 1
// arrayOf<자료형>(값1, 값2, ...)
var array1 = arrayOf<Int>(1, 2, 3)
var arrayNullable = arrayOf<Int?>(1, 2, 3, null)

// 자료형을 생략한 경우 복수의 자료형이 배열의 인자로 올 수 있음
// non-null, nullabel 모두 가능
var variableArray = arrayOf(true, "Hello", 'A', 100)

// 자료형을 대체하는 방법
// 자료형ArrayOf(값1, 값2, ...)
var array2 = intArrayOf(1, 3, 5, 7)

// null을 인자로 받는 배열
// 배열을 선언하면서 초기화할 수 없을 때, 원하는 크기만큼 null로 초기화하여 만듦
var nulls = arrayOfNulls<Int>(100)

// 배열 선언 방법 2
// 자료형/생략Array(크기, {값/생략가능})
var array3 = Array(10, { 0 })     // 10자리의 배열을 만들고 0을 기본값으로 넣는다
var array4 = IntArray(10, { 0 })
//var arrayString = StringArray(10, {"Hi"})   // StringArray는 없다

// 배열 선언 방법 3
// Array<자료형>(크기, {값/생략가능})
var array5 = Array<Int>(10, { 0 })
var array6 = Array<String>(10, { "HI" })    // String 가능

// 배열 값 세팅
// 배열명[인덱스]
// 배열명.set(인덱스, 값)

// 배열 값 호출
// 배열명[인덱스]
// 배열명.get(인덱스)