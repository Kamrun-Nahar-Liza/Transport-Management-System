class AirHostage extends Conductor
{
    AirHostage(String id,String name,String phone,String shift,String date,String route,double working_hour)
    {
        super(id,name,phone,shift,date,route,working_hour);
    }
    double calculate_salary()
    {
        double salary = getwhour()*100;
        return salary;
    }
    double annual_salary()
    {
        double ansalary = calculate_salary()*12;
        return ansalary;
    }
    double calculate_bonus()
    {
        double bonus = calculate_salary()*.2;
        return bonus;
    }
    void check_schedule()
    {
        if(getid().equals(""))
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
        if(getid().equals(""))
        {
            System.out.println("You are under .... Pilot");
        }
        else
        {
            System.out.println("Wrong selection");
        }
    }
    void check_ticket_availability(Air a)
    {
        if(a.getId().equals(""))
        {
            System.out.println("");
        }
        else
        {
            System.out.println("Wrong selection");
        }
    }
}
