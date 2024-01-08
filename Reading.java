/*
Design and implement a set of classes that define various types
of reading material: books, novels, magazines, technical journals,
textbooks, and so on. Include data values that describe various
attributes of the material, such as the number of pages and the
names of the primary characters. Include methods that are named
appropriately for each class and that print an appropriate mes-
sage. Create a driver class to instantiate and exercise several of
the classes.
*/
abstract class ReadingMaterial{
    private String title;
    private int numOfPages;
    private String publisher;

    public ReadingMaterial(String title, int numOfPages, String publisher){
        this.title = title;
        this.numOfPages = numOfPages;
        this.publisher = publisher;
    }
    public abstract void read();

    public String getTitle() {
        return title;
    }
    
    public int getNumOfPages() {
        return numOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

}
class Book extends ReadingMaterial{
    private String characters;
    public Book(String title, int numOfPages, String publisher, String characters){
        super(title, numOfPages, publisher);
        this.characters = characters;
        
    }
    public void read(){
        System.out.println("Reading "+ getTitle() + " by publisher "+ getPublisher());
    }
    public String getCharacters() {
        return characters;
    }
}
class Novel extends ReadingMaterial{
    private String genre;
    public Novel(String title, int numOfPages, String publisher, String genre){
        super(title, numOfPages, publisher);
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    
    public void read(){
        System.out.println("Reading novel"+ getTitle() + "of genre" + getGenre() + "by publisher "+ getPublisher());
    }
}


public class Reading {
    public static void main(String[] args) {
        Book novel = new Book("Stupidity", 500, "Moron publishing", "Allan");
    }
}
