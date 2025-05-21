package com.castro.hector.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.castro.hector.laboratoriocalificado02.databinding.ActivityEjercicio02Binding

class Ejercicio02Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio02Binding

    companion object {
        const val NOMBRE_KEY = "NOMBRE_KEY"
        const val NUMERO_KEY = "NUMERO_KEY"
        const val PRODUCTOS_KEY = "PRODUCTOS_KEY"
        const val CIUDAD_KEY = "CIUDAD_KEY"
        const val DIRECCION_KEY = "DIRECCION_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        observeButtons()
    }

    private fun observeButtons() {
        binding.btnRegistrar.setOnClickListener {
            if (validarCampos()) {
                goDetailActivity()
            } else {
                Toast.makeText(this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validarCampos(): Boolean {
        return binding.etNombreCliente.text.isNotEmpty() &&
                binding.etNumeroCliente.text.isNotEmpty() &&
                binding.etProductos.text.isNotEmpty() &&
                binding.etCiudad.text.isNotEmpty() &&
                binding.etDireccion.text.isNotEmpty()
    }

    private fun goDetailActivity() {
        val nombre = binding.etNombreCliente.text.toString()
        val numero = binding.etNumeroCliente.text.toString()
        val productos = binding.etProductos.text.toString()
        val ciudad = binding.etCiudad.text.toString()
        val direccion = binding.etDireccion.text.toString()

        val intent = Intent(this, DetailActivity02::class.java)
        intent.putExtra(NOMBRE_KEY, nombre)
        intent.putExtra(NUMERO_KEY, numero)
        intent.putExtra(PRODUCTOS_KEY, productos)
        intent.putExtra(CIUDAD_KEY, ciudad)
        intent.putExtra(DIRECCION_KEY, direccion)

        startActivity(intent)
    }
}
