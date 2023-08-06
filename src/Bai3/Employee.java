package Bai3;

import java.util.Scanner;

public class Employee {
    private int id;

    private String fullName;

    private String birthDay;

    private String phone;

    private String email;

    private int employeeType;

    private Certificate[] certificateArr;

    public static int employeeCount = 0;

    public Employee () {

    }

    public Employee(int id, String fullName, String birthDay, String phone, String email, int employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public Certificate[] getCertificateArr() {
        return certificateArr;
    }

    public void setCertificateArr(Certificate[] certificateArr) {
        this.certificateArr = certificateArr;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employeeType=" + employeeType;
    }

    /**
     * Nhập thông tin cơ bản cho employee
     * @param scanner
     * @param  employees
     * @param employeeType
     */
    public void inputData(Scanner scanner, Employee[] employees, int employeeType) {
        System.out.println("Hãy nhập thông tin của employee:");
        // Nhập ID, check nếu nó tồn tại rồi thì bắt nhập lại
        do {
            System.out.println("ID:");
            this.id = scanner.nextInt();
        }while (exsistEmployee(this.id, employees));

        // Bỏ qua dòng trống khi nhập int
        scanner.nextLine();
        System.out.println("FullName:");
        this.fullName = scanner.nextLine();
        System.out.println("BirthDay:");
        this.birthDay = scanner.nextLine();
        System.out.println("Phone:");
        this.phone = scanner.nextLine();
        System.out.println("Email:");
        this.email = scanner.nextLine();
        this.employeeType = employeeType;
    }

    /**
     * Nhập só lượng chứng chỉ và thêm các chứng chỉ vào đối tượng
     * @param scanner
     */
    public void inputCertificateData(Scanner scanner) {
        System.out.println("Nhập số lượng chứng chỉ:");
        int certificateQuantity = scanner.nextInt();
        //Loại bỏ dòng trống khi nhập int
        scanner.nextLine();

        this.certificateArr = new Certificate[certificateQuantity];

        for (int i = 0; i < certificateQuantity; i++) {
            System.out.printf("\nNhập thông tin chứng chỉ thứ %d:\n", i + 1);
            System.out.println("Certificated ID:");
            int certificatedID = scanner.nextInt();

            //Loại bỏ dòng trống khi nhập int
            scanner.nextLine();
            System.out.println("Certificate Name:");
            String certificateName = scanner.nextLine();
            System.out.println("Certificate Rank:");
            String certificateRank = scanner.nextLine();
            System.out.println("Certificated Date:");
            String certificatedDate = scanner.nextLine();

            // Khởi tạo 1 đối tượng certificate từ các thông tin đã nhập ở trên
            Certificate certificate =
                    new Certificate(certificatedID, certificateName, certificateRank, certificatedDate);

            this.certificateArr[i] = certificate;
        }
    }

    /**
     * Kiểm tra xem id nhập đã tồn tại trong mảng chưa
     * @param id
     * @param employees
     * @return
     */
    private boolean exsistEmployee(int id, Employee[] employees) {
        if (employees == null) {
            return false;
        }
        // Nếu có employee có id này rồi thì return true
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println("ID nhập vào đã tồn tại. \n Hãy nhập giá trị khác. ID:");
                return true;
            }
        }

        return false;
    }
}
