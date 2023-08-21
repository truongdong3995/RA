package Bai3;

import Bai3.exception.BirthdayException;
import Bai3.exception.EmailException;
import Bai3.exception.PhoneException;

import java.util.Scanner;

/**
 * Nhân viên có kinh nghiệm lâu năm (Experience)
 */
public class Experience extends Employee{
    /**
     * Số năm kinh nghiệm
     */
    private int expInYear;

    /**
     * Kỹ năng chuyên môn
     */
    private String proSkill;

    public Experience() {}

    public Experience(int id, String fullName, String birthDay,
                      String phone, String email, int employeeType, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public void inputData(Scanner scanner, Employee[] employees,int employeeType) throws BirthdayException, PhoneException, EmailException {
        // Gọi function của lớp cha
        super.inputData(scanner, employees, employeeType);
        // Bổ sung thêm nhập 2 thông tin riêng
        System.out.println("ExpInYear:");
        this.expInYear = scanner.nextInt();
        //Bỏ qua dòng trống khi nhập int
        scanner.nextLine();
        System.out.println("ProSkill:");
        this.proSkill = scanner.nextLine();

        // Nhập chứng chỉ
        super.inputCertificateData(scanner);
    }

    @Override
    public String toString() {
        return  "Experience{" +
                super.toString()
                + ", expInYear=" + expInYear +
                ", proSkill='" + proSkill +
                '}';
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
