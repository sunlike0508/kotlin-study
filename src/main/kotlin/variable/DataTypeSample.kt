package variable

class DataTypeSample {

	companion object {

		@JvmStatic // 강사가 그냥 각 클래스별 실행 메인 넣기 위해 바꿈
		fun main(args: Array<String>) {
			/**
			 * 숫자형
			 */
			val number1 = 123
			val number2 = 123L
			val number3 = -123
			val number4: Long = 123
			val number5: Any = 123
			val number6 = 123.456
			val number7: Double = 123.456
			val number8: Float = 123.456F

			println(number1)
			println(number2)
			println(number3)
			println(number4)
			println(number5)
			println(number6)
			println(number7)
			println(number8)

			/**
			 * any의 특성 : 숫자 넣은 변수에 문자를 넣어보자
			 */

			var number10: Any = 12
			println(number10)
			number10 = "shin"
			println(number10)

			/**
			 * 논리형
			 */
			val isTrue = true
			val isFalse: Boolean = false
			val isFalse2: Any = false

			println(isTrue)
			println(isFalse)
			println(isFalse2)

			/**
			 * 문자형
			 */
			val character = 'a'
			println(character)
			println(character + 1)

			/**
			 * 문자열
			 */

			val str = "shin"
			var str2: Any = "text any"

			println(str)
			println(str2)
		}
	}
}
