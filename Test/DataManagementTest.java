import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Hodei Eceiza
 * Date: 10/10/2020
 * Time: 14:40
 * Project: Inlämningsuppgift2
 * Copyright: MIT
 */
class DataManagementTest {
DataManagement test=new DataManagement();
    @Test
    void splitData() {
        test.splitData("8512021234, Chamade Coriola ");
        assertEquals(test.getId(),"8512021234");
        assertEquals(test.getName(),"Chamade");
        assertEquals(test.getSurname(),"Coriola");
    }
}