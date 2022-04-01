package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MyApplication1)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button: Button = findViewById<Button>(R.id.Btn_registrar_notas)

        button.setOnClickListener{
            var intent = Intent(this,registry_notes_material::class.java)
            startActivity(intent)
        }

        Handler(Looper.getMainLooper()).postDelayed({
            Toast.makeText(this, "Hola mundo", Toast.LENGTH_LONG).show()
           }, 3000)

    }
}