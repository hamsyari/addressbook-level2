package seedu.addressbook.data.person;

public class Contact {
    public String value;
    protected boolean isPrivate;

    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
    /**
     * Checks if a given string is a valid.
     */
    public boolean isValid(String value, String regex){
        return value.matches(regex);
    }
}
