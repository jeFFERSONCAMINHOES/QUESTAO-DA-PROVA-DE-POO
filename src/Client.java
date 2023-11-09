public class Client {
    private String Name;
    private double Number;

    public Client(String Name, double Number) {
        this.Name = Name;
        this.Number = Number;
    }

    public String getNome() {
        return Name;
    }

    public double getNumber() {
        return Number;
    }

    public void setNumber(double Number) {
        this.Number = Number;
    }
    
}
