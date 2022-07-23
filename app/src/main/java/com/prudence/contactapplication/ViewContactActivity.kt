package com.prudence.contactapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ImageView
import android.widget.Toast
import com.prudence.contactapplication.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso


class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name=intent.extras?.getString("NAME")
        var address=intent.extras?.getString("ADDRESS")
        var number=intent.extras?.getString("PHONE")
        var number1=intent.extras?.getString("VoiceCall")
        var number2=intent.extras?.getString("VideoCall")
        var recording=intent.extras?.getString("Recording")
        var image=binding.ivperson

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        binding.tvName.text=name
        binding.tvnumber.text=number
        binding.tvnumber1.text=number1
        binding.tvnumber2.text=number2
        binding.tvrecording.text=recording
        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)

    }

}