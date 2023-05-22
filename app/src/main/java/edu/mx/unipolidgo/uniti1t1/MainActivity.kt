package edu.mx.unipolidgo.uniti1t1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import edu.mx.unipolidgo.uniti1t1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

       /* findViewById<Button>(R.id.btn_save).setOnClickListener {
            addNickname(it)
        }*/

        binding.btnSave.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View){
        //val editText = findViewById<EditText>(R.id.nickname_edit)
        //val nicknameText = findViewById<TextView>(R.id.nickname_text)
        binding.apply {

            nicknameText.text = binding.nicknameEdit.text
            invalidateAll()
            nicknameEdit.visibility = View.GONE
            btnSave.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE

           /* nicknameText.text = editText.text
            editText.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
            view.visibility = View.GONE
            */
        }


    }

}