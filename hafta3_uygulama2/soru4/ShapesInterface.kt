package com.kotlinegitim.uygulamaderslerihafta3_2


interface Sekil {

    fun alanHesapla(): Double
}

class Dikdortgen(val en: Double, val boy: Double) : Sekil {
    override fun alanHesapla(): Double {
        return en * boy
    }
}


class Daire(val yaricap: Double) : Sekil {
    override fun alanHesapla(): Double {
        return Math.PI * yaricap * yaricap
    }
}

fun main() {

    val dikdortgen = Dikdortgen(5.0, 10.0)
    val daire = Daire(3.0)


    println("Dikdörtgen Alanı: ${dikdortgen.alanHesapla()}")
    println("Daire Alanı: ${daire.alanHesapla()}")

}
