
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;





public class OS{



    private int Order;
    private Tecnic responsavel;
    private Client client;
    private String status;
    private Date opened;
    private Date closed;

    public OS(int Order, Tecnic responsavel, Client client) {
        this.Order = Order;
        this.responsavel = responsavel;
        this.client = client;
        this.status = "Pendente";
        this.opened = new Date();
    }

    public int getOrder() {
        return Order;
    }

    public Tecnic getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Tecnic responsavel) {
        this.responsavel = responsavel;
    }

    public Client getclient() {
        return client;
    }

    public void setclient(Client client) {
        this.client = client;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getopened() {
        return opened;
    }

    public Date getclosed() {
        return closed;
    }

    public void Finish() {
        this.status = "Finalizada";
        this.closed = new Date();
    }

    public void SearchTask(String task) {
       
    }

}