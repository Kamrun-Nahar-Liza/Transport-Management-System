public class Air 
{
    private String id;
    private String availability;
    Air(String id,String availability)
    {
        this.id = id;
        this.availability = availability;
    }

    public String getId() 
    {
        return id;
    }

    public String getAvailability() 
    {
        return availability;
    }
    
}
