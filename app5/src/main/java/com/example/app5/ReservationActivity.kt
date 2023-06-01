package com.example.app5

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ReservationActivity : AppCompatActivity() {
    var y = 0
    var m = 0
    var d = 0
    var h = 0
    var mi = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation)

        //날짜 선택
        val button = findViewById<Button>(R.id.datebutton)
        button.setOnClickListener { showDate() }

        //시간 선택
        val button1 = findViewById<Button>(R.id.timebutton)
        button1.setOnClickListener { showTime() }

        //인원수 선택
        val buttonm = findViewById<Button>(R.id.minus)
        val buttonp = findViewById<Button>(R.id.plus)
        var numtext = findViewById<TextView>(R.id.num)
        var number = 0;

        buttonm.setOnClickListener {
            if (number>0){
                number--
                numtext.setText(number.toString())
            }
        }

        buttonp.setOnClickListener {
            number++
            numtext.setText(number.toString())
        }

        val buttonc = findViewById<Button>(R.id.completeButton)

        buttonc.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Reserv Complete, $number people at $y.$m.$d\n$h:$mi",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    fun showDate() {
        val datePickerDialog = DatePickerDialog(this,
            { view, year, month, dayOfMonth ->
                y = year
                m = month + 1
                d = dayOfMonth
            }, 2022, 1, 11
        )

        datePickerDialog.show()
    }

    fun showTime() {
        val timePickerDialog = TimePickerDialog(this,
            { view, hourOfDay, minute ->
                h = hourOfDay
                mi = minute
            }, 12, 0, true
        )

        timePickerDialog.show()
    }
}