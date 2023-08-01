package com.kotlinegitim.uygulamaderslerihafta3_1

fun main(){

    fun beraberListe(liste1: List<Int>, liste2: List<Int>): List<Int> {
        val liste3 = liste1.toMutableList()
        liste3.addAll(liste2)

        return liste3.sorted()
    }


    val liste1 = listOf<Int>(1, 2, 3, 0)
    val liste2 = listOf<Int>(4, 5, 6, 7)
    println(beraberListe(liste1, liste2))
}