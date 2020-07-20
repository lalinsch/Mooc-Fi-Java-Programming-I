/**
 *
 * @author laloschjetnan
 */

//Teacher extends person, and it has it's own salary variable
public class Teacher extends Person{
    private int salary;
    
    //the constructor includes the superclass variables and the subclass salary variable as a parameter
    public Teacher(String name, String address, int salary){
        super (name, address);
        this.salary = salary;
    }
    
    //utilises the toString method from Person and adds custom formatting to include the teachers salary
    @Override
    public String toString(){
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }

}
