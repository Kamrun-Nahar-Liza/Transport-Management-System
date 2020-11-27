public class Ticket 
{
    private String id;
    private double price;
    private int ticket_num;
    private double cost;
    private double km;
    Ticket(String id,double price,int ticket_num,double cost,double km)
    {
        this.id = id;
        this.price = price;
        this.ticket_num = ticket_num;
        this.cost = cost;
        this.km = km;
    }
    public String getId() 
    {
        return id;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getTicket_num() 
    {
        return ticket_num;
    }   

    public double getCost() 
    {
        return cost;
    }

    public double getKm() 
    {
        return km;
    }
    
}
