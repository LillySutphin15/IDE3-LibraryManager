public class Magazine extends LibraryItem{
    private String issueFrequency;

    //constructor
    public Magazine(String title, String author, int yearPublished, int itemID, String issueFrquency){
        super(title, author, yearPublished, itemID);
        this.issueFrequency = issueFrquency;
    }
    //getters and setters for issueFrenquency
    public String getIssueFrequency(){
        return issueFrequency;
    }
    public void setIssueFrequency(String issueFrequency){
        this.issueFrequency = issueFrequency;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Issue Frequency: " + issueFrequency);


    }

}
