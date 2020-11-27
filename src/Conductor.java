public class Conductor 
{
    private String id;
    private String name;
    private String phone;
    private String shift;
    private String date;
    private String route;
    private double working_hour;
    Conductor(String id,String name,String phone,String shift,String date,String route,double working_hour)
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.shift = shift;
        this.date = date;
        this.route = route;
        this.working_hour = working_hour;
    }
    double getwhour()
    {
        return working_hour;
    }
    String getid()
    {
        return id;
    }
    void check_schedule()
    {
        if(id.equals(""))
        {
            System.out.println("Your schedule is ....");
        }
        else
        {
            System.out.println("Wrong selection");
        }
    }
    void check_driver()
    {
        if(id.equals(""))
        {
            System.out.println("You are under .... Driver");
        }
        else
        {
            System.out.println("Wrong selection");
        }
    }
    void check_ticket_availability(Bus b)
    {
        if(b.getId().equals(""))
        {
            System.out.println("");
        }
        else
        {
            System.out.println("Wrong selection");
        }
    }
    double calculate_salary()
    {
        double salary = working_hour*40;
        return salary;
    }
    double annual_salary()
    {
        double ansalary = calculate_salary()*12;
        return ansalary;
    }
    double calculate_bonus()
    {
        double bonus = calculate_salary()*.06;
        return bonus;
    }
    
}
