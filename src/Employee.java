public class Employee {

    private int dienstjahre;
    private double bruttogehalt;
    private String abteilung;

    public Employee(int d, double b, String a){
        dienstjahre = d;
        bruttogehalt = b;
        abteilung = a;
    }

    public int getDienstjahre(){return dienstjahre;}

    public double getBruttogehalt(){return bruttogehalt;}

    public String getAbteilung(){return abteilung;}


}
