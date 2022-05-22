// 주 생성자 : 반드시 한 개만. 생략 가능
class Person1 constructor(name: String) {
    val userName: String   // init 블록에서 초기화. 선언만 해도 됨

    // 초기화
    init {
        this.userName = name
    }
}
// 클래스 호출
val user = Person1("홍길동")

// init 생략 방법
class Person2 constructor(name: String) {
    val userName: String = name
}

// constructor 생략 방법
class Person3(name: String) {
    val userName: String = name
}

// 모두 생략
class Person4(val userName: String) {
}

// 기본값
class Person5(name: String = "호호호") {
    val userName: String = name
}

val user2 = Person5()
println(user2.userName)

// 부 생성자
// constructor 키워드 생략 불가
// 주 생성자에서 필요로 하는 파라미터를 포함해야 함 (아래의 경우 name)
// 부 생성자는 주 생성자에게 객체 생성을 위임해야 함
class Member1 constructor(name: String) {
    val name: String
    var age: Int = 0        // 부 생성자는 초기화 블록을 거치지 않을 수도 있으므로 var 선언 후 초기화
    var nickname: String = ""

    init {
        this.name = name
    }

    // this(name)으로 주 생성자에게 객체 생성을 위임하고 추가 파라미터만 처리
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
    constructor(name: String, age: Int, nickname: String) : this(name) {
        this.age = age
        this.nickname = nickname
    }
}
val member1 = Member1("고길동")
println(member1.name)
val member2 = Member1("김또치", 10)
println(member2.age)

// 주 생성자 생략
class Member2 {
    val age: Int
    val name: String

    // 주 생성자는 자동 생성
    constructor(age: Int, name: String) {
        this.age = age
        this.name = name
    }
}

val member3 = Member2(10, "단호박")
println(member3.name)

// getter/setter
// Kotlin 기본 제공. 기능 변경 원할 경우 개발자 직접 작성
class Member3 {
    val age: Int
//        get() {
//
//        }
//        set(value: Int) {
//
//        }
    val name: String

    // 주 생성자는 자동 생성
    constructor(age: Int, name: String) {
        this.age = age
        this.name = name
    }
}