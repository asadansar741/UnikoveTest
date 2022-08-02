package com.test.unikovetest

import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    private fun showNotification(message: String){
        val notificationTitle="Insertion Success"
        val notifyPendingIntent: PendingIntent
        val notifyIntent = Intent(this, MainActivity::class.java)
        // Set the Activity to start in a new, empty task
        notifyIntent.flags = (Intent.FLAG_ACTIVITY_NEW_TASK
                or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        // Create the PendingIntent
        notifyPendingIntent = PendingIntent.getActivity(
           this, 0, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT
        )
    }

}