public class Book {

    String Author;
    String name;
    int price;
    int pages;

    public String toString(){

        return Author + name + price + pages;

    }

    public Book(String Author, String name, int price, int pages){

        this.Author = Author;
        this.name = name;
        this.price = price;
        this.pages = pages;

    }

}
