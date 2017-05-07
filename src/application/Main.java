package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	Player player;
	public static  Stage PS;

	public void start(final Stage primaryStage) 
	{
		PS=primaryStage;
		player = new Player("file:///D:/Videos/Amazing/AWESOME.mp4");
		Scene scene =new Scene(player, 720, 480, Color.BLACK);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
