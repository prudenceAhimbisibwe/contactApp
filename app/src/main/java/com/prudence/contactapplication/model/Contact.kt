package com.prudence.contactapplication.model

import android.provider.ContactsContract
import androidx.room.Entity

@Entity(tableName = "Contact")
data class Contact (

    var  name:String,
    var email:String,
    var phoneNumber:String,
    var address:String,
    var Image:String,
    )

