//Any class that implements an interface must implement all of its abstract methods, or it must declare itself as
// an abstract class.
package interfaces;
//we're not going to use 'extends' keyword because only interface can extend other interfaces, for classes we're going
// to use 'implements' keyword
public class Book implements Product{

    private String name;
//we can also add fields and methods specific to the Book class like author, pages
    private String author;
    private int pages;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
