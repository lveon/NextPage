
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.HashSet;

public class TestArrayListHW {


    @BeforeMethod
    public void viewTrueArray () {

        ArrayListHW array = new ArrayListHW();
        System.out.println("Первоначальный массив для наглядности");
        System.out.println(array.createArrayList());
    }



    @Test
    public void checkDeleting () {

        ArrayListHW array = new ArrayListHW();
        System.out.println("Массив после удаления конкретного символа");
        Assert.assertFalse( array.deleteArrayValue(array.createArrayList(), "E").contains("E"));
        System.out.println("_______________________________________________________________________");
    }


    @Test

    public void checkUniqueArrayValues() {

        ArrayListHW array = new ArrayListHW();
        System.out.println("Количество уникальных символов: "+ new HashSet<String>(array.createArrayList()).size());
        Assert.assertEquals(new HashSet<String>(array.createArrayList()).size(), array.uniqueValues(array.createArrayList()).size());
        System.out.println("_______________________________________________________________________");
    }









}
