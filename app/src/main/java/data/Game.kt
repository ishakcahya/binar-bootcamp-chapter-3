package data

interface Game {                                                                        // INTERFACE

    val masukkanPemain1: String                                                        // PROPERTIES

    val masukkanPemain2: String

    fun hasilGame() {                                                            // FUNCTION, METHOD
        if (masukkanPemain1 == "batu" && masukkanPemain2 == "gunting") {       // IF ELSE EXPRESSION
            println("Pemain 1 MENANG!")
        } else if (masukkanPemain1 == "batu" && masukkanPemain2 == "kertas") {
            println("Pemain 2 MENANG!")
        } else if (masukkanPemain1 == "gunting" && masukkanPemain2 == "kertas") {
            println("Pemain 1 MENANG!")
        } else if (masukkanPemain1 == "gunting" && masukkanPemain2 == "batu") {
            println("Pemain 2 MENANG!")
        } else if (masukkanPemain1 == "kertas" && masukkanPemain2 == "batu") {
            println("Pemain 1 MENANG!")
        } else if (masukkanPemain1 == "kertas" && masukkanPemain2 == "gunting") {
            println("Pemain 2 MENANG!")
        } else if (masukkanPemain1 == masukkanPemain2) {
            println("DRAW")
        } else {
            println("Game belum dimulai.\nMasukkan pilihan yang benar!")
        }
    }
}