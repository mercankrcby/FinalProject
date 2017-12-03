package com.mercankrcby;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Mercan on 2.12.2017.
 */
public class FlightOperationsControl {

    public enum FlightSituation{
        MISCONN,CRITICAL,SHORT;
    }



    public FlightOperationsControl()
    {}
    public FlightSituation desicionFlightSituation(FlightData fData)
    {
        Date arrivalDate = fData.stringToTime(fData.getArrivalTime());
        /*System.out.println("ArrivalDate Hours:"+arrivalDate.getHours());
        System.out.println("ArrivalDate Minutes:"+arrivalDate.getMinutes());*/
        Date departureDate = fData.stringToTime(fData.getDepartureTime());
        /*System.out.println("DepartureDate Hours:"+departureDate.getHours());
        System.out.println("DepartureDate Minutes:"+departureDate.getMinutes());*/
        if((arrivalDate.getHours() > departureDate.getHours()))
        {
            return FlightSituation.MISCONN;
        }
        else if(arrivalDate.getHours() == departureDate.getHours())
        {
            if(arrivalDate.getMinutes() > departureDate.getMinutes())
            {
                return FlightSituation.MISCONN;
            }
            else if(departureDate.getMinutes() - arrivalDate.getMinutes() >= 30)
            {
                if(!isThereWorkerCount(fData)){
                    return FlightSituation.MISCONN;
                }
                assignWorkerForCriticalSituation(fData);
                return FlightSituation.CRITICAL;
            }
        }
        return FlightSituation.SHORT;
    }
    public void assignWorkerForCriticalSituation(FlightData fData)
    {
        System.out.println("In Critical Situation , Assign Worker");
        System.out.println("Starting Time:"+fData.currentWorkerCount);
        for(int i=0;i<fData.BCPassengerCount;i+=5)
        {
            System.out.println("1 Worker for 5 Business Class Passenger");
            fData.currentWorkerCount--;
            fData.BCPassengerCount-=5;
        }
        for(int j=0;j<fData.ECPassengerCount;j+=10)
        {
            System.out.println("1 worker for 10 Economic Class Passenger");
            fData.currentWorkerCount--;
            fData.ECPassengerCount-=10;
            if(fData.currentWorkerCount==0)
            {
                System.out.println("Yeterli personel bulunmamaktadir.");
                break;
            }
        }
        MisconnStatusPassenger mPassengers = new MisconnStatusPassenger();
        if(fData.BCPassengerCount>0)
        {
            mPassengers.BCPassengerCount=fData.BCPassengerCount;
            System.out.println(mPassengers.getBCPassengerCount());
        }
        if(fData.ECPassengerCount>0)
        {
            mPassengers.ECPassengerCount=fData.ECPassengerCount;
            System.out.println(mPassengers.getECPassengerCount());
        }
        System.out.println("Finish Time :"+ fData.currentWorkerCount);
    }
    public boolean isThereWorkerCount(FlightData fData)
    {
        if(fData.getCurrentWorkerCount() > 0)
        {
            return true;
        }
        return false;
    }
    public void assignStatus(FlightData fData)
    {
        fData.status=fData.BCPassengerCount*3 + fData.ECPassengerCount;
    }

}
