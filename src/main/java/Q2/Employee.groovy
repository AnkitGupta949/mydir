package Q2

import Q1.Person

class Employee extends Person {
    int empId;
    String company;
    int salary;

    int getEmpId() {
         empId
    }

    void setEmpId(int empId) {
        this.empId = empId
    }

    String getCompany() {
        println("getter is called"+company)
         company
    }

    void setCompany(String company) {
        this.company = company
    }

    int getSalary() {
        salary
    }

    void setSalary(int salary) {
        this.salary = salary
    }


}

class GroovyExample{
    public static void main(String[] args) {
        def employee=new Employee(name: "ankit",age: 34,gender: "male",address: "rohini",empId: 2819,company: "TTN",salary: 15000);

        printf "person details \n"
        printf "${employee.getName()} ${employee.getAge()} ${employee.getGender()} ${employee.getAddress()} \n"
        printf "employee details \n"
        printf "${employee.getEmpId()} ${employee.getCompany()} ${employee.getSalary()} \n"

        printf "${employee.company} calling getter \n"
        printf "${employee.@company} without calling getter \n"


    }
}
