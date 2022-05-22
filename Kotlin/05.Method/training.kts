fun maFirstFun(name: String, age: Int): String {
    println(name + ", " + age)
    println("I'm in 1st fun")
    return name
}

// 변수의 기본값은 =로 세팅
fun maSecondFun(name: String, age: Int = 0): String {
    println(name + ", " + age)
    println("I'm in 2nd fun")
    return name
}

// 반환 값이 없는 경우
fun maThirdFun1(name: String, age: Int):Unit {
    println(name + ", " + age)
    println("I'm in 3rd fun 1")
}
fun maThirdFun2(name: String, age: Int) {
    println(name + ", " + age)
    println("I'm in 3rd fun 2")
}
fun maThirdFun3(name: String, age: Int) {
    println(name + ", " + age)
    println("I'm in 3rd fun 3")
    return
}
fun maThirdFun4(name: String, age: Int) {
    println(name + ", " + age)
    println("I'm in 3rd fun 4")
    return Unit
}

// 간단한 함수 선언
fun maFourthFun(name: String, age: Int) = println(name + ", " + age + " and I'm in 4th fun")

// 가변인자를 갖는 함수. String 인자가 1개 이상
fun maFifthFun1(vararg info: String) {
    println(info)
    println("I'm in 5th fun")
}
fun maFifthFun2(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

// Any는 Kotlin에서 모든 객체는 Any를 상속한다. Java의 Object와 같음

// Unit : Java의 void에 대응. Unit은 타입이면서 동시에 객체이기도 함. 싱글톤 인스턴스. 따라서 Any의 서브 클래스임

// Any : non-null 타입의 조상
// Any? : nullable 타입의 조상

// Noting : private contructor로 정의되어 인스턴스 생성 불가. 함수의 반환형으로 사용 가능. 해당 함수가 호출될 경우 뭔가 잘못 되었음. 명시적으로 알려줌
// Unit은 "아무런 값도 리턴 하지 않는다"의 의미. Nothing은 리턴이라는 행위 자체를 하지 않음을 의미
// Any가 모든 타입의 조상이라면 Nothing은 모든 타입의 자식. 심지어 내가 새로 만든 클래스에서도...

maFirstFun(name = "홍킬동", age = 15)
maSecondFun("홍킬동", 15)
var fourthResult = maFourthFun("홍킬동", 15)
println(fourthResult)
maFifthFun2(1, 2, 3, 4, 5)