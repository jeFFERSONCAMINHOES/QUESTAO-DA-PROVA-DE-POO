public class Client {
    private String Name;
    private double Number;
    private Tecnic tecnic;

    public Client(String Name, double Number) {
        this.Name = Name;
        this.Number = Number;
    }

    public String getName() {
        return Name;
    }

    public double getNumber() {
        return Number;
    }

    public void setNumber(double Number) {
        this.Number = Number;
        
    }
    public void setTecnic(Tecnic tecnic) {
        this.tecnic = tecnic;
    }

    public Tecnic gettecnic() {
        return tecnic;
    }

    public void checartecnic() {
        if (tecnic != null) {
            System.out.println("Técnico associado ao cliente: " + tecnic.getTecnicNa());
        } else {
            System.out.println("Nenhum técnico associado a este cliente.");
        }
    
}
}
