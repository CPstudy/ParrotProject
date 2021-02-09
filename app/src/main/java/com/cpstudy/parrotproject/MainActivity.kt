package com.cpstudy.parrotproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.cpstudy.parrotproject.databinding.ActivityMainBinding
import com.cpstudy.parrotproject.models.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        // viewModels()를 사용하려면
        // activity-ktx가 필요함
        val model: MainViewModel by viewModels()
        binding.viewModel = model
    }
}