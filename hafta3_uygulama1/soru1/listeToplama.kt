package com.kotlinegitim.uygulamaderslerihafta3_1

fun main(){

    fun listeTopla(list: List<Int>): Int{
        var toplam = 0
        for (sayi in list){
            toplam += sayi
        }
        return toplam
    }

    val liste1 = listOf<Int>(1, 3, 4, 5, 6, 7)
    val toplamListe = listeTopla(liste1)
    println("Toplam: $toplamListe")
}


