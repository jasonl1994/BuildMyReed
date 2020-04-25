package application;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;

import com.jfoenix.animation.alert.JFXAlertAnimation;
import com.jfoenix.controls.JFXAlert;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXNodesList;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import com.jfoenix.validation.RequiredFieldValidator;

import java.io.*;

public class buildMyReedController implements Initializable{
	 
	 @FXML
     private StackPane stackPane;
	 @FXML
	 private AnchorPane anchorPane = new AnchorPane();
	 @FXML
	 private JFXTextField tipWidth;
	 @FXML
	 private JFXTextField backWidth;
	 @FXML
	 private JFXTextField rLength;
	 @FXML
	 private JFXTextField tipThickness;
	 @FXML
	 private JFXTextField heartThickness;
	 @FXML
	 private JFXTextField backThickness;
	 @FXML
	 private JFXButton cButton;
	 @FXML
	 private JFXButton jazzButton;
	 @FXML
	 private JFXButton popButton;
	 @FXML
	 private JFXNodesList nodeList_1 = new JFXNodesList();
	 @FXML
	 private JFXNodesList nodeList_2 = new JFXNodesList();
	 
	 @Override
	 public void initialize(URL location, ResourceBundle resources) {
		
		JFXButton menuButton = new JFXButton("Menu");
		menuButton.getStyleClass().add("button-raised");
		
		JFXButton buildButton = new JFXButton("Classy Build");
		buildButton.getStyleClass().add("button-raised");
		//Apply Classy Builds Buttons
		jazzButton = new JFXButton("Jazz");
		jazzButton.getStyleClass().add("button-raised");
		jazzButton.setOnAction(action -> {
			rLength.setText("70.26");
			rLength.setEditable(false);
			tipThickness.setText("0.09");
			tipThickness.setEditable(false);
			backThickness.setText("3.25");
			backThickness.setEditable(false);
			backWidth.setText("14.09");
			backWidth.setEditable(false);
			tipWidth.setText("15.72");
			tipWidth.setEditable(false);
			heartThickness.setText("2");
			heartThickness.setEditable(false);
		});
		
		popButton = new JFXButton("Classical");
		popButton.getStyleClass().add("button-raised");
		popButton.setOnAction(action -> {
			rLength.setText("70.26");
			rLength.setEditable(false);
			tipThickness.setText("0.1");
			tipThickness.setEditable(false);
			backThickness.setText("3.13");
			backThickness.setEditable(false);
			backWidth.setText("14.09");
			backWidth.setEditable(false);
			tipWidth.setText("15.72");
			tipWidth.setEditable(false);
			heartThickness.setText("2");
			heartThickness.setEditable(false);
		});
		
		JFXButton resetButton = new JFXButton("Unset Build");
		resetButton.setStyle("-fx-padding: 0.5em 0.4em;-fx-font-size: 14px;-jfx-button-type: RAISED;-fx-background-color: rgb(196, 37, 119);-fx-pref-width: 85;-fx-text-fill: WHITE;");
		resetButton.setOnAction(action -> {
			rLength.setText("");
			rLength.setEditable(true);
			tipThickness.setText("");
			tipThickness.setEditable(true);
			backThickness.setText("");
			backThickness.setEditable(true);
			backWidth.setText("");
			backWidth.setEditable(true);
			tipWidth.setText("");
			tipWidth.setEditable(true);
			heartThickness.setText("");
			heartThickness.setEditable(true);
		});
		
		nodeList_2.setSpacing(80);
		nodeList_2.addAnimatedNode(buildButton);
		nodeList_2.addAnimatedNode(jazzButton);
		nodeList_2.addAnimatedNode(popButton);
		nodeList_2.addAnimatedNode(resetButton);
		nodeList_2.setRotate(270);
		
		nodeList_1.setSpacing(10);
		nodeList_1.addAnimatedNode(menuButton);
		nodeList_1.addAnimatedNode(nodeList_2);
		
		stackPane.getChildren().add(nodeList_1);
        stackPane.setAlignment(Pos.TOP_LEFT);
        //Tone Buttons
        AnchorPane anchorPane_1 = new AnchorPane();
        
        JFXButton heartTButton = new JFXButton("Heart Thickness");
        heartTButton.getStyleClass().add("button-dialog");
        heartTButton.setLayoutX(90);
        heartTButton.setLayoutY(20);
        
        heartTButton.setOnAction(action -> {
            JFXAlert alert = new JFXAlert();
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.setOverlayClose(false);
            JFXDialogLayout layout = new JFXDialogLayout();
            Label label_1 = new Label("Heart Thickness");
            label_1.setFont(new Font("Georgia", 16));
            label_1.setTextFill(Color.WHITE);
            layout.setHeading(label_1);
            Label label_2 = new Label("The thicker the heart, the darker, richer, and warmer the overall sound."
                    + " This means that there are fewer overtones found in the sound."
                    + " The sound has more bass and treble sounds and very few high sounds."
                    + " This also means starts and stops in the sound, including articulations, are quicker and more precise."
                    + " This tone is better for more classical style music.\n"
                    + "\n"
                    + "The thinner the heart, the brighter and crisper the overall sound."
                    + " This means that there are more overtones highlighted in the sound."
                    + " The sound has less bass and some treble sounds, but much more high sounds."
                    + " This is better for jazz, pop, or rock music because the higher sound cuts through the rest of the orchestra or band, making it easier to be heard.");
            label_2.setFont(new Font("Georgia", 13));
            label_2.setTextFill(Color.WHITE);
            layout.setBody(label_2);
            JFXButton closeButton = new JFXButton("Got It");
            closeButton.setStyle("-fx-border-radius: 5 5 5 5;-fx-background-radius: 5 5 5 5;-fx-text-fill: WHITE;-fx-background-color: rgb(21, 68, 171);-fx-font: 13 Georgia;");
            closeButton.setOnAction(event -> alert.hideWithAnimation());
            layout.setActions(closeButton);
            layout.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
            alert.setContent(layout);
            alert.show();
        });
        
        JFXButton tipTButton = new JFXButton("Tip Thickness");
        tipTButton.getStyleClass().add("button-dialog");
        tipTButton.setLayoutX(90);
        tipTButton.setLayoutY(70);
        tipTButton.setOnAction(action -> {
            JFXAlert alert = new JFXAlert();
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.setOverlayClose(false);
            JFXDialogLayout layout = new JFXDialogLayout();
            Label label_1 = new Label("Tip Thickness");
            label_1.setFont(new Font("Georgia", 16));
            label_1.setTextFill(Color.WHITE);
            layout.setHeading(label_1);
            Label label_2 = new Label("The tip is basically the inverse to the heart."
                    + " The thicker the tip, the brighter the sound.\n"
                    + "\n"
                    + "The thinner the tip, the darker the sound.");
            label_2.setFont(new Font("Georgia", 13));
            label_2.setTextFill(Color.WHITE);
            layout.setBody(label_2);
            JFXButton closeButton = new JFXButton("Got It");
            closeButton.setStyle("-fx-border-radius: 5 5 5 5;-fx-background-radius: 5 5 5 5;-fx-text-fill: WHITE;-fx-background-color: rgb(21, 68, 171);-fx-font: 13 Georgia;");
            closeButton.setOnAction(event -> alert.hideWithAnimation());
            layout.setActions(closeButton);
            layout.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
            alert.setContent(layout);
            alert.show();
        });
        
        JFXButton backTButton = new JFXButton("Heel Thickness");
        backTButton.getStyleClass().add("button-dialog");
        backTButton.setLayoutX(90);
        backTButton.setLayoutY(120);
        backTButton.setOnAction(action -> {
            JFXAlert alert = new JFXAlert();
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.setOverlayClose(false);
            JFXDialogLayout layout = new JFXDialogLayout();
            Label label_1 = new Label("Heel Thickness");
            label_1.setFont(new Font("Georgia", 16));
            label_1.setTextFill(Color.WHITE);
            layout.setHeading(label_1);
            Label label_2 = new Label("The heel thickness is not directly relevant in affecting the sound quality."
                    + " More specifically, the heel thickness affects the slope from the tip of the reed through the heart of the reed and to the heel of the reed."
                    + " If the heel is thinner, then the slope from the tip of the reed is shallower meaning the tip is thicker and the heart is thinner."
                    + " In this situation, the sound is brighter and has more of an edge.\n"
                    + "\n"
                    + "Overtones are more highlighted in the sound which causes the higher elements of the sound to be brought out more.");
            label_2.setFont(new Font("Georgia", 13));
            label_2.setTextFill(Color.WHITE);
            layout.setBody(label_2);
            JFXButton closeButton = new JFXButton("Got It");
            closeButton.setStyle("-fx-border-radius: 5 5 5 5;-fx-background-radius: 5 5 5 5;-fx-text-fill: WHITE;-fx-background-color: rgb(21, 68, 171);-fx-font: 13 Georgia;");
            closeButton.setOnAction(event -> alert.hideWithAnimation());
            layout.setActions(closeButton);
            layout.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
            alert.setContent(layout);
            alert.show();
        });
        
        anchorPane_1.getChildren().add(backTButton);
        anchorPane_1.getChildren().add(heartTButton);
        anchorPane_1.getChildren().add(tipTButton);
        //Tone textfield
        heartThickness = new JFXTextField();
        heartThickness.setLabelFloat(true);
        heartThickness.getStyleClass().add("text-field");
        heartThickness.setPromptText("Input for Slope of Heart");
        heartThickness.setLayoutX(250);
        heartThickness.setLayoutY(20);
         
        tipThickness = new JFXTextField();
        tipThickness.setLabelFloat(true);
        tipThickness.getStyleClass().add("text-field");
        tipThickness.setPromptText("Input for Thickness of Tip");
        tipThickness.setLayoutX(250);
        tipThickness.setLayoutY(70);
        
        backThickness = new JFXTextField();
        backThickness.setLabelFloat(true);
        backThickness.getStyleClass().add("text-field");
        backThickness.setPromptText("Input for Thickness of Heel");
        backThickness.setLayoutX(250);
        backThickness.setLayoutY(120);
        
        anchorPane_1.getChildren().add(backThickness);
        anchorPane_1.getChildren().add(heartThickness);
        anchorPane_1.getChildren().add(tipThickness);
        //Other Measurements Buttons
        AnchorPane anchorPane_2 = new AnchorPane();
        
        JFXButton lengthButton = new JFXButton("Reed Length");
        lengthButton.getStyleClass().add("button-dialog");
        lengthButton.setLayoutX(90);
        lengthButton.setLayoutY(20);
        
        JFXButton tipButton = new JFXButton("Tip Width");
        tipButton.getStyleClass().add("button-dialog");
        tipButton.setLayoutX(90);
        tipButton.setLayoutY(70);
        
        JFXButton backButton = new JFXButton("Heel Width");
        backButton.getStyleClass().add("button-dialog");
        backButton.setLayoutX(90);
        backButton.setLayoutY(120);
        
        anchorPane_2.getChildren().add(lengthButton);
        anchorPane_2.getChildren().add(tipButton);
        anchorPane_2.getChildren().add(backButton);
        //Other Measurements text field
        rLength = new JFXTextField();
        rLength.setLabelFloat(true);
        rLength.getStyleClass().add("text-field");
        rLength.setPromptText("Input for Length of Reed");
        rLength.setLayoutX(250);
        rLength.setLayoutY(20);
        
        backWidth = new JFXTextField();
        backWidth.setLabelFloat(true);
        backWidth.getStyleClass().add("text-field");
        backWidth.setPromptText("Input for Width of Tip");
        backWidth.setLayoutX(250);
        backWidth.setLayoutY(70);
        
        tipWidth = new JFXTextField();
        tipWidth.setLabelFloat(true);
        tipWidth.getStyleClass().add("text-field");
        tipWidth.setPromptText("Input for Width of Heel");
        tipWidth.setLayoutX(250);
        tipWidth.setLayoutY(120);
        
        anchorPane_2.getChildren().add(rLength);
        anchorPane_2.getChildren().add(backWidth);
        anchorPane_2.getChildren().add(tipWidth);
        //FAQ
        AnchorPane anchorPane_3 = new AnchorPane();
        
        Label label_4 = new Label("GUI: Wenrui Lai");
        Label label_3 = new Label("Scad Model: Tanner Park");
        Label label_2 = new Label("Reed Info: Caroline Ferris");
        
        label_4.getStyleClass().add("faq-label");
        label_4.setLayoutX(50);
        label_4.setLayoutY(20);
        
        label_3.getStyleClass().add("faq-label");
        label_3.setLayoutX(50);
        label_3.setLayoutY(70);
        
        label_2.getStyleClass().add("faq-label");
        label_2.setLayoutX(50);
        label_2.setLayoutY(120);
        
        anchorPane_3.getChildren().add(label_2);
        anchorPane_3.getChildren().add(label_3);
        anchorPane_3.getChildren().add(label_4);
        
        //Fill the content into Tabs
        JFXTabPane tabPane = new JFXTabPane();
        tabPane.setPrefSize(600, 220);
        tabPane.setSide(Side.LEFT);
        tabPane.setLayoutX(0);
        tabPane.setLayoutY(160);
        
        Tab tab_1 = new Tab();
        tab_1.setText("Tone");
        tab_1.setContent(anchorPane_1);
        tabPane.getTabs().add(tab_1);
        
        Tab tab_2 = new Tab();
        tab_2.setText("Others");
        tab_2.setContent(anchorPane_2);
        tabPane.getTabs().add(tab_2);
        
        Tab tab_3 = new Tab();
        tab_3.setText("FAQ");
        tab_3.setContent(anchorPane_3);
        tabPane.getTabs().add(tab_3);
        
        anchorPane.getChildren().add(tabPane);
        //
        Label label_1 = new Label("Customize Your Reed");
        label_1.getStyleClass().add("main-label");
        label_1.setLayoutX(10);
        label_1.setLayoutY(110);
        
        anchorPane.getChildren().add(label_1);
        //
	 }
	 
