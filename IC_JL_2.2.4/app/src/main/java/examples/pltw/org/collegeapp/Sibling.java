package examples.pltw.org.collegeapp;

/**
 * Created by justi on 1/30/2018.
 */

public class Sibling extends FamilyMember { //step 34

    public Sibling() { //step 40
        super();
    }

    public Sibling(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String toString() //step 39
    {
        return ("Sibling: " + getFirstName() + " " + getLastName());
    }
}
