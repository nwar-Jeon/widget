package com.nwar.individual.widget

import android.content.DialogInterface
import android.databinding.DataBindingUtil
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast
import com.nwar.individual.widget.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityInfoBinding>(this,R.layout.activity_info)
        binding.btnShowToast.setOnClickListener {
            Toast.makeText(this,"토스트입니다", Toast.LENGTH_SHORT).show()
        }
        binding.btnShowSnackBar.setOnClickListener {
            Snackbar.make(binding.btnShowSnackBar,"스낵바입니다.",Snackbar.LENGTH_INDEFINITE)
                .setAction("닫기", View.OnClickListener {
                    Toast.makeText(this,"스낵바 터치",Toast.LENGTH_SHORT).show()
                })
                .setActionTextColor(Color.BLUE)
                .show()
        }
        binding.btnShowDialog.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_dehaze_black_24dp)
                .setTitle("다이얼로그")
                .setMessage("다이얼로그입니다.")
                .setNegativeButton("중간",DialogInterface.OnClickListener{dialog, which ->  dialog.dismiss()})
                .setNeutralButton("No",DialogInterface.OnClickListener { dialog, which ->  dialog.dismiss()})
                .setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
                .setCancelable(true)
                .show()
        }
    }
}
