package com.example.navviewsbasic.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BiographyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Biography"
    }
    val text: LiveData<String> = _text
}