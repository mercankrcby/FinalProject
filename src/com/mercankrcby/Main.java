package com.mercankrcby;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jxl.read.biff.BiffException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, BiffException {
        // write your code here
        ExcelDataRead ExcelReader=new ExcelDataRead("/Users/macboookair/Desktop/deneme.xls");
        ArrayList<FlightData> fDataList = new ArrayList<FlightData>();
        fDataList=ExcelReader.ExceldenOku();

        for(int i=0;i<fDataList.size();++i)
        {
            FlightOperationsControl fOpControl=new FlightOperationsControl();
            String controlResult=fOpControl.desicionFlightSituation(fDataList.get(i)).toString();
            System.out.println(controlResult);
            fOpControl.assignStatus(fDataList.get(i));
            //System.out.println(fDataList.get(i).status);
            //System.out.println(controlResult);
            //fOpControl.assignWorkerForPassenger(fDataList.get(i));
        }
        /*
        try {
            ExcelReader.ExceldenOku();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }*/
    }
}

