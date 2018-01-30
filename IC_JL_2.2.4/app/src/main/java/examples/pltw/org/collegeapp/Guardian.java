package examples.pltw.org.collegeapp;

/**
 * Created by wdumas on 4/8/16.
 */
public class Guardian extends FamilyMember {
    private String occupation;

    public Guardian() {
        super();
        occupation = "unknown";
    }

    public Guardian(String firstName, String lastName) {
        super(firstName, lastName);
        occupation = "unknown";
    }

    public Guardian(String firstName, String lastName, String occupation) //step 35
    {
        super(firstName, lastName);
        this.occupation = occupation;
    }
    public String toString() //step 36
    {
        return ("Guardian: " + getFirstName() + " " + getLastName() + "\nOccupation: " + occupation );
    }
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
