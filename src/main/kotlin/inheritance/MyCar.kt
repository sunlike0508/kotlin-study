package inheritance

import java.time.LocalDate

// open 키워드로 상속을 허용 한다.
class MyCar (name: String, price: Double, brand: String, val purchaseDate: LocalDate ) : Car (name, price, brand) {

	override fun introduce() {
		print(name)
	}
}
