package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {
    
    @Test
    public void testNullItems(){
        assertEquals(true, Utils.isAnyNull((Object) null));
    }
    
    @Test
    public void testNoNullItems(){
        assertEquals(false, Utils.isAnyNull(new Object()));
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
