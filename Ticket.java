
package main;

public class Ticket {
    protected String age="";
    protected int day=0;
    protected int price=0; 
    protected String seat="";

    public Ticket(String age, int day, int price, String seat) {
        this.age = age;
        this.day = day;
        this.price = price;
        this.seat = seat;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    
    public String toString() {
        return "ticket{" + "age=" + age + ", day=" + day + ", price=" + price + ", seat=" + seat + '}';
    }
    
}
