package com.mercankrcby;

/**
 * Created by Mercan on 18.12.2017.
 */
public class StaffAssignmentAlg {
    public int currentEmployeeCount;
    public PassengerType passType;


    public StaffAssignmentAlg() {
    }

    public StaffAssignmentAlg(int currentEmployeeCount, PassengerType passType) {
        this.currentEmployeeCount = currentEmployeeCount;
        this.passType = passType;
    }
    //TO DO:Look Again
    public void flowOfAlgorithm() {
        EmployeeType empType = new EmployeeType();
        empType.assingEmp(currentEmployeeCount);
        empType=patientPassOp(passType,empType);
        empType=accomChildPassOp(passType,empType);
        empType=groupPassOp(passType,empType);
        for(int i=empType.normalEmp;i>0;i--)
        {
            if(passType.getBCPassCount()>0)
            {
                empType.normalEmp-=1;
                passType.BCPassCount-=5;
            }
            if(passType.getECPassCount()>0)
            {
                empType.normalEmp-=1;
                passType.ECPassCount-=15;
            }
        }
    }
    public EmployeeType patientPassOp(PassengerType passType,EmployeeType empType){
        if(passType.getPatientPassCount()>0)
        {
            empType.patientResponsibleEmp-=passType.getPatientPassCount();
        }
        return empType;
    }
    public EmployeeType accomChildPassOp(PassengerType passType,EmployeeType empType)
    {
        if(passType.getUnaccomChildPassCount()>0)
        {
            empType.normalEmp-=passType.getUnaccomChildPassCount();
        }
        return empType;
    }
    public EmployeeType groupPassOp(PassengerType passType,EmployeeType empType){
        if(passType.getgPassCount()>0)
        {
            empType.normalEmp-=passType.getgPassCount();
        }
        return empType;
    }
}

