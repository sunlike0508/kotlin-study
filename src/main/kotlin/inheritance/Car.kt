package inheritance

// open 키워드로 상속을 허용 한다.
open class Car (val name: String, val price: Double, val brand: String ) {

	open fun introduce() {
		println(name)
	}

	fun compare(otherCar: Car) {

	}
}
