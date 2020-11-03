package com.example.uts1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val aksi : ActionBar?=supportActionBar
        aksi!!.setDisplayHomeAsUpEnabled(true)
        aksi!!.setDisplayShowHomeEnabled(true)

        var intent = intent
        val namaFakultas = intent.getStringExtra("nama")
        val deskripsi = intent.getStringExtra("deskripsi")
        val jurusan = intent.getStringExtra("jurusan")
        val gambar = intent.getIntExtra("gmb", 0)

        aksi.setTitle(namaFakultas)
        textView2.text=namaFakultas
        textView3.text=deskripsi
        textView4.text=jurusan
        imageView.setImageResource(gambar)
    }
}