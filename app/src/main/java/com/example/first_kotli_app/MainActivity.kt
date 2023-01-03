package com.example.first_kotli_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var text_one: EditText =findViewById(R.id.text1)
        var text_two: EditText =findViewById(R.id.text2)
        val button:Button=findViewById(R.id.login_button)


        button.setOnClickListener{
          showMessage()

    }
}

    private fun showMessage() {
//
//        val text_two:TextView
//        if(text_two.toString() == null){
//            Toast.makeText(this,"enter value",Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this,"Thank You",Toast.LENGTH_SHORT).show();
//        }
    }}