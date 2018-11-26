package com.example.anna.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Register : AppCompatActivity() {

    val editTextEmail: EditText by lazy {
        findViewById<EditText>(R.id.editTextEmail)
    }
    val textViewOk: TextView by lazy {
        findViewById<TextView>(R.id.textViewOk)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    fun register(view: View) {
        val regex = Regex(".*@.*[.].*")
        if(regex.containsMatchIn(editTextEmail.text)) {
            textViewOk.visibility = View.VISIBLE
            textViewOk.text = "OK"
        }
        else {
            textViewOk.visibility = View.VISIBLE
            textViewOk.text = "Please input a correct email"
        }
    }
}
