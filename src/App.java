import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    

    public static void main(String[] argsm) {


        Client client1 = new Client("Mario", 759884980);
        Tecnic tecnic2 = new Tecnic("Maria", "Analist");
        Tecnic tecnic1 = new Tecnic("Jose","Enginer");
        Service service1 = new Service(2);
         Service service2 = new Service(3);
        
        OS os1 = new OS(20, tecnic1, client1);


        tecnic1.adicionarServico(service1.getCodigo());
          tecnic2.adicionarServico(service2.getCodigo());
          ArrayList<Tecnic> tecnicos = new ArrayList<>();
          tecnicos.add(tecnic1);
          tecnicos.add(tecnic2);
  
          for (Tecnic tecnic : tecnicos) {
              System.out.println("Técnico: " + tecnic1.getTecniNa());
              System.out.println("Códigos de Serviço Associados:");
              for (int codigoServico : tecnic1.getCodigosServicos()) {
                  System.out.println("- " + codigoServico);
              }
              System.out.println();




         client1.setTecnic(tecnic1);
        client1.checartecnic();
       

        


          System.out.format("Service Order",os1.getOrder());
          System.out.format("Client",os1.getclient());
           System.out.format("Status",os1.getStatus());
           System.out.println("Opening Date" + formatDate(os1.getopened()));
           


            os1.setStatus("Working KEEP CALM");
            os1.SearchTask("Task29");
            tecnic1.setTecnicFu("Analyst");
            client1.setNumber(759884980);
            os1.Finish();




            System.out.println("New Status"+os1.getStatus());
            System.out.println("Finished Date" + formatDate(os1.getclosed()));
            






    public static String formatDate(Date opened) {
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/mm/yyy hh:mm:ss");

        return sdf.format(opened);
    }





        }
    }
}