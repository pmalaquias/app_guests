package com.pmalaquias.convidados.repository

import android.content.Context
import com.pmalaquias.convidados.GuestModel

class GuestRepository private constructor(context: Context) {

    private val guestDataBase = GuestDataBase(context)

    //singleton
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if (!Companion::repository.isInitialized) {
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun get(){
        //TODO: save on database
    }

    fun update(){
        //TODO: update on database
    }
}