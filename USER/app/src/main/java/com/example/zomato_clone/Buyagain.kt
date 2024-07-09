package com.example.zomato_clone

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Buyagain(
    private val buyagainfoodname: ArrayList<String>,
    private val buyagainfoodprice: ArrayList<String>,
    private val buyagainfoodimage: ArrayList<Int>
) : RecyclerView.Adapter<Buyagain.BuyagainViewHolder>(), Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.createStringArrayList() ?: arrayListOf(),
        parcel.createStringArrayList() ?: arrayListOf(),
        parcel.createIntArray()?.toList() as? ArrayList<Int> ?: arrayListOf()
    )

    class BuyagainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodName: TextView = itemView.findViewById(R.id.food_name)
        val foodPrice: TextView = itemView.findViewById(R.id.food_price)
        val foodImage: ImageView = itemView.findViewById(R.id.food_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuyagainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_buyagain, parent, false)
        return BuyagainViewHolder(view)
    }

    override fun onBindViewHolder(holder: BuyagainViewHolder, position: Int) {
        holder.foodName.text = buyagainfoodname[position]
        holder.foodPrice.text = buyagainfoodprice[position]
        holder.foodImage.setImageResource(buyagainfoodimage[position])
    }

    override fun getItemCount(): Int {
        return buyagainfoodname.size
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeStringList(buyagainfoodname)
        parcel.writeStringList(buyagainfoodprice)
        parcel.writeIntArray(buyagainfoodimage.toIntArray())
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
