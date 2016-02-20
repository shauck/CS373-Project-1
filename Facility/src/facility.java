/**
 * Created by samhauck on 2/8/16.
 */

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.sql.*;


public class Facility {
    public String facilityName;
    public String facilityManager;
    public String maintenenceSchedule; //not sure on type
    public Float usageRate;

    public object getFacilityInformation(){
        return facilityName;
        return facilityManager;
        return maintenenceSchedule;
        return usageRate;
    }

    public object addNewFacility(){

    }

    public Facility (String name, int num, String manager, String schedule) {
        this.facilityName = name;
        this.facilityManager = manager;
        this.maintenenceSchedule = schedule;

    }
}

