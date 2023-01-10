public class Author
{
    private String firstName;
    private String lastName;
    private String fullName;

    public Author(String firstName, String  lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = (this.firstName + " " + this.lastName);
    }

    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getFullName()
    {
        return this.fullName;
    }
}
