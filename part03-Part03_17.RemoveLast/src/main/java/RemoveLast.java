
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("Hey");
        list.add("There");

        removeLast(list);
        System.out.println(list);

    }

    public static void removeLast(ArrayList<String> l) {
        if (l.size() == 0) {
            return;
        }
        l.remove(l.size() - 1);
    }

}
