package com.myweb.labass5intent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Employee (val name:String, val gender: String, val email : String, val salary :Int) : Parcelable {

}