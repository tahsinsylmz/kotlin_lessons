package com.kotlinegitim.uygulamaderslerihafta3_2


fun main() {

    val kalem = Kalem()
    val silgi = Silgi()

    kalem.ciz()
    kalem.kayit()
    silgi.ciz()
    silgi.kayit()
}

interface Cizilebilir {
    val satir: Int
    fun ciz()
    fun kayit() {
        println("Kaydetme başarılı.")
    }
}

class Kalem : Cizilebilir {
    override val satir = 4
    override fun ciz() {
        println("${satir} Satır yazıldı.")
    }
}

class Silgi : Cizilebilir {
    override val satir = 3
    override fun ciz() {
        println("${satir} Satır silindi.")
    }
}


