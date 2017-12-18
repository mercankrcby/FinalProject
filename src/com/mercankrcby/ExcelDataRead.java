package com.mercankrcby;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;

import jxl.CellType;

import jxl.Sheet;

import jxl.Workbook;

import jxl.read.biff.BiffException;

public class ExcelDataRead {
    public ArrayList<FlightData> fDataList=new ArrayList<FlightData>();
    private String DosyaYolu;

    public ExcelDataRead(String dosyaYolu){

        this.DosyaYolu=dosyaYolu;
    }

    public void setExcelDostaYolu(String DosyaYolum){

        this.DosyaYolu=DosyaYolum;

    }

    public ArrayList<FlightData> ExceldenOku() throws IOException, BiffException{

        File DosyaExcel=new File(this.DosyaYolu);

        Workbook CalismaKitabi=Workbook.getWorkbook(DosyaExcel);

        Sheet ExcelSayfasi=CalismaKitabi.getSheet(0);


        ArrayList<Integer> BCPassList = new ArrayList<Integer>();
        ArrayList<Integer> ECPassList = new ArrayList<Integer>();
        ArrayList<Integer> workerCountList = new ArrayList<Integer>();
        ArrayList<Integer> patientPassList=new ArrayList<Integer>();
        ArrayList<Integer> unAccoPassList=new ArrayList<Integer>();
        ArrayList<Integer> gPassList=new ArrayList<Integer>();
        ArrayList<String> arrivalTimeList = new ArrayList<String>();
        ArrayList<String> departureTimeList = new ArrayList<String>();

        for(int j=0; j<ExcelSayfasi.getColumns(); j++){

            for(int i=0; i<ExcelSayfasi.getRows(); i++){

                Cell Hucre=ExcelSayfasi.getCell(j, i);

                if(j==0)
                {
                    int a=Integer.parseInt(Hucre.getContents());
                    BCPassList.add(a);
                }

                else if(j==1){
                    int a=Integer.parseInt(Hucre.getContents());
                    ECPassList.add(a);
                }

                else if(j==2){
                    int a=Integer.parseInt(Hucre.getContents());
                    workerCountList.add(a);
                }
                else if(j==3){
                    int a=Integer.parseInt(Hucre.getContents());
                    patientPassList.add(a);
                }
                else if(j==4){
                    int a=Integer.parseInt(Hucre.getContents());
                    unAccoPassList.add(a);
                }
                else if(j==5){
                    int a=Integer.parseInt(Hucre.getContents());
                    gPassList.add(a);
                }
                else if(j==6)
                {
                    String a = Hucre.getContents();
                    arrivalTimeList.add(a);
                }

                else{
                    String a = Hucre.getContents();
                    departureTimeList.add(a);
                }
                /*System.out.println(i+" . satir degeri : "+Hucre.getContents());*/
            }
            System.out.println();
        }
        System.out.println("Excel sayfasindan okuma islemi bitti !");
        for(int i=0;i<BCPassList.size();++i) {
            FlightData fDataObj= new FlightData();
            fDataObj.BCPassengerCount=BCPassList.get(i);
            fDataObj.ECPassengerCount=ECPassList.get(i);
            fDataObj.currentWorkerCount=workerCountList.get(i);
            fDataObj.arrivalTime=arrivalTimeList.get(i);
            fDataObj.departureTime=departureTimeList.get(i);
            fDataObj.patientPassengerCount=patientPassList.get(i);
            fDataObj.unaccompaniedChildPassengerCount=unAccoPassList.get(i);
            fDataObj.groupPassengerCount=gPassList.get(i);
            fDataList.add(fDataObj);
            System.out.println(fDataList.get(i).toString());
        }
        return fDataList;
    }
}

