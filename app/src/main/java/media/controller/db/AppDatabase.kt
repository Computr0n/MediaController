package media.controller.db

import androidx.room.Database
import androidx.room.RoomDatabase
import media.controller.db.dao.ExampleDao
import media.controller.db.entities.Example

@Database(entities = arrayOf(Example::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}