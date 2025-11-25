package com.coding.meet.newsapp.data.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import androidx.room.TypeConverters
import com.coding.meet.newsapp.data.model.Article

@Database(entities = [Article::class], version = 1, exportSchema = false)
@TypeConverters(SourceTypeConverter::class)

@Suppress("NO_ACTUAL_FOR_EXPECT")

abstract class NewsDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao
}