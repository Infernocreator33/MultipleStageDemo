import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ch14MultipleStageDemo extends Application
{
    @Override //override start method in Application
    public void start(Stage primaryStage)
    {
        //create a scene and place a button in the scene
        Scene scene = new Scene(new Button("OK"), 200, 250);// creating an anonymous button that you cannot call too
        primaryStage.setTitle("MyJavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"), 200, 250));
        stage.show();
    }
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}
