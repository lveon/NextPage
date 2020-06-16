import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class ArrayListHW {


    public ArrayList deleteArrayValue(ArrayList enterArray, String enterWord) {
        enterArray.removeAll(Collections.singleton(enterWord));
        System.out.println(enterArray);
        return enterArray;
    }

public ArrayList<String> createArrayList () {
    ArrayList<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("C");
    list.add("E");
    list.add("A");
    list.add("W");
    list.add("D");

return list;

}
public ArrayList<String> returnArray (){
    System.out.println(createArrayList());
    return createArrayList();
}


    public  Set<String> uniqueValues(ArrayList enterArray) {


        Set<String> uniqueArrayValues = new HashSet<String>(enterArray);
      //  System.out.println("Unique values: " + uniqueArrayValues.size());

        return uniqueArrayValues;
    }



}