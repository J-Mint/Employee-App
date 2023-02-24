
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee
{
    // The age of the employee
    private int age;
    // The number of days holiday the employee is entitled to
    private int numHolidays;
    // The name of this employee
    private String name;
    // The payscale of this employee
    private int payscale;
    
    private Employee mentor;
    
    private String address;


    /**
     * Constructor for objects of class Employee
     */
    public Employee(String givenName, int givenAge)
    {
        name = givenName;
        age = givenAge;
        numHolidays = 10;
        payscale = 1;
    }

    public String getName() {
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getNumHolidays(){
        return numHolidays;
    }

    public int getPayscale(){
        return payscale;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setNumHolidays(int updateNumHolidays){
        numHolidays = updateNumHolidays;
    }
    
    public void promote(){
        payscale ++;
    }
    
    public void increaseAge(){
        age ++;
    }
    
    public void setMentor(Employee mentorName){
        mentor = mentorName;
    }
    
    public Employee getMentor(){
        return mentor;
    }
    
    public void setAddress(int houseNumber, String roadName){
        address = houseNumber + " " + roadName;
    }
    
    public String getAddress(){
        return address;
    }
        
    
    
}
