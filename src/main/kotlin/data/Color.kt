package data

enum class Color(val label: String, val code: String) {
	RED("r", "red"),
	YELLOW("y", "yellow"),
	GREEN("g", "green"),
	BlUE("b", "blue");
}


enum class HttpStatus(val label: String, val code: Int) {
	REDIRECT("redirect", 300) {
		override fun isServerError(): Boolean {
			return false
		}
	},
	BAD_REQUEST("bad request", 400) {
		override fun isServerError(): Boolean {
			return false
		}
	};

	abstract fun isServerError(): Boolean
}


enum class HttpStatus2(val label: String, val code: Int) : CheckStatus{
	REDIRECT("redirect", 300) {
		override fun isServerError(): Boolean {
			return false
		}
	},
	BAD_REQUEST("bad request", 400) {
		override fun isServerError(): Boolean {
			return false
		}
	};
}

fun interface CheckStatus {
	fun isServerError(): Boolean
}


fun main() {
	println(HttpStatus.REDIRECT)
	println(HttpStatus.BAD_REQUEST.code)
	println(HttpStatus.BAD_REQUEST.label)
	println(HttpStatus.BAD_REQUEST.isServerError())
}

