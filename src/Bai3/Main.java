package Bai3;

import java.util.Scanner;

public class Main {
    public static final int EXPERIENCE_TYPE = 0;
    public static final int FRESHER_TYPE = 1;
    public static final int INTERN_TYPE = 2;

    public static void main(String[] args) {
        // Khởi tạo đối tượng employeeManager, trong constructor sẽ khởi tạo mảng employeeArr chứa các employee
        EmployeeManager employeeManager = new EmployeeManager();

        while (true) {
            System.out.println("********************MENU****************");
            System.out.println("1.Thêm mới employee");
            System.out.println("2.Update thông tin employee theo ID");
            System.out.println("3.Xóa thông tin employee theo ID");
            System.out.println("4.HIển thị thông tin tất cả employee");
            System.out.println("5.Tìm tất cả các nhân viên experience ");
            System.out.println("6.Tìm tất cả các nhân viên fresher");
            System.out.println("7.Tìm tất cả các nhân viên intern");
            System.out.println("8.Tìm kiếm thông tin employee theo ID");
            System.out.println("9.Thoát chương trình");
            System.out.println("************************************");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hãy nhập chức năng muốn chọn:");
            int choice = scanner.nextInt();
            // Loại bỏ line trống khi dùng nextint
            scanner.nextLine();

            switch (choice) {
                case 1:

                    Employee employee = null;
                    do {
                        System.out.println("Nhập loại nhân viên muốn thêm.");
                        System.out.println("1. Nhân viên có kinh nghiệm lâu năm (Experience)");
                        System.out.println("2. Nhân viên mới ra trường (Fresher)");
                        System.out.println("3. Nhân viên thực tập (Intern)");
                        int employeeType = scanner.nextInt();

                        switch (employeeType) {
                            case 1:
                                employee = new Experience();
                                employee.inputData(scanner, employeeManager.getAllEmployee(), EXPERIENCE_TYPE);
                                break;
                            case 2:
                                employee = new Fresher();
                                employee.inputData(scanner, employeeManager.getAllEmployee(), FRESHER_TYPE);
                                break;
                            case 3:
                                employee = new Intern();
                                employee.inputData(scanner, employeeManager.getAllEmployee(), INTERN_TYPE);
                                break;
                            default:
                                System.out.println("Employee type nhập vào không tồn tại.\n Vui lòng nhập lại.");
                        }

                        // Thêm employee
                        employeeManager.addEmployee(employee);
                    } while (employee == null);
                    break;
                case 2:
                    System.out.println("Hãy nhập ID của employee bạn muốn update.\nID:");
                    int employeeIdUpdate = scanner.nextInt();
                    // Loại bỏ line trống khi dùng nextint
                    scanner.nextLine();

                    employeeManager.updateEmployee(scanner, employeeIdUpdate);
                    break;
                case 3:
                    System.out.println("Hãy nhập ID của employee bạn muốn xóa.\nID:");
                    int employeeIdDelete = scanner.nextInt();
                    // Loại bỏ line trống khi dùng nextint
                    scanner.nextLine();

                    if(employeeManager.deleteById(employeeIdDelete)) {
                        System.out.println("Xóa thành công employee có ID là " + employeeIdDelete);
                    }
                    break;
                case 4:
                    Employee[] allEmployee = employeeManager.getAllEmployee();
                    if (allEmployee == null) {
                        System.out.println("Không có empoyee nào.");
                        break;
                    }
                    System.out.println("Thông tin của tất cả các employee: ");
                    for (Employee emp: allEmployee) {
                        System.out.println(emp.toString());
                    }
                    break;
                case 5:
                    Employee[] allExperience= employeeManager.findByEmployeeType(EXPERIENCE_TYPE);
                    if (allExperience == null) {
                        System.out.println("Không có empoyee nào.");
                        break;
                    }
                    System.out.println("Thông tin của tất cả các employee là Experience: ");
                    for (Employee emp: allExperience) {
                        System.out.println(emp.toString());
                    }
                    break;
                case 6:
                    Employee[] allFresher= employeeManager.findByEmployeeType(FRESHER_TYPE);
                    if (allFresher == null) {
                        System.out.println("Không có empoyee nào.");
                        break;
                    }
                    System.out.println("Thông tin của tất cả các employee là Fresher: ");
                    for (Employee emp: allFresher) {
                        System.out.println(emp.toString());
                    }
                    break;
                case 7:
                    Employee[] allIntern = employeeManager.findByEmployeeType(INTERN_TYPE);
                    if (allIntern == null) {
                        System.out.println("Không có empoyee nào.");
                        break;
                    }
                    System.out.println("Thông tin của tất cả các employee là Fresher: ");
                    for (Employee emp: allIntern) {
                        System.out.println(emp.toString());
                    }
                    break;
                case 8:
                    System.out.println("Hãy nhập ID của employee bạn muốn tìm.\nID:");
                    int employeeId = scanner.nextInt();
                    // Loại bỏ line trống khi dùng nextint
                    scanner.nextLine();
                    Employee emp = employeeManager.findById(employeeId);
                    if (emp == null) {
                        System.out.println("Không có empoyee nào.");
                        break;
                    }
                    System.out.println("Thông tin của employee có ID = " + employeeId);
                    System.out.println(emp.toString());
                    System.out.println("Thông tin certificate của employee");
                    // Lấy list certificate của employee này
                    Certificate[] certificates = emp.getCertificateArr();
                    for(int i = 0; i < certificates.length; i++) {
                        System.out.printf("certificate %d :\n", i + 1);
                        System.out.println(certificates[i].toString());
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không tồn tại.\n Hãy chọn lại.");
            }

            System.out.println("***************************");
            System.out.println("Bạn có muốn tiếp tục(Y/N)");
            String continueValue = scanner.nextLine();
            // Nếu chọn nhập N sẽ out chương trình
            if (continueValue.equals("N")) {
                break;
            }
        }
    }
}
