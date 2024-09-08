package function

fun main(args: Array<String>) {
	val sum = sum1(10, 20)

	println(sum)

	println(sum2(20, 30))

	noReturnFunction("hello")

	defaultParameter("no value")
	defaultParameter()

	namedArgument("I", "am", "seonho")
	namedArgument(a = "I", c = "seonho", b = "am")
}

fun sum1(a: Int, b: Int): Int {
	return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun noReturnFunction(a: String) {
	println("called function : $a")
}

fun defaultParameter(a: String = "default value") {
	println("defaultParameter : $a")
}

fun namedArgument(a: String, b: String, c: String) {
	println("$a , $b , $c")
}
