package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class SimilarNameTest {

    @Test
    public void otherName_isNull() throws IllegalValueException {
        Name name = new Name("Muhammad Hamsyari Bin Rozman");
        assertFalse(name.isSimilar(null));
    }
    
    @Test
    public void otherName_NotSimilar() throws IllegalValueException {
        Name thisName = new Name("Muhammad Hamsyari Bin Rozman");
        Name otherName = new Name("Fake Name");
        assertFalse(thisName.isSimilar(otherName));
    }
    
    @Test
    public void otherName_Similar() throws IllegalValueException {
        Name thisName = new Name("Muhammad Hamsyari Bin Rozman");
        Name otherName = new Name("Muhammad Hamsyari Bin Rozman");
        assertTrue(thisName.isSimilar(otherName));
    }
    
    @Test
    public void otherName_SimilarDifferentCase() throws IllegalValueException {
        Name thisName = new Name("Muhammad Hamsyari Bin Rozman");
        Name otherName = new Name("MuHamMad hAmsYArI bIN ROzmAn");
        assertTrue(thisName.isSimilar(otherName));
    }
    
    @Test
    public void otherName_subsetName() throws IllegalValueException {
        Name thisName = new Name("Muhammad Hamsyari Bin Rozman");
        Name otherName = new Name("Hamsyari");
        assertFalse(thisName.isSimilar(otherName));
    }
}
