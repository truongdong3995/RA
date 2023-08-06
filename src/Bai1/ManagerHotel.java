package Bai1;

public class ManagerHotel {

    public static void main(String[] args) {
        Room roomA = new Room("A", 300);
        Room roomD = new Room("D", 50);
        Customer customer = new Customer("Test1", 19, 1999, roomA, 5);

        System.out.printf("Thong tin cua room customer %s  thue la: %s",
                customer.getName(),
                customer.getRoom().toString());
    }
}
