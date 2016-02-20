/**
 * Created by samhauck on 2/20/16.
 */
public class Room extends Facility {
    public String roomType;
    public float usageRate;
    public boolean inUse;

    public r

    public Room (String name, String roomType, float usageRate, boolean inUse){
        this.facilityName = name;
        this.roomType = roomType;
        this.usageRate = usageRate;
        this.inUse = inUse;
    }

}
