package variable

class VariableSample {

    companion object {

        @JvmStatic
        fun main(args : Array<String>) {
            val name : String = "Shin"
            val org = "Around hub"
            var age = 12

            //org = "Kotlin" // 변수가 val이기 때문에 수정 불가능

            age = 10

            println("my name is $name")
            println("my org is $org")
            println("my age is $age")
        }
    }
}