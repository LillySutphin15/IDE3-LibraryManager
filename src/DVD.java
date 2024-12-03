public class DVD extends LibraryItem{
    private int duration;

    //constructor
    public DVD(String title, String author, int yearPublished, int itemID, int duration){
        super(title, author, yearPublished, itemID);
        this.duration = duration;
    }

    //getter and setter for the duration
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration= duration;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Duration: " + duration + " minutes");

    }
}