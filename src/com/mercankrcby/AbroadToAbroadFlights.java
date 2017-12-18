package com.mercankrcby;

import java.util.ArrayList;

/**
 * Created by Mercan on 18.12.2017.
 */
public class AbroadToAbroadFlights extends FlightType{
    public GatesAndOperationCenters goc;
    public ArrayList<GatesAndOperationCenters> gocList;
    public AbroadToAbroadFlights(int arrivalGateNumber,int departureGateNumber) {
        this.gateNumberArrival=arrivalGateNumber;
        this.gateNumberDeparture=departureGateNumber;
    }
    public void Operation()
    {
        int distance=0;
        goc=new GatesAndOperationCenters();
        gocList=new ArrayList<GatesAndOperationCenters>();
        gocList=goc.fillGateOCList();
        for(int i=0;i<gocList.size();++i)
        {
            if(gocList.get(i).gateNumber==gateNumberArrival && gocList.get(i).operationCenterName=="CheckInCenter")
            {
                distance+=gocList.get(i).distance;
            }
        }
        for(int i=0;i<gocList.size();++i)
        {
            if(gocList.get(i).gateNumber==gateNumberDeparture && gocList.get(i).operationCenterName=="CheckInCenter")
            {
                distance+=gocList.get(i).distance;
            }
        }
    }
}
