package com.nwar.individual.widget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker

class DatePicker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)
        val calendar = findViewById<DatePicker>(R.id.datePicker)
        calendar.init(2019,0,1,DatePicker.OnDateChangedListener { view, year, monthOfYear, dayOfMonth ->  })
    }
}
