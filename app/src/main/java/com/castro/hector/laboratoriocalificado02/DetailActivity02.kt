package com.castro.hector.laboratoriocalificado02

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.castro.hector.laboratoriocalificado02.databinding.ActivityDetail02Binding

class DetailActivity02 : AppCompatActivity() {

    private lateinit var binding: ActivityDetail02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetail02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        mostrarDatos()
        setupButtons()
    }

    private fun mostrarDatos() {
        val nombre = intent.getStringExtra(Ejercicio02Activity.NOMBRE_KEY) ?: ""
        val numero = intent.getStringExtra(Ejercicio02Activity.NUMERO_KEY) ?: ""
        val productos = intent.getStringExtra(Ejercicio02Activity.PRODUCTOS_KEY) ?: ""
        val ciudad = intent.getStringExtra(Ejercicio02Activity.CIUDAD_KEY) ?: ""
        val direccion = intent.getStringExtra(Ejercicio02Activity.DIRECCION_KEY) ?: ""

        binding.tvNombreCliente.text = nombre
        binding.tvNumeroCliente.text = numero
        binding.tvProductos.text = productos
        binding.tvUbicacion.text = "$direccion, $ciudad"
    }

    private fun setupButtons() {
        val nombre = binding.tvNombreCliente.text.toString()
        val numero = binding.tvNumeroCliente.text.toString()
        val productos = binding.tvProductos.text.toString()
        val ubicacion = binding.tvUbicacion.text.toString()

        binding.btnLlamar.setOnClickListener {
            Toast.makeText(this, "Llamando a $nombre, número $numero", Toast.LENGTH_SHORT).show()
        }

        binding.btnWsp.setOnClickListener {
            Toast.makeText(this, "Hola $nombre, tus productos: $productos están en camino a la dirección: $ubicacion", Toast.LENGTH_LONG).show()
        }

        binding.btnMaps.setOnClickListener {
            Toast.makeText(this, "Ubicación: $ubicacion", Toast.LENGTH_SHORT).show()
        }
    }
}
