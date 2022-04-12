import kotlin.math.*

fun main() {
    anosEquivale(2)
    println(qtdString("Casa"))
    println(calCubo(2))
    println(milhaKm(2.0))
    println(troca("aoao"))

}

fun anosEquivale(anos: Int) {
    println(
        "{$anos} equivalem há\n" + 12 * anos + " meses\n"
                + 365 * anos + "dias\n" + 8760 * anos + " horas\n" + 525600 * anos + " minutos\n" + 31536000 * anos + " segundos"
    )
}

fun qtdString(str: String) = str.length


fun calCubo(n: Int) = n * n * n

fun milhaKm(milha: Double) = milha * 1.6

fun troca(str: String): String {
    str.lowercase()
    return str.replace('a', 'x')
}
