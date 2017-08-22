package com.bidjidev.kotlinsorting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nOrang:IntArray = intArrayOf(12090,2,3,4)
        println("nomor:")
        for (x in nOrang) {
            println(x.toString())
        }


        Arrays.sort(nOrang)
        println("\nDaftar NOmor Anggota:")
        for (x in nOrang) {
            println(x.toString())
        }
    }
}
