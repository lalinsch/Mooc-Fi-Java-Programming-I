
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here 
       ArrayList<Integer> list = new ArrayList();
       list.add(1);
       list.add(3);
       list.add(5);
       
        System.out.println(sum(list));;
        
    }
    
    public static int sum(ArrayList<Integer> nums){
        int sum = 0;
        for (int item : nums){
            sum += item;
        }
        return sum;
    }

}
