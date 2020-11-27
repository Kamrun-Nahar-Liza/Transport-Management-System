class Business extends Passenger  implements Itask
{
    Business(String name,String phone,String time,String start_point,String end_point)
    {
        super(name,phone,time,start_point,end_point);
    }
    public String buy_ticket(Bus b)
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
    public String buy_ticket(Air a)
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
    public String buy_ticket(Train t)
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
    public String buy_ticket(Ship sh)
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
