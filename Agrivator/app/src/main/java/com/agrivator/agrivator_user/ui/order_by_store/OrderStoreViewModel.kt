package com.agrivator.agrivator_user.ui.order_by_store

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderStoreViewModel : ViewModel() {

    private val _text1 = MutableLiveData<String>().apply {
        value = "Select your store"
    }
    val text: LiveData<String> = _text1
}