package com.example.ximbaliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ListEstados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_estados)
        val bQroo = findViewById<Button>(R.id.bQroo)
        val bCam = findViewById<Button>(R.id.bCam)
        val bVer = findViewById<Button>(R.id.bVer)
        val bMich = findViewById<Button>(R.id.bMich)
        val bSin = findViewById<Button>(R.id.bSin)
        val bMex = findViewById<Button>(R.id.bMex)

        bQroo.setOnClickListener{
            var intent = Intent(this, LugaresTuristicosQroo::class.java)
            startActivity(intent)

        }

        bVer.setOnClickListener{
            var intent = Intent(this, LugaresTuristicosVer::class.java)
            startActivity(intent)

        }

        bMich.setOnClickListener{
            var intent = Intent(this, LugaresTuristicosMich::class.java)
            startActivity(intent)

        }

        bCam.setOnClickListener{
            var intent = Intent(this, LugaresTuristicosCam::class.java)
            startActivity(intent)

        }

        bSin.setOnClickListener{
            var intent = Intent(this, LugaresTuristicosSin::class.java)
            startActivity(intent)

        }

        bCam.setOnClickListener{
            var intent = Intent(this, LugaresTuristicosCam::class.java)
            startActivity(intent)

        }

        bMex.setOnClickListener{
            var intent = Intent(this, LugaresTuristicosMex::class.java)
            startActivity(intent)

        }
    }
}

