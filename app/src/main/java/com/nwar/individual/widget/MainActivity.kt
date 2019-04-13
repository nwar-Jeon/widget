package com.nwar.individual.widget

import android.databinding.DataBindingUtil
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.nwar.individual.widget.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val asyncTask = CustomAsyncTask(binding)
        asyncTask.execute()
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.textView.text = progress.toString() + "%"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        /*binding.switch1.setOnCheckedChangeListener{
            buttonView, isChecked ->
        }*/
    }


    class CustomAsyncTask(val binding : ActivityMainBinding) : AsyncTask<Unit,Unit,Unit>(){
        override fun onProgressUpdate(vararg values: Unit?) {
            super.onProgressUpdate(*values)
            binding.prograssBar.incrementProgressBy(1)
        }

        override fun onPostExecute(result: Unit?) {
            super.onPostExecute(result)
        }

        override fun doInBackground(vararg params: Unit?){
            var i=0
            for(i in 0..100) {
                publishProgress()
                Thread.sleep(100)
            }
        }

        override fun onPreExecute() {
            super.onPreExecute()
            binding.prograssBar.progress = 0
        }
    }
}
