package com.example.uts1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = ArrayList<fakultas>()
        list.add(fakultas("FAKULTAS ILMU KOMPUTER", R.drawable.logo,
            "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di " +
                    "UPN ''Veteran'' Jawa Timur. Yang terdiri dari program studi: ",
            "\t\t1. Teknik Informatika\n" +
                    "\t\t2. Sistem Informasi\n" +
                    "\t\t3. Sains Data"))
        list.add(fakultas("FAKULTAS TEKNIK", R.drawable.logo,
            "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN ''Veteran'' " +
                    "Jawa Timur. Yang terdiri dari program studi: ",
            "\t\t1. Teknik Kimia\n" +
                    "\t\t2. Teknik Industri\n" +
                    "\t\t3. Teknik Sipil\n" +
                    "\t\t4. Teknik Lingkungan\n" +
                    "\t\t5. Teknologi Pangan"))
        list.add(fakultas("FAKULTAS EKONOMI DAN BISNIS", R.drawable.logo,
            "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di " +
                    "UPN ''Veteran'' Jawa Timur. Yang terdiri dari program studi: ",
            "\t\t1. Akuntansi\n" +
                    "\t\t2. Ekonomi Pembangunan\n" +
                    "\t\t3. Manajemen"))
        list.add(fakultas("FAKULTAS PERTANIAN", R.drawable.logo,
            "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di " +
                    "UPN ''Veteran'' Jawa Timur. Yang terdiri dari program studi: ",
            "\t\t1. Agroteknologi\n" +
                    "\t\t2. Agribisnis"))
        list.add(fakultas("OKTANIA PURWANINGRUM", R.drawable.foto,"Nama: Oktania Purwaningrum\n" +
                "TTL: Sidoarjo, 17 Oktober 2000\nAlamat: Jalan Jatisari no 79 Pepelegi\n" +
                "No. HP: 085732538498\n "
            , "Email: oktaniap@gmail.com /\n" +
                    "\t\t\t\t\t\t18082010029@upnjatim.student.ac.id\n" +
                    "URL Profil Github:\nhttps://github.com/oktaniap\n" +
                    "Riwayat Pendidikan:\n" +
                    "\t\t1. 2006 - 2012  SDN Pepelegi II\n" +
                    "\t\t2. 2012 - 2015  SMPN 3 Waru\n" +
                    "\t\t3. 2015 - 2018  SMAN 1 Taman\n" +
                    "\t\t4. 2018 - sekarang  UPN ''Veteran'' \n\t\tJawa Timur\nPenghargaan:\n" +
                    "\t\t1. Penulis Terpilih Lomba Puisi Ellunar\n" +
                    "\t\t2. Semifinalis KMNR ke 12" ))

        val adapter= adapter(list, this)

        rv.layoutManager= LinearLayoutManager(this)
        rv.adapter=adapter
    }
}