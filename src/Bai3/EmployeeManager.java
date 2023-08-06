package Bai3;

import java.util.Scanner;

public class EmployeeManager {
    private Employee[] employeeArr;

    public EmployeeManager() {
        this.employeeArr = new Employee[100];
    }

    /**
     * Thêm 1 employee vào mảng và tăng chỉ mục lên
     * @param employee
     */
    public void addEmployee(Employee employee) {
        // Thêm phần tử tiếp theo vào employeeArr
        // Index  = số lượng của employee hiện tại
        employeeArr[Employee.employeeCount] = employee;
        // Sau khi thêm employee thì cộng count thêm 1
        Employee.employeeCount++;
    }

    public void updateEmployee(Scanner scanner, int id) {
        Employee employee = this.findById(id);
        if (employee == null) {
            System.out.println("ID đã nhập vào không tồn tại");
            return;
        }

        // Ví dụ ở đây muốn update tên;
        System.out.println("Nhập các thông tin để Update cho Employee có id " + id);
        System.out.println("Hãy nhập Full name muốn update.\n FullName = :");
        String fullNameUpdate = scanner.nextLine();
        employee.setFullName(fullNameUpdate);

        System.out.println("Update thông tin thành công");
    }

    /**
     * Tìm Employee theo id
     * @param id
     * @return Employee nếu tồn tại, null nếu không tìm thấy
     */
    public Employee findById(int id) {
        for (int i = 0; i < Employee.employeeCount; i++) {
            if (employeeArr[i].getId() ==  id) {
                return employeeArr[i];
            }
        }
        return null;
    }

    /**
     * Xóa thông tin nếu nó tồn tại
     * @param id
     * @return true nếu xóa thành công, false nếu không tồn tại
     */
    public boolean deleteById(int id) {
        Employee employee = this.findById(id);

        if (employee == null) {
            System.out.println("ID nhập vào không tồn tại");
            return false;
        }

        // Xóa 1 phần tử khỏi mảng bằng cách sau
        // Nếu Employee đó có ID != id nhập vào thì sẽ add vào mảng
        int index = 0;
        for (int i = 0; i < Employee.employeeCount; i++) {
            if (employeeArr[i].getId() != id) {
                employeeArr[index] = employeeArr[i];
                index++;
            }
        }
        // DO khi xóa thì số phần tử sẽ giảm đi 1->
        // Phần tử employee cuối cùng trong mảng sẽ được set lại là null
        employeeArr[Employee.employeeCount - 1] = null;
        Employee.employeeCount--;

        return true;
    }

    /**
     * Tìm danh sách Employee theo employeeType
     * type = 0 => Experience
     * type = 1 => Fresher
     * type = 2 => Intern
     */
    public Employee[] findByEmployeeType(int employeeType) {
        // Do không thể biết trước được số lượng của từng loại employee trong mảng gốc
        // Nên không thể tạo đúng số lượng các phần tử -> vì vậy sẽ tạo mảng lưu trữ có độ dài = employeeCount
        // -> Đây chính là 1 nhược điểm của Array, dùng List sẽ tiện hơn
        Employee[] employees = new Employee[Employee.employeeCount];
        //Index của mảng mới
        int index = 0;
        for (int i = 0; i < Employee.employeeCount; i++ ) {
            // Experience
            if (employeeType == 0) {
                // Dùng instanceof để kiểm tra xem đối tượng employeeArr[i] có phải là Experience hay không
                // Nếu đúng sẽ add vào mảng mới
                if (employeeArr[i] instanceof Experience) {
                    employees[index] = employeeArr[i];
                    index++;
                }
            } else if (employeeType == 1) {
                // Fresher
                if (employeeArr[i] instanceof Fresher) {
                    employees[index] = employeeArr[i];
                    index++;
                }
            } else if (employeeType == 2) {
                //Intern
                if (employeeArr[i] instanceof Intern) {
                    employees[index] = employeeArr[i];
                    index++;
                }
            }
        }

        // Nếu phần tử đầu tiên trong mảng employee mới đó mà là Null
        // Tức là mảng đó không có phần tử employee thỏa mãn cả -> return null
        if(employees[0] == null) {
            return null;
        }

        return employees;
    }

    /**
     * Lấy tất cả Employee có trong employeeArr
     * @return
     */
    public Employee[] getAllEmployee() {
        // TH phần tử  đầu tiên trong mảng là null thì chứng tỏ không có employee nào trong mảng cả => null
        if(employeeArr[0] == null) {
            return null;
        }

        // Khởi tạo 1 mảng có số lượng là số employeeCount hiện tại
        // Duyệt lần lượt các phần tử từ mảng chứa employeeArr
        int index = 0;
        Employee[] employees = new Employee[Employee.employeeCount];
        for (int i = 0; i < Employee.employeeCount;i++) {
            employees[index] = employeeArr[i];
            index++;
        }

        return employees;
    }
}
