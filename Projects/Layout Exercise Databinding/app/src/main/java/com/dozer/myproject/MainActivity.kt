package com.dozer.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button // TextView'den turetilmis
    private lateinit var textView: TextView // View'den turetilmis
    private lateinit var imageView: ImageView // View'den turetilmis
    private lateinit var constraintLayout: ConstraintLayout // root duzeyde,Viewgroup'dan turetilmis

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}