	 public void cButtonClicked() throws IOException,  
	 									 InterruptedException {
		 guiThread threadOne = new guiThread();
         threadOne.start();
         
	     buildThread threadTwo = new buildThread();
         threadTwo.start();
         threadTwo.join();
         
         threadOne.interrupt();
	 }
	 									 
	 public class guiThread extends Thread {
		
		public void run() {
			
				try {
					ProcessBuilder pb = new ProcessBuilder("java", "-jar", "loadingWindow.jar");
					pb.directory(new File("jar"));
					Process p = pb.start();
					while (true) {
						if (Thread.currentThread().isInterrupted()) {
							p.destroy();
						} 
					}
				} catch (IOException e) {
						e.printStackTrace();
				}
			
		}
     }
	 
	 
	 public class buildThread extends Thread {
		 public void run() {			
			 StringBuilder lengthString = new StringBuilder("length=");
			 lengthString.append(rLength.getText());
			 StringBuilder tipWidthString = new StringBuilder("tip_width=");
			 tipWidthString.append(tipWidth.getText());
			 StringBuilder backWidthString = new StringBuilder("back_width=");
			 backWidthString.append(backWidth.getText());
			 StringBuilder tipThicknessString = new StringBuilder("tip_thickness=");
			 tipThicknessString.append(tipThickness.getText());
			 StringBuilder backThicknessString = new StringBuilder("back_thickness=");
			 backThicknessString.append(backThickness.getText());
			 StringBuilder heartThicknessString = new StringBuilder("heart=");
			 heartThicknessString.append(heartThickness.getText());
			 
			 ProcessBuilder pb = new ProcessBuilder("./bin/openscad/openscad",
					   								"-o", "./stl/my_reed.stl",
					   								"-D", lengthString.toString(),
					   								"-D", tipWidthString.toString(),
					   								"-D", backWidthString.toString(),
					   								"-D", tipThicknessString.toString(),
					   								"-D", backThicknessString.toString(),
					   								"-D", heartThicknessString.toString(),
					   								"./data/new_reed.scad");
			 
			 try {
				 Process process = pb.start();
				 process.waitFor();
			 } catch (IOException | InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
     }
	 
}
