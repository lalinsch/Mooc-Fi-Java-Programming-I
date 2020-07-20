
import java.util.ArrayList;

/**
 *
 * @author laloschjetnan
 */
public class Room {

    private ArrayList<Person> peopleInRoom;

    //constructor, inititates the peopleInRoom ArrayList
    public Room() {
        this.peopleInRoom = new ArrayList();
    }

    //adds Person object to the list
    public void add(Person person) {
        this.peopleInRoom.add(person);
    }

    //returns if ArrayList is empty or not
    public boolean isEmpty() {
        if (this.peopleInRoom.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    //returns a list of everyone in the room
    public ArrayList<Person> getPersons() {
        return this.peopleInRoom;
    }

    //this method returns the shortest person from a list
    public Person shortest() {
        //first checks if the room is empty
        if (this.peopleInRoom.isEmpty()) {
            return null;
        }

        //creates a new person variable and assigns it to the first person in the list
        Person shortestPerson = this.peopleInRoom.get(0);

        //then iterates through the list comparing heights, if a smaller height is found, 
        //it assigns it to the variable
        for (Person p : peopleInRoom) {
            if (p.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = p;
            }
        }
        return shortestPerson;
    }
    
    public Person take(){
        
        if (this.peopleInRoom.isEmpty()){
            return null;
        }
        //uses the shortest() method to find shortest person in list, then removes it from the list
        Person shortest = this.shortest();
        this.peopleInRoom.remove(shortest);
        return shortest;
    }

}
