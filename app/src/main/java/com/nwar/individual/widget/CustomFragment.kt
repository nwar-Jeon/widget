package com.nwar.individual.widget

import android.app.Fragment
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nwar.individual.widget.databinding.FragmentBinding

class CustomFragment : Fragment() {
    lateinit var binding : FragmentBinding
    lateinit var fragment : CustomFragment
    fun newInstance(text : String) : CustomFragment {
        fragment = CustomFragment()
        val bundle = Bundle()
        bundle.putString("text",text)
        fragment.arguments = bundle
        return fragment
    }

    fun changeText(text : String){
        setView(text)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        binding = FragmentBinding.inflate(inflater,container,false)
        setView()
        return binding.root
    }
    fun setView(){
        var text : String? = ""
        text = arguments?.getString("text")
        if(null==text) text = ""
        binding.tvFragment.text = text
    }
    fun setView(text : String){
        binding.tvFragment.text = text
    }
}