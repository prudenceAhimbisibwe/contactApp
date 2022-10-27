package com.prudence.contactapplication.ui

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.prudence.contactapplication.model.Contact
import com.prudence.contactapplication.R
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

        val context=holder.itemView.context
        holder.binding.ivcontact.setOnClickListener {
            Toast
                .makeText(context,"you have clicked an image",Toast.LENGTH_LONG)
                .show()
        }
        holder.binding.cvcontact.setOnClickListener {
            val intent=Intent(context, ViewContactActivity::class.java)
            intent.putExtra("NAME",currntContact.name)
            intent.putExtra("ADDRESS",currntContact.address)
            intent.putExtra("PHONE",currntContact.phoneNumber)
            intent.putExtra("VoiceCall",currntContact.phoneNumber)
            intent.putExtra("VideoCall",currntContact.phoneNumber)
            intent.putExtra("recording",currntContact.Image)
            intent.putExtra("IMAGE",currntContact.Image)
            context.startActivity(intent)
//            holder.binding.ivcontact.setOnClickListener{
//                Toast.makeText(context,"You have clicked the person",Toast.LENGTH_LONG)
//                    .show()
//            }
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(val binding: ContactListItemBinding):
    RecyclerView.ViewHolder(binding.root)
