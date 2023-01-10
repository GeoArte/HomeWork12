public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author auther, int year)
    {
        this.name = name;
        this.author = auther;
        this.year = year;
    }
    public String getName()
    {
        return this.name;
    }
    public Author getAuthor()
    {
        return this.author;
    }
    public int getYear()
    {
        return this.year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
}

