package com.example.xoxo

import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class Buyagain(private val buyagainfoodname:ArrayList<String>,private val buyagainfoodprice:ArrayList<String>, private val buyagainfoodimage:ArrayList<Int>: RecyclerView.Adapter<Buyagain.Buyagainviewholder>) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        TODO("buyagainfoodname"),
        TODO("buyagainfoodprice"),
        TODO("buyagainfoodimage"),
        TODO("null")
    ) {
    }

    class Buyagainviewholder {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Buyagain> {
        override fun createFromParcel(parcel: Parcel): Buyagain {
            return Buyagain(parcel)
        }

        override fun newArray(size: Int): Array<Buyagain?> {
            return arrayOfNulls(size)
        }
    }

}