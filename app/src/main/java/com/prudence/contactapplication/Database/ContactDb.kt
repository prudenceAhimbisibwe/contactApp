package com.prudence.contactapplication.Database

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import com.prudence.contactapplication.model.Contact

@Database( entities = arrayOf(Contact::class), version = 1)
abstract class ContactDb : RoomDatabase(){
    abstract fun contactDao(): ContactDao

    companion object{
        private  var database:ContactDb? = null

        fun getDatabse(context, Context):
    }
}