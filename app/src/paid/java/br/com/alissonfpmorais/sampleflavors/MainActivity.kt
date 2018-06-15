package br.com.alissonfpmorais.sampleflavors

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Paid version!", Toast.LENGTH_SHORT).show()
        Log.d("truta", "Paid version!")
    }
}
