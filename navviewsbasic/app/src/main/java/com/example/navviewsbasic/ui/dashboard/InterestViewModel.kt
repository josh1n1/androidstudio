package com.example.navviewsbasic.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InterestViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Interest"
    }
    val text: LiveData<String> = _text
}