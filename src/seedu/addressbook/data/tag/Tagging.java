package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    
    private enum OperationType {
        ADD, REMOVE;
    }
    
    private Person person;
    private Tag tag;
    private String tagSymbol;
    
    private static final String ADD_SYMBOL = "+";
    private static final String DELETE_SYMBOL = "-";
    private static final String TAGGING_MESSAGE = "%1$s %2$s [%3$s]";
    
    public Tagging(Person person, Tag tag, OperationType operationType){
        this.person = person;
        this.tag = tag;
        
        if (operationType == OperationType.ADD){
            tagSymbol = ADD_SYMBOL;
        } else {
            tagSymbol = DELETE_SYMBOL;
        }
    }
    
    @Override
    public String toString(){
        return String.format(TAGGING_MESSAGE, tagSymbol, person.getName(), tag.tagName);
    }
    
}
