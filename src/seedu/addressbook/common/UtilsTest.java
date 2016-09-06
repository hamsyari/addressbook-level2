package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {
    
    @Test
    public void testNullItems(){
        Object[] objArray = new Object[] {null, null, null};
        assertEquals(true, Utils.isAnyNull(objArray));
    }
    
    @Test
    public void testNoNullItems(){
        Object[] objArray = new Object[] {new Object(), new Object(), new Object()};
        assertEquals(false, Utils.isAnyNull(objArray));
    }
    
    @Test
    public void testUniqueItems(){
        ArrayList<String> sampleArrayList = new ArrayList();
        sampleArrayList.add("Item 1");
        sampleArrayList.add("Item 2");
        sampleArrayList.add("Item 3");
        assertEquals(true, Utils.elementsAreUnique(sampleArrayList));
    }
    
    @Test
    public void testNonUniqueItems(){
        ArrayList<String> sampleArrayList = new ArrayList();
        sampleArrayList.add("Item 1");
        sampleArrayList.add("Item 1");
        sampleArrayList.add("Item 1");
        assertEquals(true, Utils.elementsAreUnique(sampleArrayList));
    }
}
