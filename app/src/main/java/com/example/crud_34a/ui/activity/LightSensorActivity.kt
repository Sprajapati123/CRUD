package com.example.crud_34a.ui.activity

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.crud_34a.R
import com.example.crud_34a.databinding.ActivityLightSensorBinding

class LightSensorActivity : AppCompatActivity(),SensorEventListener {
    lateinit var lightSensorBinding: ActivityLightSensorBinding
    lateinit var sensor: Sensor
    lateinit var sensorManager: SensorManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        lightSensorBinding = ActivityLightSensorBinding.inflate(layoutInflater)
        setContentView(lightSensorBinding.root)

        if(!checkSensor()){
            Toast.makeText(applicationContext,"Sensor not supported",
                Toast.LENGTH_LONG
                ).show()
            return
        }else{

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    fun checkSensor() : Boolean{
        var sensor = true
        if(sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) == null){
            sensor = false
            return sensor
        }
        return sensor
    }

    override fun onSensorChanged(p0: SensorEvent?) {

    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }
}