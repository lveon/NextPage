import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashSet;

public class Testing {


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
    //Assert.assertFalse( array.deleteArrayValue(array.createArrayList(), "E").contains(null));
    System.out.println("_______________________________________________________________________");
}


@Test

    public void checkUniqueArrayValues() {

    ArrayListHW array = new ArrayListHW();

    System.out.println("Количество уникальных символов: "+ new HashSet<String>(array.createArrayList()).size());
    Assert.assertEquals(new HashSet<String>(array.createArrayList()).size(), array.uniqueValues(array.createArrayList()).size());
    System.out.println("_______________________________________________________________________");
}









/*
    @BeforeTest
    public void info() {
        System.out.println("Pivas");
    }

    @BeforeMethod


    public void info1() {
        System.out.println("Pivas");
    }

    @Test
    public void checkSum() {


        Calc x = new Calc();


        Assert.assertEquals(x.sum(5), 10);

    }


    @Test
    public void checkSum1() {

        Calc x = new Calc();
        Assert.assertTrue(x.sum(5) == 10);

    }*/
}
