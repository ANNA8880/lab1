import java.lang.*;
public class testbook {
    public static void main(String[] args) {
        book b1 = new book("Black ", 6);
        book b2 = new book("Blue ", 8);
        book b3 = new book("Red");
        b3.setAge(1);
        System.out.println(b1);
        b1.intobookAge();
        b2.intobookAge();
        b3.intobookAge();
    }
}
