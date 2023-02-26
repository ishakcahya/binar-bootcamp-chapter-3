package id.ishakcahya.binarbootcampchapter3

import data.Hasil
import data.Version

private val judul = "game suit " // ACCESS MODIFIER, ENCAPSULATION

val cetakJudul = 'B' // PRIMITIVE DATA TYPE

private val subJudul = "terminal "

val cetakSubJudul = 'C'

private val akhirJudul = Version("version")

fun main() {

    val pemain1 = "gunTING" // VARIABLE, REFERENCE DATA TYPE
    val pemain2 = "BAtu"

    val hasil = Hasil(pemain1.lowercase(), pemain2.lowercase()) // OBJECT

    var i = 0
    while (i < 26) { // WHILE LOOPING
        print("=")
        i++
    }
    println()

    when (cetakJudul) { // WHEN EXPRESSION
        'A' -> {
            print(judul)
        }
        'B' -> {
            print(judul.uppercase())
        }
        else -> {
            println("Judulnya salah!")
        }
    }

    if (cetakSubJudul == 'C') { // IF EXPRESSION
        print(subJudul.uppercase())
    } else {
        println("Judulnya masih salah!")
    }

    println(akhirJudul.name.uppercase())

    var j = 0
    do { // DO WHILE LOOPING
        print("==")
        j++
    } while (j < 13)
    println()

    println("1. Masukkan pemain 1: ${pemain1.lowercase()}")
    println("2. Masukkan pemain 2: ${pemain2.lowercase()}")

    println("Hasil:")

    hasil.hasilGame()
}