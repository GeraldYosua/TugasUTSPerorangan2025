package com.gerald.yosua.tugasutsperorangan2025;


import android.os.Parcel;
import android.os.Parcelable;

public class Musisi implements Parcelable {
    private String nama, detail, foto, detail2, lahir, wafat;

    protected Musisi(Parcel in) {
        nama = in.readString();
        detail = in.readString();
        foto = in.readString();
        detail2 = in.readString();
        lahir = in.readString();
        wafat = in.readString();

    }

    public static final Parcelable.Creator<Musisi> CREATOR = new Parcelable.Creator<Musisi>() {
        @Override
        public Musisi createFromParcel(Parcel in) {
            return new Musisi(in);
        }

        @Override
        public Musisi[] newArray(int size) {
            return new Musisi[size];
        }
    };

    public Musisi() {

    }


    public String getNama() {

        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDetail2() {
        return detail2;
    }

    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }

    public String getLahir() {
        return lahir;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public String getWafat() {
        return wafat;
    }

    public void setWafat(String wafat) {
        this.wafat = wafat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nama);
        parcel.writeString(this.detail);
        parcel.writeString(this.foto);
        parcel.writeString(this.detail2);
        parcel.writeString(this.lahir);
        parcel.writeString(this.wafat);


    }
}
