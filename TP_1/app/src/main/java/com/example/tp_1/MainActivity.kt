package com.example.tp_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var palindromo:Button
    lateinit var conversor:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializarElementos()
        palindromo.setOnClickListener(View.OnClickListener {
            //Donde estoy parado y a donde quiero ir
             val intento: Intent = Intent(this,PalindromoActivity::class.java)
            startActivity(intento)
        })
        conversor.setOnClickListener(View.OnClickListener {
            //Donde estoy parado y a donde quiero ir
            val intento: Intent = Intent(this,ConversorActivity::class.java)
            startActivity(intento)
        })

    }
    //Inicializo elementos
    fun inicializarElementos(){
        palindromo=findViewById(R.id.b_Palindromo)
        conversor=findViewById(R.id.b_conversor)
    }
}