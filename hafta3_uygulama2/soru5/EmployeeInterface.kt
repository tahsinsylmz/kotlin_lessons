package com.kotlinegitim.uygulamaderslerihafta3_2


interface Calisan {
    fun maasHesapla(): Double
}

class Mudur(val maas: Double, val bonus: Double) : Calisan {

    override fun maasHesapla(): Double {
        return maas + bonus
    }
}


class Memur(val maas: Double) : Calisan {

    override fun maasHesapla(): Double {
        return maas
    }
}

fun main() {

    val mudur = Mudur(5000.0, 2000.0)
    val memur = Memur(3000.0)

    println("Müdür Maaşı: ${mudur.maasHesapla()}")
    println("Memur Maaşı: ${memur.maasHesapla()}")

}
