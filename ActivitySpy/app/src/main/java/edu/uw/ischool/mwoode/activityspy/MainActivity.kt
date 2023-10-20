package edu.uw.ischool.mwoode.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("INFO", "onCreate event fired")
    }

    override fun onStart() {
        super.onStart()
        Log.i("INFO", "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("INFO", "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("INFO", "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("INFO", "onStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("INFO", "onDestroy event fired")
        Log.e("ERROR", "We're going down, Captain!")
    }
}

