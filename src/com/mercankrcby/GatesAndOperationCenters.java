package com.mercankrcby;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mercan on 18.12.2017.
 */
public class GatesAndOperationCenters {
    public int gateNumber;
    public String operationCenterName;
    public int distance;
    public ArrayList gateToOperationCenter;
    public ArrayList operationCenterToGate;
    public int groupBound=5;
    public final int groupOneStartGate=100;
    public final int groupTwoStartGate=200;
    public final int groupThreeStartGate=300;
    public final int groupFourStartGate=400;
    public final int groupFiveStartGate=500;
    public final int pasaportToCheckIn=200;
    public final int checkInToLuggage=250;
    public GatesAndOperationCenters(int gNumber,String oCenterN,int distance)
    {
        this.gateNumber=gNumber;
        this.operationCenterName=oCenterN;
        this.distance=distance;
    }
    public GatesAndOperationCenters(){
        gateToOperationCenter=new ArrayList<GatesAndOperationCenters>();
        operationCenterToGate=new ArrayList<GatesAndOperationCenters>();
    }
    public ArrayList<GatesAndOperationCenters> fillGateOCList()
    {
        for(int i=0;i<groupBound;++i) {
            gateToOperationCenter.add(new GatesAndOperationCenters(groupOneStartGate+i, OperationCenter.PasaportControlCenter.toString(),100));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupOneStartGate+i, OperationCenter.CheckInCenter.toString(),250));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupOneStartGate+i, OperationCenter.LuggageTakingCenter.toString(),200));
        }
        for(int i=0;i<groupBound;++i)
        {
            gateToOperationCenter.add(new GatesAndOperationCenters(groupTwoStartGate+i,OperationCenter.PasaportControlCenter.toString(),200));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupTwoStartGate+i,OperationCenter.CheckInCenter.toString(),200));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupTwoStartGate+i,OperationCenter.LuggageTakingCenter.toString(),200));
        }
        for(int i=0;i<groupBound;++i)
        {
            gateToOperationCenter.add(new GatesAndOperationCenters(groupThreeStartGate+i,OperationCenter.PasaportControlCenter.toString(),250));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupThreeStartGate+i,OperationCenter.CheckInCenter.toString(),250));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupThreeStartGate+i,OperationCenter.LuggageTakingCenter.toString(),250));
        }
        for(int i=0;i<groupBound;++i)
        {
            gateToOperationCenter.add(new GatesAndOperationCenters(groupFourStartGate+i,OperationCenter.PasaportControlCenter.toString(),150));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupFourStartGate+i,OperationCenter.CheckInCenter.toString(),150));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupFourStartGate+i,OperationCenter.LuggageTakingCenter.toString(),150));
        }
        for(int i=0;i<groupBound;++i)
        {
            gateToOperationCenter.add(new GatesAndOperationCenters(groupFiveStartGate+i,OperationCenter.PasaportControlCenter.toString(),400));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupFiveStartGate+i,OperationCenter.CheckInCenter.toString(),400));
            gateToOperationCenter.add(new GatesAndOperationCenters(groupFiveStartGate+i,OperationCenter.LuggageTakingCenter.toString(),400));
        }
        return gateToOperationCenter;
    }
    public enum OperationCenter{
        PasaportControlCenter,
        CheckInCenter,
        LuggageTakingCenter
    }

}
