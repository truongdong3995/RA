package Bai3.validation;

import Bai3.exception.BirthdayException;
import Bai3.exception.EmailException;
import Bai3.exception.PhoneException;

public class EmployeeValidator {
    public static void checkBirthday(String birthday) throws BirthdayException {
        if (birthday == null || birthday.isEmpty()) {
            throw new BirthdayException("Birthday cannot be empty");
        }
        // Có thể bổ sung thêm logic check validate ở dưới
    }

    public static void checkPhone(String phone) throws PhoneException {
        if (phone == null || phone.isEmpty()) {
            throw new PhoneException("Phone number cannot be empty");
        }
        //  Có thể bổ sung thêm logic check validate ở dưới
    }

    public static void checkEmail(String email) throws EmailException {
        if (email == null || email.isEmpty()) {
            throw new EmailException("Email address cannot be empty");
        }
        //  Có thể bổ sung thêm logic check validate ở dưới
    }
}
