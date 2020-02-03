package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.ViewGroup
import android.widget.RelativeLayout




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.second_activity);
        val relativeLayout = RelativeLayout(this)
        val textView1 = TextView(this)
        textView1.text = "Hello Android 1237"
        textView1.textSize = 26f

        // устанавливаем размеры
        textView1.layoutParams =
            ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        // добавляем TextView в RelativeLayout
        relativeLayout.addView(textView1)
        setContentView(relativeLayout)


    }
}
