package Q4


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


    @Override
    String toString() { return super.toString() +" He works for ${company} with ${empId} and draws ${salary}  "
    }
}

class GroovyExample{
    public static void main(String[] args) {
        def employee=new Employee(name: "ankit",age: 25,gender: "man",address: "rohini",empId: 2819,company: "Intelligrape",salary: 15000) ;

        printf "${employee.toString()}"
    }
}
