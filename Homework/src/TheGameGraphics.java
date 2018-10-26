 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.application.Application;
import javafx.event.ActionEvent;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class TheGameGraphics extends Application {
	
	//Global Variables
	
	public Stage firstStage; 
	public Text myText;
	public GridPane pane;
	public Text heroes;
	public int i;
	private ImageView imgView;
	public Group gameplay;
	public Scene myScene;
	public Label currentScore;
	public Player addScore;
	//public TextField bossHealth;
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		launch(args);	
	}
	
	@Override
	
	
	
	//Display -----------------------------
	public void start(Stage scene) throws Exception, FileNotFoundException
	{
		firstStage = scene;
		
		
		
		myText = new Text("The Journey Begins");
		addScore = new Player(0);
		currentScore = new Label();
		
		
		//Labels-----
		

		
		//Buttons---------------------

	
		//Images-------------
		Image player = new Image("littleViking.png");
		imgView = new ImageView(player);
		imgView.setY(500);
		//imgView.setFitWidth(200);
		//imgView.setFitHeight(200);
		
		

		//Groups-------------
		gameplay = new Group(imgView,currentScore);
		
		
		
		
		myScene = new Scene(gameplay,600,600);
		
		
		
		
		
		
		//Pane Layout--------------
		//pane = new GridPane();
		//GridPane menuPane = new GridPane();
		
		//pane.setStyle("-fx-background-color: cornsilk");
		
		//pane.add(bossName,0,1);
		//menuPane.add(attackButton,1,1);
		//pane.add(imgView,0,18);
		//pane.setHgap(5);
		//pane.setVgap(5);
		
		//files-----------------
		/*		File myFile = new File("./src/ListOfHeros");
				i=3;
				Scanner myScan = new Scanner(myFile);
				
				while(myScan.hasNextLine())
				{
						String heroName = myScan.next();
						TheGame herolist = new TheGame(heroName);
						heroes = new Text(herolist.toString());
						Group addedHeroList = new Group(heroes);
						//pane.add(addedHeroList,0,i);
					 i+=1;
				}
				*/
				
				//---------------------
		
		
		//actions----------------
		myScene.setOnKeyPressed(this::move);
		
		//Scene Layout--------------
		//Scene menu = new Scene(menuPane,600,600);
		firstStage.setTitle("My Game");
		
		firstStage.setScene(myScene);
		firstStage.show();
		
		
		
	}
	
/*	public void startGame(ActionEvent event) {
		
		
		
	
		}*/
		
	//so far the only way to increase score is by movement
	public void move(KeyEvent movement) {
		
		switch(movement.getCode()) {
		case D:
			imgView.setX(imgView.getX()+20);
			currentScore.setText("Current Score: " + addScore.playerScore());
			
			break;
		case A:
			imgView.setX(imgView.getX()-20);
			currentScore.setText("Current Score: " + addScore.playerScore());
			break;
		case W:
			imgView.setY(imgView.getY()-20);
			currentScore.setText("Current Score: " + addScore.playerScore());
			break;
		case S:
			imgView.setY(imgView.getY()+20);
			currentScore.setText("Current Score: " + addScore.playerScore());
			
			break;
			default:
			break;
			
		}
		
		
		
	}
	
	
	
	
	/*
	public void attack(ActionEvent attack) {
		
	int health = Integer.parseInt(bossHealth.getText());
	int newHealth = health - 10;
	
	result.setText("Boss Health: " + newHealth);
		
		
		
		
		
		
	}
	
	public void processReturn(ActionEvent event) {
		
		int health = Integer.parseInt(bossHealth.getText());
		int newHealth = health;
		result.setText("Boss Health: " + newHealth);
	}
	*/

}

