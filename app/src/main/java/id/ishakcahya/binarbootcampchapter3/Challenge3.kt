package id.ishakcahya.binarbootcampchapter3

import data.*

private val awalJudul = "game suit"                                // ACCESS MODIFIER, ENCAPSULATION

val cetakAwalJudul: String = "B"

private val tengahJudul: String = "terminal"                           // REFERENCE DATA TYPE STRING

val cetakTengahJudul: Char = 'C'                                         // PRIMITIVE DATA TYPE CHAR

private val akhirJudul = Version("version")

fun main() {

    val pemain1 = "gunting"                                                              // VARIABLE
    val pemain2 = "BATU"

    val hasil = Hasil(pemain1.lowercase(), pemain2.lowercase())                            // OBJECT
                                                                     // EXCEPTION HANDLING CAPS LOCK
    for (i in 0 until 26) {                                                        // FOR LOOP
        print("=")
    }

    println()

    when (cetakAwalJudul) {                                                       // WHEN EXPRESSION
        "A" -> {
            print(awalJudul)
        }
        "B" -> {
            print(awalJudul.uppercase())
        }
        else -> {
            println("Judulnya salah!")
        }
    }

    var contohPoli = Poli("")
    contohPoli.printSpasi()

    if (cetakTengahJudul == 'C') {                                                  // IF EXPRESSION
        print(tengahJudul.uppercase())
    } else {
        println("Judulnya masih salah!")
    }

    contohPoli = Polidua("")                                                   // POLYMORPHISM
    contohPoli.printSpasi()

    println(akhirJudul.name.uppercase())

    var j = 0
    do {                                                                            // DO WHILE LOOP
        print("==")
        j++
    } while (j < 13)
    println()

    println("1. Masukkan pemain 1: ${pemain1.lowercase()}")
    println("2. Masukkan pemain 2: ${pemain2.lowercase()}")

    println("Hasil:")

    hasil.hasilGame()
}