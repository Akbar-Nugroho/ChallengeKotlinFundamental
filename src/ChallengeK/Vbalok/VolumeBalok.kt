package ChallengeK.Vbalok
import java.util.*

fun main(){
    val panjang : Double
    val lebar : Double
    val tinggi : Double
    val volumeB : Double

    val reader = Scanner(System.`in`)

    print("Masukkan Panjang : ")
    panjang = reader.nextDouble()

    print("Masukkan Lebar   : ")
    lebar = reader.nextDouble()

    print("Masukkan Tinggi  : ")
    tinggi = reader.nextDouble()

    volumeB = hitungVolume(panjang,lebar, tinggi)
    val s = String.format("%.2f", volumeB)
    println("||===========================||")
    print("Jadi Volume Balok = $s")

}
fun hitungVolume(p: Double, l:Double, t:Double): Double {
    return p * l * t
}