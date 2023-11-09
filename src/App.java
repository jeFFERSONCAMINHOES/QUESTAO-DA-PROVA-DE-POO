
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class App {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    

    public static void main(String[] argsm) {


        Client client = new Client("Mario", 759884980);
        Tecnic tecnic = new Tecnic("Jose","Enginer");
        OS os1 = new OS(20, tecnic, client);


        System.out.format("Service Order",os1.getOrder());
         System.out.format("Responsavel",os1.getResponsavel());
          System.out.format("Client",os1.getclient());
           System.out.format("Status",os1.getStatus());
            System.out.println("Opening Date" + formatDate(os1.getopened()));


            os1.setStatus("Working KEEP CALM");
            os1.SearchTask("Task29");
            tecnic.setTecnicFu("Analyst");
            client.setNumber(759884980);
            os1.Finish();




            System.out.println("New Status"+os1.getStatus());
            System.out.println("New Tecnichal function"+tecnic.getTecnicFu());
            System.out.format("New client number is %f",client.getNumber());
            System.out.println("Finished Date"+ formatDate(os1.getclosed()));






    public static String formatDate(Date opened) {
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/mm/yyy hh:mm:ss");

        return sdf.format(opened);
    }





        }
    }