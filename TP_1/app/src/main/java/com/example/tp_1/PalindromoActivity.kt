package com.example.tp_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PalindromoActivity : AppCompatActivity() {

    lateinit var TextoPalindromo:EditText
    lateinit var BotonoPalindromo:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindromo)
        inicializarElementos()
        BotonoPalindromo.setOnClickListener(View.OnClickListener {
           if (isPalindromeString(TextoPalindromo.toString().replace(" ","").toLowerCase()))
           {
               Toast.makeText(this, "Es un palindromo", Toast.LENGTH_SHORT).show()

           }
            else
           {
               Toast.makeText(this, "No es un palindromo", Toast.LENGTH_SHORT).show()
           }
        })
    }
    fun inicializarElementos(){
        TextoPalindromo=findViewById(R.id.t_palindromo)
        BotonoPalindromo=findViewById(R.id.b_palindromo)
    }
    fun isPalindromeString(inputStr: String): Boolean {
        val sb = StringBuilder(inputStr)

        //reverse the string
        val reverseStr = sb.reverse().toString()

        //compare reversed string with input string
        return inputStr.equals(reverseStr, ignoreCase = true)
    }
}