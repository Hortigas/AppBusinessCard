package vitor.businesscard

import android.app.Application
import vitor.businesscard.data.AppDatabase
import vitor.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}