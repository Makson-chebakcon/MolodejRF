package com.example.molodejrf.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity("user_sing_in")
data class UserSingInModel (

    @PrimaryKey val id: Int = 0,
    val name: String,
    val email: String
)


