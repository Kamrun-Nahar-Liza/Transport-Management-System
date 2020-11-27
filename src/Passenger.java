public class Passenger 
{
    private String name;
    private String phone;
    private String time;
    private String start_point;
    private String end_point;
    Passenger(String name,String phone,String time,String start_point,String end_point)
    {
        this.name = name;
        this.phone = phone;
        this.time = time;
        this.start_point = start_point;
        this.end_point = end_point;
    }
    String buy_ticket(Bus b)
    {
        if(b.getAvailability().equals("yes"))
        {
            String availability = "You can bought ticket";
            return availability;
        }
        else
        {
            String availability = "You can not bought ticket";
            return availability;
        }
    }
    String buy_ticket(Air a)
    {
        if(a.getAvailability().equals("yes"))
        {
            String availability = "You can bought ticket";
            return availability;
        }
        else
        {
            String availability = "You can not bought ticket";
            return availability;
        }
    }
    String buy_ticket(Train t)
    {
        if(t.getAvailability().equals("yes"))
        {
            String availability = "You can bought ticket";
            return availability;
        }
        else
        {
            String availability = "You can not bought ticket";
            return availability;
        }
    }
    String buy_ticket(Ship sh)
    {
        if(sh.getAvailability().equals("yes"))
        {
            String availability = "You can bought ticket";
            return availability;
        }
        else
        {
            String availability = "You can not bought ticket";
            return availability;
        }
    }
}
