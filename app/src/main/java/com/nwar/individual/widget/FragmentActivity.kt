package com.nwar.individual.widget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        val fm = fragmentManager
        val fragment = CustomFragment().newInstance("안녕하세요")
        fragmentManager.beginTransaction().add(R.id.background,fragment).commit()
        findViewById<Button>(R.id.btn_text1).setOnClickListener {
            fragment.changeText("1번 텍스트")
        }
        findViewById<Button>(R.id.btn_text2).setOnClickListener {
            fragment.changeText("2번 텍스트")
        }
    }
}
