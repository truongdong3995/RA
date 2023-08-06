package Bai1;

public class Customer {

    private String name;
    private  int age;

    private int id;

    private Room room;

    private int rentalDay;

    public Customer(String name, int age, int id, Room room, int rentalDay) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.room = room;
        this.rentalDay = rentalDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getRentalDay() {
        return rentalDay;
    }

    public void setRentalDay(int rentalDay) {
        this.rentalDay = rentalDay;
    }
}
