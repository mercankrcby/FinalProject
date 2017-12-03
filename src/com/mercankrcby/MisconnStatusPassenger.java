package com.mercankrcby;

/**
 * Created by macboookair on 3.12.2017.
 */
public class MisconnStatusPassenger {
    int BCPassengerCount;
    int ECPassengerCount;

    public MisconnStatusPassenger()
    {}
    public MisconnStatusPassenger(int BCPassengerCount, int ECPassengerCount) {
        this.BCPassengerCount = BCPassengerCount;
        this.ECPassengerCount = ECPassengerCount;
    }

    public int getBCPassengerCount() {
        return BCPassengerCount;
    }

    public void setBCPassengerCount(int BCPassengerCount) {
        this.BCPassengerCount = BCPassengerCount;
    }

    public int getECPassengerCount() {
        return ECPassengerCount;
    }

    public void setECPassengerCount(int ECPassengerCount) {
        this.ECPassengerCount = ECPassengerCount;
    }
    //TO DO:Maliyet fonksiyonu tanımlanacak!
}
