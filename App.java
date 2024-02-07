import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.FloatMap;
import javafx.scene.layout.StackPane;


public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
      
    }

    @Override //parte responsavel pela criação de elementos na tela, tudo escrito abaixo será responsável pelo gerenciamento da mesma, uso do scene builder para poder gesta-la.
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Layout.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene (root);

        primaryStage.setTitle("I LOVE THIS SHIT");
        primaryStage.setScene(tela);
        primaryStage.show();
        }
        
}
