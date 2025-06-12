package streamAPI;

import global.vo.Address;
import global.vo.Employee;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.util.stream.Collectors;



public class ImplementationOfStreamAPI {
    public static void main(String args[]){


        Address address1 = new Address("1", "obj1_corporateOfficeAddress1", "obj1_corporateOfficeAddress2", "Corporate Office", "000001");
        Address address2 = new Address("2", "obj2_residentialAddress1", "obj2_residentialAddress2", "Residential", "000002");
        Address address3 = new Address("3", "obj3_baseLocationAddress1", "obj3_baseLocationAddress2", "Base Location", "000003");

        Employee employee1 = new Employee("001", "Alice","Alice Middle Name","Alice Last Name",new Date("20-Jan-1990"), 35,"Alice@test.com",address1,true);
        Employee employee2 = new Employee("002", "Benjamin","Benjamin Middle Name","Benjamin Last Name",new Date("02-Jan-1990"), 35,"Benjamin@test.com",address3,false);
        Employee employee3 = new Employee("003", "Charlotte","Charlotte Middle Name","Charlotte Last Name",new Date("03-Mar-1992"), 33,"Charlotte@test.com",address3,true);
        Employee employee4 = new Employee("004", "Daniel","Daniel Middle Name","Daniel Last Name",new Date("11-Jul-1999"), 26,"Daniel@test.com",address2,true);
        Employee employee5 = new Employee("005", "Andrew","Andrew Middle Name","Andrew Last Name",new Date("01-Dec-2000"), 25,"Andrew@test.com",address1,false);
        Employee employee6 = new Employee("006", "Emily","Emily Middle Name","Emily Last Name",new Date("13-Apr-1991"), 32,"Emily@test.com",address2,false);
        Employee employee7 = new Employee("007", "Fiona","Fiona Middle Name","Fiona Last Name",new Date("20-Jun-1992"), 33,"Fiona@test.com",address2,false);
        Employee employee8 = new Employee("008", "George","George Middle Name","George Last Name",new Date("18-Jul-1994"), 31,"George@test.com",address3,true);
        Employee employee9 = new Employee("009", "Hannah","Hannah Middle Name","Hannah Last Name",new Date("09-May-2002"), 23,"Hannah@test.com",address1,true);
        Employee employee10 = new Employee("010", "Isaac","Isaac Middle Name","Isaac Last Name",new Date("20-Jan-1996"), 29,"Isaac@test.com",address1,false);
        Employee employee11 = new Employee("011", "Caleb","Caleb Middle Name","Caleb Last Name",new Date("24-Oct-1995"), 30,"Caleb@test.com",address2,true);
        Employee employee12 = new Employee("012", "Diana","Diana Middle Name","Diana Last Name",new Date("31-Dec-1990"), 35,"Diana@test.com",address3,false);
        Employee employee13 = new Employee("013", "Ivan","Ivan Middle Name","Ivan Last Name",new Date("28-Nov-1989"), 36,"Ivan@test.com",address1,true);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);    employeeList.add(employee2);    employeeList.add(employee3);
        employeeList.add(employee4);    employeeList.add(employee5);    employeeList.add(employee6);
        employeeList.add(employee7);    employeeList.add(employee8);    employeeList.add(employee9);
        employeeList.add(employee10);    employeeList.add(employee11);  employeeList.add(employee12);
        employeeList.add(employee13);   // employeeList.add(employee11); employeeList.add(employee12);
    //  employeeList.add(employee12);    employeeList.add(employee13);

        // get all employees count
        System.out.println("1. Employee List Count : "+employeeList.stream().collect(Collectors.counting()));

        // get list of employees order by name
        System.out.println("\n\n2. get list of employees order by name : ");
        List<Employee> sortedEmployees = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getEmployeeFirstName))
                .toList();
        sortedEmployees.forEach(e -> System.out.println(e.getEmployeeFirstName()+" ("+e.getEmployeeId()+")"));

        // get list of employees whose first name is starts with any letter [A-Z]
        System.out.println("\n\n3. get list of employees whose first name is starts with any letter [A-Z]");
        List<Employee> filteredEmployees = employeeList.stream()
                .filter(e -> e.getEmployeeFirstName().startsWith("A"))
                .toList();

        filteredEmployees.forEach(e -> System.out.println(e.getEmployeeFirstName()));

        // get list of employees having age=35
        System.out.println("\n\n4. get list of employees having age=35");
        List<Employee> age35Employees = employeeList.stream()
                .filter(e -> e.getAge() == 35)
                .toList();
        age35Employees.forEach(e -> System.out.println(e.getEmployeeFirstName()));


        // get list of employees ASC order by age
        System.out.println("\n\n5. get list of employees ASC order by age");
        List<Employee> employeesListAsc = employeeList.stream().
                sorted(Comparator.comparing(Employee::getAge)).toList();
        employeesListAsc.forEach(e -> System.out.println(e.getEmployeeFirstName()+" ("+e.getAge()+") "));

        // get list of employees DESC order by age
        System.out.println("\n\n6. get list of employees DESC order by age");
        List<Employee> employeesListDesc = employeeList.stream().
                sorted(Comparator.comparing(Employee::getAge).reversed()).toList();
        employeesListDesc.forEach(e -> System.out.println(e.getEmployeeFirstName()+" ("+e.getAge()+") "));

        // get employees list with incorrect age
        System.out.println("\n\n6. get employees list with incorrect age");
        List<Employee> incorrectAgeEmployees = employeeList.stream()
                .filter(e -> e.getAge() != e.getActualAge())
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Employees with incorrect age:");
        incorrectAgeEmployees.forEach(e -> {
            System.out.println(e.getEmployeeFirstName() + " | DOB: " + e.getDateOfBirth() +
                    " | Provided Age: " + e.getAge() +
                    " | Actual Age: " + e.getActualAge());
        });

        // get count of employees with active / inactive flag
        System.out.println("\n\n7. get count of employees with active / inactive flag");
        Map<Boolean, Long> statusCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::isActive, Collectors.counting()));

        System.out.println("Active Employees: " + statusCount.getOrDefault(true, 0L));
        System.out.println("Inactive Employees: " + statusCount.getOrDefault(false, 0L));


        // get a list of months or names of months that are not present in the date of birth data of the available employees
        // get a list of employees with their count, grouped by the first letter of their names


    }
}
