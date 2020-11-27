abstract class Driver 
{
    private String id;
    private String name;
    private String phone;
    private String shift;
    private String date;
    private String route;
    private double working_hour;
    Driver(String id,String name,String phone,String shift,String date,String route,double working_hour)
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.shift = shift;
        this.date = date;
        this.route = route;  
        this.working_hour = working_hour;
    }
    double gethour()
    {
        return working_hour;
    }
    String getid()
    {
        return id;
    }
    abstract double calculate_salary();
    abstract String check_schedule();
    abstract double annual_salary();
    abstract double calculate_bonus();
}
