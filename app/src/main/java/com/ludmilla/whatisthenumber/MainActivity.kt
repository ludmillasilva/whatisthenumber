package com.ludmilla.whatisthenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.ludmilla.whatisthenumber.viewmodel.NumberRandomViewModel


class MainActivity : AppCompatActivity() {

    lateinit var numberRandomViewmodel: NumberRandomViewModel
    lateinit var painel: TextView
    lateinit var dica: TextView
    lateinit var palpite: EditText
    lateinit var enviar: Button
    lateinit var tentativas: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        painel = findViewById(R.id.txtPainel)
        dica = findViewById(R.id.txtDica)
        palpite = findViewById(R.id.edtPalpite)
        enviar = findViewById(R.id.btnEnviar)
        tentativas = findViewById(R.id.txtTentativas)

        numberRandomViewmodel = ViewModelProvider(this).get(NumberRandomViewModel::class.java)

        painel?.text = numberRandomViewmodel.getRandomNumber().toString()


    }
}