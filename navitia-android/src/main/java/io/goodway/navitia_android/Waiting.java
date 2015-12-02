package io.goodway.navitia_android;

import android.os.Parcel;

/**
 * @author Alexis Robin
 * @version 0.6
 * Licensed under the Apache2 license
 */
public class Waiting extends WayPart {

    protected Waiting(double co2Emission, String departureDateTime, String arrivalDateTime, int duration) {
        super("Waiting", co2Emission, departureDateTime, arrivalDateTime, duration);
    }

    protected Waiting(Parcel in){
        super(in);
    }

    @Override
    public String toString(){
        return "Attendre " + DataConverter.convertDurationToTime(this.getDuration());
    }

    @Override
    public void updateDuration(Coordinate c){

    }

    public static final Creator CREATOR =
            new Creator() {
                @Override
                public Object createFromParcel(Parcel in) {
                    return new Waiting(in) {
                    };
                }

                public Waiting[] newArray(int size) {
                    return new Waiting[size];
                }
            };
}
