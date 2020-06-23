package com.deasunara.kotlin_dasar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun tekanTombol (view: View){

        imageView.setImageResource(R.drawable.kotlin)

        if (imageView.getTag()=="java"){
            imageView.setImageResource((R.drawable.kotlin))
            imageView.setTag("kotlin")
        }else{

            imageView.setImageResource(R.drawable.java)
            imageView.setTag("java")

        }
    }
}
