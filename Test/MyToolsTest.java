import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Hodei Eceiza
 * Date: 10/8/2020
 * Time: 14:50
 * Project: Inlämningsuppgift2
 * Copyright: MIT
 */
class MyToolsTest {
    DataManagement c=new DataManagement();
    @Test
    public void datesYearDistanceTest(){
        assertTrue(MyTools.dateRangeInsideYear("2020-01-08","2020-08-08"));
        assertTrue(MyTools.dateRangeInsideYear("2020-01-08","2021-01-07"));
        assertFalse(MyTools.dateRangeInsideYear("2010-01-08","2020-08-19"));
        assertFalse(MyTools.dateRangeInsideYear("","2020-02-19"));
    }
    @Test
    public void findInStringTest(){
        assertEquals(MyTools.findInString(" Chamade Coriola ","Chamade")," Chamade Coriola ");
       assertEquals(MyTools.findInString(" Chamade Coriola ","chamade")," Chamade Coriola ");
        assertEquals(MyTools.findInString(" Chamade Coriola ","coriola")," Chamade Coriola ");
        assertEquals(MyTools.findInString(" Chamade Coriola ","CORIOLA")," Chamade Coriola ");
    }
    @Test
    public void findInLineTest()
    {
        assertEquals(MyTools.findInLine("8512021234, Chamade Coriola ","chamade coriola"),"8512021234, Chamade Coriola ");
        assertEquals(MyTools.findInLine("8512021234, Chamade Coriola ","CHAMADE coriola"),"8512021234, Chamade Coriola ");
        assertEquals(MyTools.findInLine("8512021234, Chamade Coriola ","8512021234"),"8512021234, Chamade Coriola ");
        assertEquals(MyTools.findInLine("8512021234, Chamade Coriola ","chamade"),"8512021234, Chamade Coriola ");
        assertEquals(MyTools.findInLine("8512021234, Chamade Coriola ","coriola"),"8512021234, Chamade Coriola ");
        assertEquals(MyTools.findInLine("8512021234, Chamade Coriola ","cor ila"),null);
        assertEquals(MyTools.findInLine("8512021234, Chamade Coriola "," "),null);
        assertEquals(MyTools.findInLine("8512021234, Chamade Coriola ","85"),null);
        assertEquals(MyTools.findInLine("8512021234, Chamade Coriola ","chamadecoriola"),null);
    }


    @Test
    public void getIndexOfFoundTest(){
        ArrayList<String>listTest=new ArrayList<>();
        listTest.add("7605021234, Elmer Ekorrsson");
        listTest.add("2010-04-07");
        listTest.add("7911061234, Fritjoff Flacon");
        listTest.add("1999-12-16");

        assertEquals(MyTools.getIndexOfFound(listTest,"Fritjoff Flacon"),2);
       assertEquals(MyTools.getIndexOfFound(listTest,"7605021234"),0);
        assertEquals(MyTools.getIndexOfFound(listTest,"elmer"),0);
        assertEquals(MyTools.getIndexOfFound(listTest,"fritjoff"),2);
        assertEquals(MyTools.getIndexOfFound(listTest,"frij"),-1);


    }

}