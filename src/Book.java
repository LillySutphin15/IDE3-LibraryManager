public class Book extends LibraryItem{
    private int numPages;

    //constructor

    public Book(String title, String author, int yearPublished, int itemID, int numPages) {
        super(title, author, yearPublished, itemID);
        this.numPages = numPages;
    }

    //getter and setter for numpages
    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public void displayInfo(){

        super.displayInfo();

        System.out.println("Number of Pages: " + numPages);


    }
}