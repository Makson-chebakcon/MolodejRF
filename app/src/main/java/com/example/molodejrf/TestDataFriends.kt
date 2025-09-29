package com.example.molodejrf

import com.example.molodejrf.data.model.Friend

data class TestDataFriends (
    val testFriends: MutableList<Friend> = mutableListOf(
        Friend(
            id = "1",
            firstName = "Алексей",
            lastName = "Иванов",
            email = "alex@example.com",
            avatarBase64 = "https://i.pravatar.cc/150?img=1",
            projects = emptyList() // можно добавить тестовые проекты позже
        ),
        Friend(
            id = "2",
            firstName = "Мария",
            lastName = "Петрова",
            email = "maria@example.com",
            avatarBase64 = "https://i.pravatar.cc/150?img=2",
            projects = emptyList()
        ),
        Friend(
            id = "3",
            firstName = "Иван",
            lastName = "Сидоров",
            email = "ivan@example.com",
            avatarBase64 = "https://i.pravatar.cc/150?img=3",
            projects = emptyList()
        ),
        Friend(
            id = "4",
            firstName = "Елена",
            lastName = "Кузнецова",
            email = "elena@example.com",
            avatarBase64 = "https://i.pravatar.cc/150?img=4",
            projects = emptyList()
        ),
        Friend(
            id = "5",
            firstName = "Дмитрий",
            lastName = "Смирнов",
            email = "dmitry@example.com",
            avatarBase64 = "https://i.pravatar.cc/150?img=5",
            projects = emptyList()
        )
    )

)