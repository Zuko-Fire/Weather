package com.tfstudio.ictis.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.util.Log
import android.view.LayoutInflater
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import com.tfstudio.ictis.weather.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)



        Log.d("MyLogMAct","onCreate")
    }


    override fun onStart() {
        super.onStart()
        Log.d("MyLogMAct","onStart")



    } override fun onResume() {
        super.onResume()
        Log.d("MyLogMAct","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogMAct","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogMAct","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLogMAct","onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLogMAct","onStop")
        bindingClass.time.text = "Ночь "
    }

    fun Update_info(view: android.view.View) {

    }

}