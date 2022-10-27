import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.prudence.contactapplication.R
import com.prudence.contactapplication.databinding.ActivityViewContactBinding
import com.squareup.picasso.NetworkPolicy
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
        val extras=intent.extras
        val image=extras?.getString("IMAGE","")

        Picasso.get()
            .load(image)
            .placeholder(R.drawable.ic_baseline_call_24)
            .error(R.drawable.ic_baseline_person_add_24)
            .resize(300,300)
            .centerCrop()
            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(binding.ivcall)
        val name=extras?.getString("NAME","")
        binding.tvName.text=name
        val email=extras?.getString("EMAIL","")
//        binding.tvEmail.text=email
        val phonenumber=extras?.getString("PHONE_NUMBER","")
        binding.tvnumber.text=phonenumber
        val address=extras?.getString("ADDRESS","")
//        binding.tvAddress2.text=address

        Toast.makeText(this,"$name:$email",Toast.LENGTH_LONG).show()
    }
}