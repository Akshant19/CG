package constructor_first_16_01_26;

public class Level1_3 {
    static void main(String[] args) {

      Book book = new Book("harry","potter",200);

      // book.disp();
        System.out.println("Title: "+ book.getTitle());
        System.out.println("Author: "+book.getAuthor());
        System.out.println("Price: "+book.getPrice());
    }
}

class Book{
    private final String title;
    private  final String author;
    private final float price;

    Book(String title,String author,float price){
        this.title = title;
        this.author =author;
        this.price=price;
    }

//    void disp(){
//
//        System.out.println("Title: "+title);
//        System.out.println("Author: "+ author);
//        System.out.println("Price: "+price);
//    }

    // or like professional

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public float getPrice(){
        return  price;
    }
}
