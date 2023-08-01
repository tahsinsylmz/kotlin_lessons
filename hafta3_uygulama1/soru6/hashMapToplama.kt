package com.kotlinegitim.uygulamaderslerihafta3_1


fun main() {

    val hashMap = hashMapOf(
        "A" to 1,
        "B" to 2,
        "C" to 3,
        "D" to 4
    )
    var toplam = 0

    for (value in hashMap.values) {
        toplam += value
    }

    println("Toplam: $toplam")
}