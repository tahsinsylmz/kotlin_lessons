package com.kotlinegitim.uygulamaderslerihafta3_2

fun main(){
    val hashSet1 = hashSetOf<Int>(2, 4, 6, 8, 10)
    val sayi1 = 5
    val sayi2 = 8
    val sayi1VarMi = hashSetControl(hashSet1, sayi1)
    val sayi2VarMi = hashSetControl(hashSet1, sayi2)

    if (sayi1VarMi) {
        println("$sayi1, HashSet içerisinde bulunuyor.")
    } else {
        println("$sayi1, HashSet içerisinde bulunmuyor.")
    }

    if (sayi2VarMi) {
        println("$sayi2, HashSet de var.")
    } else {
        println("$sayi2, HashSet de yok.")
    }

}

fun hashSetControl(hashSet : HashSet<Int>, sayi : Int): Boolean{
    return hashSet.contains(sayi)
}
