package com.prudence.contactapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class ContactRvAdapter (var contactList:List<Contact>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return  ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
       var currntContact=contactList.get(position)
        holder.tvName.text=currntContact.name
        holder.tvphone.text=currntContact.phoneNumber
        holder.tvemail.text=currntContact.email
        holder.tvaddress.text=currntContact.address
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){
            var tvName=itemView.findViewById<TextView>(R.id.tvName)
            var tvphone=itemView.findViewById<TextView>(R.id.tvphone)
            var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
            var tvaddress=itemView.findViewById<TextView>(R.id.tvaddress)
            var ivcontact=itemView.findViewById<ImageView>(R.id.ivcontact)
        }