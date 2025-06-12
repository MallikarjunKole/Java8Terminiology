package global.vo;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;

public class Employee {

    DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .parseCaseInsensitive()
            .appendPattern("dd-MMM-yyyy")
            .toFormatter(Locale.ENGLISH);

    private String employeeId;
    private String employeeFirstName;
    private String employeeMiddleName;
    private String employeeLastName;
    private Date dateOfBirth;
    private int age;
    private String emailId;
    private Address address;
    private boolean isActive;

    public Employee(String employeeId, String employeeFirstName, String employeeMiddleName,
                    String employeeLastName, Date dateOfBirth, int age, String emailId, Address address,
                    boolean isActive) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeMiddleName = employeeMiddleName;
        this.employeeLastName = employeeLastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.emailId = emailId;
        this.address = address;
        this.isActive = isActive;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeMiddleName() {
        return employeeMiddleName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getActualAge() {
        LocalDate localDate = dateOfBirth.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return Period.between(localDate, LocalDate.now()).getYears();
    }
}
