public class Bus 
{
    private String id;
    private String availability;
    Bus(String id,String availability)
    {
        this.id = id;
        this.availability = availability;
    }

    public String getId()
    {
        return id;
    }

    public String getAvailability() {
        return availability;
    }    
    
}
