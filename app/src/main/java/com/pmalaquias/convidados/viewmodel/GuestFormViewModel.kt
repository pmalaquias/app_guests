package com.pmalaquias.convidados.viewmodel

import androidx.lifecycle.ViewModel
import com.pmalaquias.convidados.repository.GuestRepository

class GuestFormViewModel : ViewModel() {

    private val guestRepository = GuestRepository.getInstance()
}