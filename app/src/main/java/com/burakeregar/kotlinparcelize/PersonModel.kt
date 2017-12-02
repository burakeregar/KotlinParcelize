package com.burakeregar.kotlinparcelize

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Burak Eregar on 1.12.2017.
 * burakeregar@gmail.com
 * https://github.com/burakeregar
 */

@Parcelize
data class PersonModel(val name: String, val age: Int) : Parcelable