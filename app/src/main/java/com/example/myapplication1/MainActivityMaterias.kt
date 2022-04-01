package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityMaterias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_MyApplication1)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pantalla_inicial)

        val registro: Button = findViewById<Button>(R.id.btnRegistro)

        registro.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
             }

        val estadisticas: Button = findViewById<Button>(R.id.Btnestadisticas)

        estadisticas.setOnClickListener{
            var intent = Intent(this, MainEstadisticas::class.java)
            startActivity(intent)
        }

        val ayuda: Button = findViewById<Button>(R.id.BtnAyuda)

        ayuda.setOnClickListener{
            var intent = Intent(this, MainAyuda::class.java)
            startActivity(intent)
        }

    }
}
