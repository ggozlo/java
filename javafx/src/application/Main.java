package application;
	




import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application 
{
	int num =100;
	@Override
	public void start(Stage stage) 
	{
		
		try 
		{

			Label text = new Label();
			text.setText(Integer.toString(num));
			text.setStyle("-fx-font-size:40");
			
			Button bu = new Button();
			bu.setOnAction(s->{
			num--;
			text.setText(Integer.toString(num));
			});
			bu.setText("¡ı∞°");
			bu.setStyle("-fx-font-size:20");
			
			
			StackPane pp = new StackPane();
			StackPane.setAlignment(bu, Pos.BOTTOM_CENTER);
			pp.getChildren().add(text);
			pp.getChildren().add(bu);
			Scene sc  = new Scene(pp,400,400);
			stage.setScene(sc);
			
			
			stage.show();
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
