package classSample

fun main() {
    val man = Person()

    man.introduce()

    man.age = 30

    man.introduce()
    
    val shin = PersonWithConstructor("shin")
    shin.introduce()
    
    val kim = PersonWithConstructor("Kim", 10)
    kim.introduce()
    println(kim.getName())

    val etc = PersonWithConstructor("etc", 20, "detail")
    etc.introduce()
}