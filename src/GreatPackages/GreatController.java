
package GreatPackages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GreatController {

   public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
  }
    public  GreatController(){
        
         MenuBar menubar=new MenuBar();
         Menu File=new Menu("File");
         Menu Edit=new Menu("Edit");
         Menu Format=new Menu("Format");
         Menu View=new Menu("View");
         Menu Help=new Menu("Help");       
        menubar.getMenus().addAll(File,Edit,Format,View,Help);
       
        MenuItem New=new MenuItem("New");
        MenuItem Open=new MenuItem("Open");
        MenuItem Save=new MenuItem("Save");
        MenuItem SaveAs=new MenuItem("Save As");
        MenuItem Print=new MenuItem("Print");
        MenuItem Exit=new MenuItem("Exit");
        
        
        MenuItem Copy=new MenuItem("Copy");
        MenuItem Cut=new MenuItem("Cut");
        MenuItem Paste=new MenuItem("Paste");
        MenuItem Delete=new MenuItem("Delete");
        
        MenuItem WordWrap=new MenuItem("Word Wrap");
        MenuItem Font=new MenuItem("Font...");
        
        MenuItem Zoom=new MenuItem("Zoom");
        CheckMenuItem StatusBar=new CheckMenuItem("Status Bar");
        
        
        MenuItem ViewHelp=new MenuItem("View Help");
        MenuItem SendFeedBack=new MenuItem("Send Feed Back");
        
        MenuItem AboutNotepad=new MenuItem("About Notepad");
        
        File.getItems().addAll(New,Open,Save,SaveAs,Print,Exit);
        Edit.getItems().addAll(Copy,Cut,Paste,Delete);
        Format.getItems().addAll(WordWrap,Font);
        View.getItems().addAll(Zoom,StatusBar);
        Help.getItems().addAll(ViewHelp,SendFeedBack,AboutNotepad);
        
        
        
        TextArea tt=new TextArea();
        tt.setMaxHeight(1000);
        tt.setMaxWidth(1000);
        Open.setOnAction(ActionEvent->{
            FileChooser ff=new FileChooser();
            ff.setTitle("Open File");
            ff.showOpenDialog(null);
            
        });
        Save.setOnAction((ActionEvent ActionEvent)->{
                FileChooser fff=new FileChooser();
                FileChooser.ExtensionFilter ext=new FileChooser.ExtensionFilter("txtfls", "*.txt");
                File f1=fff.showSaveDialog(null);
                fff.setTitle("Save File");
               
             try {
                  FileWriter ffff = new FileWriter(f1);
                   ffff.write(tt.getText());
             } catch (IOException ex) {
                 Logger.getLogger(GreatController.class.getName()).log(Level.SEVERE, null, ex);
             }
                   
                
                });
        GridPane gg=new GridPane();
        gg.add(menubar, 0, 0);
        gg.add(tt, 0, 1);
        
        
        Group group=new Group();
        group.getChildren().add(gg);
        Scene scene=new Scene(group);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.setMaxWidth(600);
        stage.setMaxHeight(400);
        stage.setTitle("Notepad");
        stage.show();
        
        
    }

    }
   