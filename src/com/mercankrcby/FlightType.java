package com.mercankrcby;

/**
 * Created by Mercan on 18.12.2017.
 */
public abstract class FlightType {
    public int gateNumberArrival;
    public int gateNumberDeparture;

    public int getGateNumberArrival() {
        return gateNumberArrival;
    }

    public void setGateNumberArrival(int gateNumberArrival) {
        this.gateNumberArrival = gateNumberArrival;
    }

    public int getGateNumberDeparture() {
        return gateNumberDeparture;
    }

    public void setGateNumberDeparture(int gateNumberDeparture) {
        this.gateNumberDeparture = gateNumberDeparture;
    }
    public abstract void Operation();
}
