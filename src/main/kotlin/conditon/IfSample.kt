package conditon

import kotlin.random.Random

class IfSample {
    companion object {

        @JvmStatic
        fun main(args : Array<String>) {
            val a = Random.nextInt(10)
            val b = Random.nextInt(10)

            println("a $a, b $b")

            if(a > b) println("${a}는 ${b}보다 크다")
            if(a < b) println("$b 는 $a 보다 크다")


            if(a in 1..5) println("a(${a})는 1과 5사이")
            if(b in 1..5) println("b(${b})는 1과 5사이")

            val max = if (a < b) {
                println("max is $b")
                "b가 더커" // 이 값이 max 값을 넣음. 코틀린 특성상 마음대로 넣을수 있기에 여기는 스트링으로
            } else {
                println("max is $a")
                a
            }

            println("max : $max");
        }
    }
}