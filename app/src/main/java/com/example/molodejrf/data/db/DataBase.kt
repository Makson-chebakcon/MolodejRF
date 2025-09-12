package com.example.molodejrf.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [UserSingInModel::class], version = 1)
abstract class DataBase: RoomDatabase() {


    abstract fun userSingInDao(): UserSingInDao


    companion object{

        @Volatile
        private var INSTANCE: DataBase? =null

        fun getInstance(context: Context): DataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DataBase::class.java,
                    "database"
                )
                    .addCallback(object : Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            println("Database created")
                        }
                    })
                    .build()
                INSTANCE = instance
                instance
            }
        }



    }


}