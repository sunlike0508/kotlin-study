package classSample

class PersonWithConstructor constructor(private val name: String, private val age: Int) {

	private var etc: String = "no value"

	init {
		println("init : $etc")
	}

	constructor(name: String) : this(name, 15)

	constructor(name: String, age: Int, etc: String) : this(name, age) {
		this.etc = etc
		println("additional 생성자 is called : $etc")
	}

	fun introduce() {
		println("Hi, my name is $name and my age is $age. etc = $etc")
	}

	fun getName(): String {
		return name
	}

	fun sum1(a: Int, b: Int): Int {
		return a + b
	}
}
