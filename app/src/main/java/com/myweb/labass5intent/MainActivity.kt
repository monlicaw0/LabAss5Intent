package com.myweb.labass5intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDate.parse
import java.time.format.DateTimeFormatter
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun showResult(view : View){

        var  radioGroup: RadioGroup =  findViewById(R.id.radioGroup)
        var  selectedId : Int = radioGroup.checkedRadioButtonId
        var  radioButton : RadioButton = findViewById(selectedId)


        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("empData", Employee(edit_name.text.toString(),radioButton.text.toString(),
            edit_email.text.toString(), edit_salary.text.toString().toInt()))
        startActivity(intent)



    }


    fun resetData(v: View){
        edit_name.text.clear()
        //edit_password.text.clear()
        edit_email.text.clear()
        edit_salary.text.clear()
        radioGroup.clearCheck()

    }
}
