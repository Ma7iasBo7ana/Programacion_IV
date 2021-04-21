package com.example.tp_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class ConversorActivity : AppCompatActivity() {


    lateinit var celsius:EditText
    lateinit var fahrenheit:EditText
    lateinit var convertir:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)
        inicializarElementos()


        convertir.setOnClickListener(View.OnClickListener {

            val res= (celsius.text.toString().toDouble()*(9/5) +32)
            fahrenheit.setText(res.toString()+" F")
        })
    }




    //Inicializo elementos
    fun inicializarElementos(){
        celsius=findViewById(R.id.c_e_celsius)
        fahrenheit=findViewById(R.id.c_e_fahrenheit)
        convertir=findViewById(R.id.boton_convertir)
    }
}