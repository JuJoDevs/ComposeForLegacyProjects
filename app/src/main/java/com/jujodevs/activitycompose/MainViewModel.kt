package com.jujodevs.activitycompose

import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModel
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class MainViewModel: ViewModel() {

    fun onClick(context: Context) {
        val intent = Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    }
}