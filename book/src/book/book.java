import java.lang.*;
public class book {
    private String color;
    private int age;

    public book(String c, int a){
        color = c;
        age = a;
    }
    public book(String c){
        color = c;
        age = 8;
    }
    public book(){
        color = "Black";
        age = 8;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.color+", color "+this.age;
    }
    public void intobookAge(){
        System.out.println(color+"book "+age+" years.");
    }
}