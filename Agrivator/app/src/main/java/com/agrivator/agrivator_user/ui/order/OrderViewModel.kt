package com.agrivator.agrivator_user.ui.order

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Here orders are displayed"
    }
    val text: LiveData<String> = _text
}