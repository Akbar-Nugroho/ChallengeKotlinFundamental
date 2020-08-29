package ChallengeK
import java.util.*
import ChallengeK.Vbalok.main

fun main(){
    val input = Scanner(System.`in`)

    print("Nama     : ")
    input.nextLine()

    print("Kelas    : ")
    input.nextLine()

    print("No.Absen : ")
    input.nextInt()

    println("||===========================||")
    println("Kamu Ingin Menghitung apa?")
    println("1. Volume Balok")
    println("2. Volume Bola")
    println("0. Batal")
    println("||===========================||")
    print("Pilihanmu : ")

    when (input.nextInt()) {
        1 -> {
            main()
        }
        2 -> {
            ChallengeK.Vbola.main()
        }
        0 -> {
        }
    }

}