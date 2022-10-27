package com.prudence.contactapplication.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.prudence.contactapplication.model.Contact
import com.prudence.contactapplication.R
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
    fun call(view: View){
      val dailIntent =Intent(Intent.ACTION_DIAL)
        dailIntent.data = Uri.parse("tel" +"784017930")
        startActivity(dailIntent)

    }
    fun displayContact(){
        var contact= Contact("Prudence","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var contact1= Contact("dallen","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var contact2= Contact("speria","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var contact3= Contact("Ashly","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var contact4= Contact("Annena","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var contactList= listOf(contact,contact1,contact2,contact3,contact4)

        var contactRvAdapter= ContactRvAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactRvAdapter
    }
}