package com.example.androidday1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity" ,"OnCreate() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity" ,"OnStar() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity" ,"Onpause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity" ,"OnStop() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity" ,"OnRestart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity" ,"OnResume() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity" ,"OnDestroy() is called")

    }

}