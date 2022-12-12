package com.example.prctica15_pedrogc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.example.prctica15_pedrogc.databinding.ActivityMainBinding

class DeleteActivity : Activitys() {
    val binding = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean{
        return when (item.itemId){
            R.id.BEliminar ->{
                Toast.makeText(this,"El usario ha sido eliminado con exito", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}