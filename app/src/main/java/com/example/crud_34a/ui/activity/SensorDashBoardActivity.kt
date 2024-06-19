package com.example.crud_34a.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.crud_34a.R
import com.example.crud_34a.databinding.ActivitySensorDashBoardBinding

class SensorDashBoardActivity : AppCompatActivity() {
    lateinit var sensorDashBoardBinding: ActivitySensorDashBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        sensorDashBoardBinding =  ActivitySensorDashBoardBinding.inflate(layoutInflater)
        setContentView(sensorDashBoardBinding.root)

        sensorDashBoardBinding.btnSensor.setOnClickListener {
            var intent = Intent(this@SensorDashBoardActivity,
                SensorListActivity::class.java)
            startActivity(intent)
        }

        sensorDashBoardBinding.btnAccelerometer.setOnClickListener {
            var intent = Intent(this@SensorDashBoardActivity,
                AccelerometerActivity::class.java)
            startActivity(intent)
        }

        sensorDashBoardBinding.btnGyro.setOnClickListener {
            var intent = Intent(this@SensorDashBoardActivity,
                GyroSensorActivity::class.java)
            startActivity(intent)
        }

        sensorDashBoardBinding.btnLight.setOnClickListener {
            var intent = Intent(this@SensorDashBoardActivity,
                LightSensorActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}