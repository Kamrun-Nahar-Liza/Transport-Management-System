
import java.util.ArrayList;

public class Manager 
{
    private String id;
    private String name;
    private String phone;
    private String transport_type;
    Manager(String id,String name,String phone,String transport_type)
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.transport_type = transport_type;
    }
    String approve_salary(Pilot p)
    {
        if(p.getid().equals("R12"))
        {
            String salary = "approved";
            return salary;
        }
        else
        {
            String salary = "Wrong selection";
            return salary;
        }
    }
    String approve_salary(Co_pilot cp)
    {
        if(cp.getid().equals("s12"))
        {
            String salary = "approved";
            return salary;
        }
        else
        {
            String salary = "Wrong selection";
            return salary;
        }
    }
    String approve_salary(Sailor s)
    {
        if(s.getid().equals("j12"))
        {
            String salary = "approved";
            return salary;
        }
        else
        {
            String salary = "Wrong selection";
            return salary;
        }
    }
    String approve_salary(senior ds)
    {
        if(ds.getid().equals("e12"))
        {
            String salary = "approved";
            return salary;
        }
        else
        {
            String salary = "Wrong selection";
            return salary;
        }
    }
    String approve_salary(Junior j)
    {
        if(j.getid().equals("n12"))
        {
            String salary = "approved";
            return salary;
        }
        else
        {
            String salary = "Wrong selection";
            return salary;
        }
    }
    ArrayList <senior> seniordriverlist = new ArrayList();
    ArrayList <Junior> juniordriverlist = new ArrayList();
    ArrayList <Pilot> pilotlist = new ArrayList();
    ArrayList <Co_pilot> copilotlist = new ArrayList();
    ArrayList <Sailor> sailorlist = new ArrayList(); 
    
    String result;
    String check_driverlist(ArrayList <senior> seniordriverlist)
    {    
        for(senior sdl1 : seniordriverlist)
        {
            result = "Checking Arraylist";    
        } 
        return result;
    }
    ArrayList <Conductor> conductorlist = new ArrayList();
    ArrayList <AirHostage> airhosatgelist = new ArrayList();
    ArrayList <TicketChecker> ticketchekerlist = new ArrayList();
    String check_conductorlist(ArrayList <Conductor> conductorlist)
    {
        for(Conductor c : conductorlist)
        {
            result = "checking arraylist";
        } 
        return result;
    }
    String check_availability(Bus b)
    {
        if(b.getId().equals("k3"))
        {
            String Transport = "Available";
            return Transport;
        }
        else
        {
            String Transport = "Not Available";
            return Transport;
        }
    }
    String check_availability(Air a)
    {
        if(a.getId().equals("bd3"))
        {
            String Transport = "Available";
            return Transport;
        }
        else
        {
            String Transport = "Not Available";
            return Transport;
        }
    }
    String check_availability(Train t)
    {
        if(t.getId().equals("t3"))
        {
            String Transport = "Available";
            return Transport;
        }
        else
        {
            String Transport = "Not Available";
            return Transport;
        }
    }
    String check_availability(Ship s)
    {
        if(s.getId().equals("ss3"))
        {
            String Transport = "Available";
            return Transport;
        }
        else
        {
            String Transport = "Not Available";
            return Transport;
        }
    }
    
    double bill;
    double calculate_earn_per_day(Ticket t)
    {
        bill = t.getPrice()*t.getTicket_num();
        return bill;
    }
    double expense;
    double calculate_expense_per_day(Ticket t)
    {
        expense = t.getCost()*t.getKm();
        return expense;
    }
    double calculate_savings_per_day()
    {
        double savings = bill - expense;
        return  savings;
    }
}
