package com.mercankrcby;

/**
 * Created by Mercan on 18.12.2017.
 */
public class EmployeeType {
    public int patientResponsibleEmp;
    public int normalEmp;
    public EmployeeType(){}
    public int assingEmp(int employeeCount){
        if(employeeCount<=15)
        {
            patientResponsibleEmp=1;
        }
        else{
            if(employeeCount%15==0)
            {
                patientResponsibleEmp=employeeCount/15;
            }
            else {
                patientResponsibleEmp = employeeCount % 15 + 1;
            }
        }
        normalEmp=employeeCount-patientResponsibleEmp;
        return normalEmp;
    }
}
