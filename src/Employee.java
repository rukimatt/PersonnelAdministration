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

    public Employee(){
        this.yearsOfService = 0;
        this.salary = 1500;
        this.department = "A38";
        //Alle anderen Attribute/Referenzen erhalten ihren Nullwert.


    }
}
