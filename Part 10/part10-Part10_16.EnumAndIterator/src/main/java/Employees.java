
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author laloschjetnan
 */
public class Employees {
    //instance variable for employees class
   private ArrayList<Person> employeeList;
   
   //constroctor
   public Employees(){
       this.employeeList = new ArrayList<>();
   }
   
   //adds a person or a group of person to the list
   public void add(Person person){
       this.employeeList.add(person);
   }
   
   public void add(List<Person> peopleToAdd){
       for(Person p : peopleToAdd){
           this.employeeList.add(p);
       }
   }
   
   //prints all the elements of the list using an iterator
   public void print(){
       Iterator<Person> iterator = employeeList.iterator(); //creates the iterator
       while(iterator.hasNext()){ //checks that the list has a next object
           Person nextPerson = iterator.next(); //sets a person to the next object
           System.out.println(nextPerson); //prints the person
       }
   }
   
   //prints all the persosn with a certain education degree usign iterator
   public void print(Education education){
       Iterator<Person> iterator = employeeList.iterator();
       while(iterator.hasNext()){
           Person nextPerson = iterator.next();
           if(nextPerson.getEducation() == education){
               System.out.println(nextPerson);
           }
       }
   }
   
   //Removes all persons based on an education level
   public void fire(Education education){
       Iterator <Person> iterator = employeeList.iterator();
       while(iterator.hasNext()){
           if(iterator.next().getEducation() == education){
               iterator.remove();
           }
       }
   }

}
