package jalanechrissia.rivera.com.prelimoutputspotify

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Jalane Chrissia on 16/12/2017.
 */
data class Song (
        val title: String = "",
        val singer: String = "") : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()
    ){}

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(singer)
    }

    override fun describeContents(): Int {
        return 0
    }



}