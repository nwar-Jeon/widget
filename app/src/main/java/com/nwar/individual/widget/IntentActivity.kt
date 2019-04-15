package com.nwar.individual.widget

import android.app.SearchManager
import android.content.Intent
import android.databinding.DataBindingUtil
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nwar.individual.widget.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityIntentBinding>(this,R.layout.activity_intent)
        binding.btnCall.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:01012345678"))
            startActivity(intent)
        }

        binding.btnSearch.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEARCH)
            intent.putExtra(SearchManager.QUERY,"android")
            startActivity(intent)
        }
        binding.btnSeoulMap.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=대덕소프트웨어마이스터고등학교"))
            startActivity(intent)
        }
        binding.btnMap.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("geo:37.484241,126.929651"))
            startActivity(intent)
        }
    }
}
