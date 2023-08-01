package com.kotlinegitim.uygulamaderslerihafta3_1

fun main(){
    fun tekMi(list: List<Int>): List<Int>{
        return list.filter { it % 2 != 0 }
    }

    val liste1 = listOf<Int>(1,2,3,4,5,6,7)
    val tekSayilar = tekMi(liste1)
    println("Tek sayılar: $tekSayilar")
}