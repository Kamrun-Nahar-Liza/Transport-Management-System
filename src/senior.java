class senior extends Driver
{
    senior(String id,String name,String phone,String shift,String date,String route,double working_hour)
    {
        super(id,name,phone,shift,date,route,working_hour);
    }
    double calculate_salary()
    {
        double salary = gethour()*80;
        return salary;
    }
    double annual_salary()
    {
        double ansalary = calculate_salary()*12;
        return ansalary;
    }
    double calculate_bonus()
    {
        double bonus = calculate_salary()*.1;
        return bonus;
    }
    String check_schedule()
    {
        return "";
    }
}
