package com.ndp.picodiploma.ProjectAkhir

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//send to intent
@Parcelize
data class Payment(
    var type : String,
    var shoes : String,
    var color : String,
    var price : String,
    var icon : Int
) : Parcelable
