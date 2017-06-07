package fr.utt.eg23.projet.tenniscoach;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ANZAR on 07/06/2017.
 */

public class Coup implements Parcelable {
    public String name;

    protected Coup(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Coup> CREATOR = new Creator<Coup>() {
        @Override
        public Coup createFromParcel(Parcel in) {
            return new Coup(in);
        }

        @Override
        public Coup[] newArray(int size) {
            return new Coup[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
    public Coup (String name){
        this.name=name;
    }
    public String toString(){
        return this.name;
    }
}
