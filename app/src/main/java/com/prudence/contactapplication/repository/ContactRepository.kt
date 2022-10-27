package com.prudence.contactapplication.repository

import androidx.lifecycle.LiveData
import com.prudence.contactapplication.Contactapplication
import com.prudence.contactapplication.Database.ContactDb
import com.prudence.contactapplication.model.Contact
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactRepository {
    val database = ContactDb.getDatabse(Contactapplication.appContext)

    suspend fun saveContact(contact: Contact){
        withContext(Dispatchers.IO){
            database.ContactDao().instertContact(contact)
        }
        fetchContact()
    }
    fun fetchContact(): LiveData<List<Contact>>{
        return database.contactDao().getAllContact()
    }
    fun getContactById(contactId:Int): LiveData<Contact>{
        return database.contactDao().getContactById(contactId)
    }
}