package com.prudence.contactapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.prudence.contactapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContact()
    }
    fun displayContact(){
        var contact=Contact("Prudence","prudeahimbisibwe@gmail.com","0784027930","uganda","")
        var contact1=Contact("dallen","prudeahimbisibwe@gmail.com","0784027930","uganda","")
        var contact2=Contact("speria","prudeahimbisibwe@gmail.com","0784027930","uganda","")
        var contact3=Contact("Ashly","prudeahimbisibwe@gmail.com","0784027930","uganda","")
        var contact4=Contact("Annena","prudeahimbisibwe@gmail.com","0784027930","uganda","")
        var contactList= listOf(contact,contact1,contact2,contact3,contact4)

        var contactRvAdapter=ContactRvAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactRvAdapter
    }
}