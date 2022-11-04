package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

   // private var mAuth: FirebaseAuth? = null
    private lateinit var ed_name : EditText
    private lateinit var ed_click : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed_name = findViewById(R.id.edname)
        ed_click = findViewById(R.id.btn)

    ed_click.setOnClickListener {

        Toast.makeText(this, "hello" , Toast.LENGTH_SHORT).show()


        var firebasedatabase = FirebaseDatabase.getInstance()
        var databaseref = firebasedatabase.reference
        var userinp = ed_name.text.toString()
        databaseref.setValue(userinp)


    }


    }
}