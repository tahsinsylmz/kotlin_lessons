package com.kotlinegitim.uygulamaderslerihafta3_1

fun main() {

    val liste1 = listOf(1, 2, 3, 2, 4, 5, 3, 6)
    val tekrarlielemanlar = ayniElemanlariBul(liste1)
    println("Tekrar eden Elemanlar: $tekrarlielemanlar")
}


fun ayniElemanlariBul(list: List<Int>): ArrayList<Int> {

    val farkliElemanlar = HashSet<Int>()
    val ayniElemanlar = ArrayList<Int>()

    for (i in list) {
        if (farkliElemanlar.add(i)) {
        }
        else{
            ayniElemanlar.add(i)
        }
    }
    return ayniElemanlar
}