package com.example.layouts.ej2_introviews

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.layouts.databinding.ActivityEj201BasicViewsBinding


class Ej201BasicViewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj201BasicViewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj201BasicViewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonShowElement.setOnClickListener { showNewTextView() }
        binding.buttonShowElement2.setOnClickListener { showNewTextView() }

    }

    private fun showNewTextView() {  // Creación de un elemento programáticamente

        // Crear una instancia de la clase TextView
        val etiqueta1 = TextView(this)
        // Establecemos el valor del string
        etiqueta1.text = "TextView desde código"
        // Modificamos aspecto
        etiqueta1.textSize = 25f
        etiqueta1.setTextColor(Color.parseColor("#0aad3f"))
        // Colocamos la vista TextView en el FrameLayout
        binding.frameContenedor.addView(etiqueta1)
    }

}