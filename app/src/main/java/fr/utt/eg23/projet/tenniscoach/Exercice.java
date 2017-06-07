package fr.utt.eg23.projet.tenniscoach;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ANZAR on 07/06/2017.
 */

public class Exercice implements Parcelable {
    public String name, description;

    protected Exercice(Parcel in) {
        String[] data = new String[2];

        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.name = data[0];
        this.description = data[1];
    }

    public static final Creator<Exercice> CREATOR = new Creator<Exercice>() {
        @Override
        public Exercice createFromParcel(Parcel in) {
            return new Exercice(in);
        }

        @Override
        public Exercice[] newArray(int size) {
            return new Exercice[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {
                this.name,
                this.description});
    }

    public Exercice (String name, String desc){
        this.description=desc;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }


    public String toString(){
        return this.name;
    }
    public String getDesc(){
        return this.description;
    }
}
