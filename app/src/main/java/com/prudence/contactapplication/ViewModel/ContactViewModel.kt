package com.prudence.contactapplication.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prudence.contactapplication.model.Contact
import com.prudence.contactapplication.repository.ContactRepository
import kotlinx.coroutines.launch

class ContactViewModel:ViewModel() {
    var contactRepository = ContactRepository()
    lateinit var contactLiveData: LiveData<Contact>
    fun getContactById(contactId: Int){
        contactLiveData= contactRepository.getContactById(contactId)
    }

    fun saveContact (contact:Contact){
        viewModelScope.launch {
            contactRepository.saveContact(contact)
        }
    }
}