package com.nwar.individual.widget

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.nwar.individual.widget.databinding.CardviewItemBinding

class RecyclerViewAdapter (val items : ArrayList<RecyclerViewActivity.Data>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount() = items.size
    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        if(p0 is ViewHolder) p0.bind(items.get(p1))
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder = ViewHolder(CardviewItemBinding.inflate(LayoutInflater.from(p0.context),p0,false))
    inner class ViewHolder(val binding : CardviewItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item : RecyclerViewActivity.Data){
            binding.tvTitle.text = item.title
            binding.tvContent.text = item.subTitle
            binding.tvProfile.text = item.profile
        }
    }
}