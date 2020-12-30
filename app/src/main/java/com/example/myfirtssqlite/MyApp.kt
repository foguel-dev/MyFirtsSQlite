package com.example.myfirtssqlite

import android.app.Application

class MyApp: Application() {
    // public static final
    companion object {
        lateinit var studentDao:StudentDao
        val mAllFaculties = arrayOf("Engineering", "Business", "Arts")
    }

    override fun onCreate() {
        super.onCreate()

        studentDao = StudentDao(this.baseContext)
        studentDao.open()
    }

}