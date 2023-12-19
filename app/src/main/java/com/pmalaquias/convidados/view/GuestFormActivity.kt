package com.pmalaquias.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.pmalaquias.convidados.viewmodel.GuestFormViewModel
import com.pmalaquias.convidados.R
import com.pmalaquias.convidados.databinding.ActivityGuestFormBinding

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityGuestFormBinding
    private lateinit var viewModel: GuestFormViewModel

    /**
     * This method is called when the activity is created
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuestFormBinding.inflate(layoutInflater)

        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        binding.buttonSave.setOnClickListener(this)
        binding.radioPresent.isChecked = true
    }

    /**
     * This method is called when the user clicks on the button
     */
    override fun onClick(v: View) {
        if(v.id == R.id.button_save){
            //viewModel.save(10,x, false)
        }
    }
}