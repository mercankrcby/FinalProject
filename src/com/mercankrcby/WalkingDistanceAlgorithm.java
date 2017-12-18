package com.mercankrcby;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macboookair on 18.12.2017.
 */
public class WalkingDistanceAlgorithm {
    public int gateNumberArrival;
    public int gateNumberDeparture;
    public String flightNumber;
    //public List arrivalGateToOperationCenter;
    //public List operationCenterToDepartureGate;

    public WalkingDistanceAlgorithm(int gateNumberArrival, int gateNumberDeparture,String flightN) {
        this.gateNumberArrival = gateNumberArrival;
        this.gateNumberDeparture = gateNumberDeparture;
        this.flightNumber=flightN;
        //arrivalGateToOperationCenter=new ArrayList<Integer>();
        //operationCenterToDepartureGate=new ArrayList<Integer>();
    }
    public void determineOperations()
    {
        if(this.flightNumber.contains("TR1Y"))
        {
            FlightType fType=new DomesticToAbroadFlights(gateNumberArrival,gateNumberDeparture);
        }
        else if(this.flightNumber.contains("Y1Y")){
            FlightType fType=new AbroadToAbroadFlights(gateNumberArrival,gateNumberDeparture);
        }
        else if(this.flightNumber.contains("Y1G")){
            FlightType fType=new AbroadToBondedDomesticFlights(gateNumberArrival,gateNumberDeparture);
        }
        else{
            FlightType fType=new AbroadToUnbondedDomesticFilghts(gateNumberArrival,gateNumberDeparture);
        }
    }
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
}
