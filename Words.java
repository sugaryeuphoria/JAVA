class Book {
    protected int pages;

    // Constructor
    public Book(int numPages) {
        pages = numPages;
    }

    public void setPages(int numPages) {
        pages = numPages;
    }

    public int getPages() {
        return pages;
    }
}

class Dictionary extends Book {
    private int definitions;
    
    public Dictionary(int numPages, int numDefinitions) {
        super(numPages);
        definitions = numDefinitions;
    }
    public double computeRatio() {
        return definitions / (double) pages;
    }

    public void setDefinitions(int numDefinitions) {
        definitions = numDefinitions;
    }

    public int getDefinitions() {
        return definitions;
    }
}

public class Words {
    public static void main(String[] args) {
        Dictionary webster = new Dictionary(1500, 52500);

        System.out.println("Number of Pages "+ webster.getPages());
        System.out.println("Number of Definitions "+webster.getDefinitions());
        System.out.println("Definitions per page "+ webster.computeRatio());
    }
}