class Math {

    companion object {
        val PI = 3.1415
        val n = 1.5
        init {
            println("Inicializado")
        }
    }

    object obj1 {
        val a = 10
        val b = 20
    }

}

fun main() {
    Math.PI
}