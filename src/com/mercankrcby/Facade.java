package com.mercankrcby;

/**
 * Created by macboookair on 19.12.2017.
 */
public class Facade {

    FlightOperationsControl foc;
    WalkingDistanceAlgorithm wda;
    FlightScheduledAlgorithm fsa;
    StaffAssignmentAlg saa;
    Facade()
    {
        foc=new FlightOperationsControl();
        wda=new WalkingDistanceAlgorithm();
        fsa=new FlightScheduledAlgorithm();
        saa=new StaffAssignmentAlg();
    }
}
