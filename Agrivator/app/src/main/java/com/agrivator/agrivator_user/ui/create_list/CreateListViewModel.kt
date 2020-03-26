package com.agrivator.agrivator_user.ui.create_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CreateListViewModel : ViewModel() {

    private val _text1 = MutableLiveData<String>().apply {
        value = "Create your list"
    }
    val text: LiveData<String> = _text1
}