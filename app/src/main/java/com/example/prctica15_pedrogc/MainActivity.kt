package com.example.prctica15_pedrogc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.example.prctica15_pedrogc.databinding.ActivityMainBinding

class MainActivity : Activitys() {
    val binding = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean{
        return when (item.itemId){
            R.id.Banadir ->{
                Toast.makeText(this,"El usuario ha sido guardado", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}