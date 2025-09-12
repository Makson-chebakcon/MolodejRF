package com.example.molodejrf.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserSingInDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: UserSingInModel)

    @Update
    suspend fun updateUser(user: UserSingInModel)

    @Query("SELECT * FROM user_sing_in WHERE id = 0")
    suspend fun getUser(): UserSingInModel

    @Query("DELETE FROM user_sing_in")
    suspend fun clearUser()
}