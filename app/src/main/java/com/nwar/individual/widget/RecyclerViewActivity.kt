package com.nwar.individual.widget

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.nwar.individual.widget.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    var itemList = ArrayList<Data>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityRecyclerViewBinding>(this,R.layout.activity_recycler_view)
        while(itemList.size<=20){
            itemList.add(Data(itemList.size.toString() + "에베베베베베베베벱벱",itemList.size.toString() +"에베베베베베",itemList.size.toString() + "프로필"))
        }
        binding.recyclerview.adapter = RecyclerViewAdapter(itemList)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.setHasFixedSize(true)
    }
    data class Data(val title : String, val subTitle : String, val profile : String)
}
