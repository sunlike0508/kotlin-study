package data

data class DataClassSample(val name:String, val age:Int)

class NoDataClassSample(val name:String, val age:Int)

fun main() {
	val data1 = DataClassSample("shin", 10)
	val data2 = DataClassSample("shin", 10)

	println(data1.hashCode())
	println(data2.hashCode())

	println(data1 == data2)
	println(data1.toString())
	println(data2.toString())

	val data3 = NoDataClassSample("shin", 10)
	val data4 = NoDataClassSample("shin", 10)

	println(data3.hashCode())
	println(data4.hashCode())

	println(data3 == data4)
	println(data3.toString())
	println(data4.toString())
}
