package com.mcmoviles.manuel.appburbujas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class Formulario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)
        btnMapa.setOnClickListener{
            val intent= Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
        val bundle=intent.extras
        val dir=bundle.get("dir")
        edDirFor.setText("$dir")
    }
}
