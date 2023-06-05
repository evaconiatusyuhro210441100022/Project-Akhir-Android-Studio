package com.ndp.picodiploma.ProjectAkhir

import android.provider.BaseColumns

// menyimpan isi database
internal class DatabaseContract {

    internal class customerColumns : BaseColumns {
        companion object {
            const val TABLE_NAME = "customer"
            const val _ID = "_id"
            const val NAME = "name"
            const val EMAIL = "email"
            const val DATE = "date"
        }
    }

}