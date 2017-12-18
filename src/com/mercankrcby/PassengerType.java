package com.mercankrcby;

/**
 * Created by macboookair on 18.12.2017.
 */
public class PassengerType {
    public int BCPassCount;
    public int ECPassCount;
    public int patientPassCount;
    public int unaccomChildPassCount;
    public int gPassCount;

    public PassengerType(int BCPassCount, int ECPassCount, int patientPassCount, int unaccomChildPassCount, int gPassCount) {
        this.BCPassCount = BCPassCount;
        this.ECPassCount = ECPassCount;
        this.patientPassCount = patientPassCount;
        this.unaccomChildPassCount = unaccomChildPassCount;
        this.gPassCount = gPassCount;
    }

    public void setBCPassCount(int BCPassCount) {
        this.BCPassCount = BCPassCount;
    }

    public void setECPassCount(int ECPassCount) {
        this.ECPassCount = ECPassCount;
    }

    public void setPatientPassCount(int patientPassCount) {
        this.patientPassCount = patientPassCount;
    }

    public void setUnaccomChildPassCount(int unaccomChildPassCount) {
        this.unaccomChildPassCount = unaccomChildPassCount;
    }

    public void setgPassCount(int gPassCount) {
        this.gPassCount = gPassCount;
    }

    public int getBCPassCount() {
        return BCPassCount;
    }

    public int getECPassCount() {
        return ECPassCount;
    }

    public int getPatientPassCount() {
        return patientPassCount;
    }

    public int getUnaccomChildPassCount() {
        return unaccomChildPassCount;
    }

    public int getgPassCount() {
        return gPassCount;
    }
}
