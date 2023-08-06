package Bai3;

import java.util.Scanner;

/**
 * Nhân viên thực tập (Intern)
 */
public class Intern extends Employee{
    /**
     * Chuyên ngành đang học
     */
    private String majors;

    /**
     * Học kì đang học
     */
    private String semester;

    /**
     * Tên trường đang học
     */
    private  String universityName;

    public Intern() {}

    public Intern(int id, String fullName, String birthDay,
                  String phone, String email, int employeeType,
                  String majors, String semester, String universityName) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public void inputData(Scanner scanner, Employee[] employees, int employeeType) {
        // Gọi function của lớp cha
        super.inputData(scanner, employees, employeeType);
        // Bổ sung thêm nhập thông tin riêng
        System.out.println("Majors:");
        this.majors = scanner.nextLine();
        System.out.println("Semester:");
        this.semester = scanner.nextLine();
        System.out.println("University Name:");
        this.universityName = scanner.nextLine();

        // Nhập chứng chỉ
        super.inputCertificateData(scanner);
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" + super.toString() +
                ", majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
