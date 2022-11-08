public class Employee {

    private String name;
    private String forename;
    private String birthdate;

    private char gender;
    private int age;
    private double weight;

    private String department;
    private double salary;

    private int yearsOfService;
    private String specialties;


    public Employee(String name, String forename, String birthdate){
        this.yearsOfService = 0;
        this.salary = 1500;
        this.department = "A38";
        //Alle anderen Attribute/Referenzen erhalten ihren Nullwert.
    }

        public String getName() {
            return name;
    }

    public String getForename() {
        return forename;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public String getSpecialties() {
        return specialties;
    }
}


