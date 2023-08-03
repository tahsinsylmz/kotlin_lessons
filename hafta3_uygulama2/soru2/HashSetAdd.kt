package com.kotlinegitim.uygulamaderslerihafta3_2

fun main(){
    val hashSet1 = hashSetOf("A", "B", "C")
    val hashSet2 = hashSetOf<String>()

    println(hashSetEkle(hashSet1, hashSet2))

}

fun <T> hashSetEkle(hashSet : HashSet<T>, hashset2 : HashSet<T>): HashSet<T>{
    hashset2.addAll(hashSet)
    return hashset2
}