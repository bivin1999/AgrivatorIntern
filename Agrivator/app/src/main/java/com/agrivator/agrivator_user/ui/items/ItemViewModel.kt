package com.agrivator.agrivator_user.ui.items

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is item fragment"
    }
    val text: LiveData<String> = _text

}