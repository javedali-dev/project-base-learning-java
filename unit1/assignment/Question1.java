package assignment;

enum Gender {
    m,f;
}

class Author{
    private String name;
    private String email;
    private Gender gender;

    Author(String name,String email,Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }
}
class Book{
    private String name;
    private double price;
    private int qtyInStack;
    private Author author;

    public Book(String name, double price, int qtyInStack, Author author) {
        this.name = name;
        this.price = price;
        this.qtyInStack = qtyInStack;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStack() {
        return qtyInStack;
    }

    public Author getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStack(int qtyInStack) {
        this.qtyInStack = qtyInStack;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

public class Question1 {
public static void main(String[] args) {
    Author author = new Author("Jone doe", "Jonedoe@gmail.com", Gender.m);
    Book book = new Book("Love in Rajasthan", 130, 10, author);
    System.out.println("Book Name:"+book.getName());
    System.out.println("Book Price:"+book.getPrice());
    System.out.println("Book Quality:"+book.getQtyInStack());
    System.out.println("Book author:"+author.getName());
    System.out.println("Author Email:"+author.getEmail());
    System.out.println("Author Gender:"+author.getGender());
}

}
