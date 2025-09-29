package com.example.molodejrf.data.model

data class Friend(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val avatarBase64: String,
    val projects: List<Project>
)