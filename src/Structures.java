import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Structures {

    public static void main (String args[]){
        int matriz[][] = new int[3][3];

        HashMap<String, Object> map = new HashMap <String, Object> ();
        String a[] = {"Avila","Burgos","León","Palencia","Salamanca",
                "Segovia","Soria","Valladolid","Zamora"};

        Collection< Integer> collection = Arrays.asList(0, 1, 2, 3, 4);

        Iterable it = collection.iterable();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
