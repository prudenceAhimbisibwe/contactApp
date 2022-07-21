package com.prudence.contactapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.prudence.contactapplication.databinding.ActivityMainBinding
import com.prudence.contactapplication.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class ContactRvAdapter (var contactList:List<Contact>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
       var currntContact=contactList.get(position)
        holder.binding.tvName.text=currntContact.name
        holder.binding.tvphone.text=currntContact.phoneNumber
        holder.binding.tvemail.text=currntContact.email
        holder.binding.tvaddress.text=currntContact.address
        Picasso.get()
            .load(currntContact.Image)
            .resize(300,300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_add_24)
            .into(holder.binding.ivcontact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(val binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root)
