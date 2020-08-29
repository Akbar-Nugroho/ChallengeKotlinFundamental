package ChallengeK.Vbola
import java.util.*

fun main(){
    var jari: Float
    var vphi: Float
    val reader = Scanner(System.`in`)
    print("Masukkan Jari jari : ")
    jari = reader.nextFloat()
    vphi = ((jari * jari * jari * 22 * 4 / 7) / 3)
    val s = String.format("%.2f", vphi)
    println("||===========================||")
    print("Jadi Volume Bola = $s")
}