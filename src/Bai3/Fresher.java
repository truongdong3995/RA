package Bai3;

import java.util.Scanner;

/**
 * Nhân viên mới ra trường (Fresher)
 */
public class Fresher extends Employee{
    /**
     * Thời gian tốt nghiệp
     */
    private String graduationDate;

    /**
     * Xếp loại tốt nghiệp
     */
    private String graduationRank;

    /**
     * Trường tốt nghiệp
     */
    private String education;

    public Fresher() {}

    public Fresher(int id, String fullName, String birthDay,
                   String phone, String email, int employeeType,
                   String graduationDate,String graduationRank, String education) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public void inputData(Scanner scanner, Employee[] employees, int employeeType) {
        // Gọi function của lớp cha
        super.inputData(scanner, employees, employeeType);
        // Bổ sung thêm nhập thông tin riêng
        System.out.println("Graduation Date:");
        this.graduationDate = scanner.nextLine();
        System.out.println("Graduation Rank:");
        this.graduationRank = scanner.nextLine();
        System.out.println("Education:");
        this.education = scanner.nextLine();

        // Nhập chứng chỉ
        super.inputCertificateData(scanner);
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" + super.toString() +
                ", graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
