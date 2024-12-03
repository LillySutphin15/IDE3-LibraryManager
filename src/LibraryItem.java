
public abstract class LibraryItem {
    private String title;
    private String author;
    private int yearPublished;
    private int itemID;
    public LibraryItem(String title, String author, int yearPublished, int itemID)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.itemID = itemID;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Item ID: " + itemID);
    }
}
