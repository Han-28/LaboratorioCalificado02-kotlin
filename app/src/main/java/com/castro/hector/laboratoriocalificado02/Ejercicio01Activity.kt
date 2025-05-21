package com.castro.hector.laboratoriocalificado02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.castro.hector.laboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Botones para mostrar y ocultar la vista verde
        binding.btnMostrar.setOnClickListener {
            binding.verdeView.visibility = android.view.View.VISIBLE
        }

        binding.btnOcultar.setOnClickListener {
            binding.verdeView.visibility = android.view.View.GONE
        }
    }
}
