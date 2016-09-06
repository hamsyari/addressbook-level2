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
}
