
import java.util.Scanner

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    val a = reader.nextDouble()
    val b = reader.nextDouble()

    val weightA = 3.5
    val weightB = 7.5
    val totalWeight = 11

    val m = (a * weightA + b * weightB) / totalWeight

    val r = "%.5f".format(m)

    println("MEDIA = ${r}")
}