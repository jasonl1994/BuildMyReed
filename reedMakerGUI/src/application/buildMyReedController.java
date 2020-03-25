package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.*;

public class buildMyReedController implements Initializable{
	 @FXML
	 private TextField rLength;
	 @FXML
	 private TextField tRound;
	 @FXML
	 private TextField tThickness;
	 @FXML
	 private TextField tWidth;
	 @FXML
	 private Button cButton;
	 @Override
	 public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	 }
	 
	 public void cButtonClicked() throws IOException,  
	 									 InterruptedException {
	       
		 StringBuilder lengthString = new StringBuilder("length=");
		 
		 ProcessBuilder pb = new ProcessBuilder("./bin/openscad/openscad",
				   								"-o", "./stl/my_reed.stl",
				   								"-D", lengthString.toString(),
				   								"./data/reed.scad");
		 Process process = pb.start();
		 process.waitFor();

		 System.out.println("STL file generated!");
		 
	   }


}
