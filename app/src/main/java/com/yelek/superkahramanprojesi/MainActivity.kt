package com.yelek.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun superKahramanYap(view : View){
        val isim= isimText.text.toString()
        val yas = yasText.text.toString().toInt()
        val meslek = meslekText.text.toString()

        val superkahraman = SuperKahraman(isim,yas,meslek)

        sonucText.text="İsim: ${superkahraman.isim} Yaş:${superkahraman.yas} Meslek:${superkahraman.meslek}"
    }
}