package com.cpstudy.parrotproject.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var counter: MutableLiveData<Int> = MutableLiveData()

    init {
        counter.value = 0
    }

    fun increase() {
        counter.value = counter.value?.plus(1)
    }
}