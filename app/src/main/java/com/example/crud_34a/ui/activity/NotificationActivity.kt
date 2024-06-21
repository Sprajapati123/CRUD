package com.example.crud_34a.ui.activity

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.crud_34a.R
import com.example.crud_34a.databinding.ActivityNotificationBinding

class NotificationActivity : AppCompatActivity() {
    lateinit var notificationBinding: ActivityNotificationBinding
    var CHANNEL_ID = "1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        notificationBinding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(notificationBinding.root)

        notificationBinding.btnNotification.setOnClickListener {
            showNotification()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun showNotification() {
        var builder = NotificationCompat.Builder(this@NotificationActivity, CHANNEL_ID)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            var channel = NotificationChannel(
                CHANNEL_ID, "My channel",
                NotificationManager.IMPORTANCE_DEFAULT
            )

            var manager: NotificationManager = getSystemService(NOTIFICATION_SERVICE)
                    as NotificationManager

            manager.createNotificationChannel(channel)

            builder.setSmallIcon(R.drawable.baseline_add_a_photo_24)
                .setContentTitle("Routine update")
                .setContentText("Your class for sunday has not been cancelled")

        }else{
            builder.setSmallIcon(R.drawable.baseline_add_a_photo_24)
                .setContentTitle("Routine update")
                .setContentText("Your class for sunday has not been cancelled")

        }


    }
}