/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Joseph Schander
 */
package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.net.URL;
import java.time.LocalDate;
import java.util.Collection;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        dateButton.setValue(LocalDate.now());
    }
    @FXML
    private Button addButton;
    @FXML
    private DatePicker dateButton;
    @FXML
    private TextField itemDescText;
    @FXML
    private MenuItem clearList;
    @FXML
    private MenuItem removeItem;
    @FXML
    private MenuItem editDesc;
    @FXML
    private MenuItem showAll;
    @FXML
    private MenuItem sortIncomplete;
    @FXML
    private MenuItem sortComplete;
    @FXML
    private MenuItem editDate;
    @FXML
    private Button completeButton;
    @FXML
    ListView<Item> listView;
    ObservableList<Item> list = FXCollections.observableArrayList();
    @FXML
    // adds an item with the selected date and typed description
    public void addItem(ActionEvent e){
        list.add(new Item('N',dateButton.getValue(),itemDescText.getText()));
        listView.setItems(list);
        //reset fields
        dateButton.setValue(LocalDate.now());
        itemDescText.setText("");
    }
    // marks the selected item as complete
    public void markComplete(ActionEvent e){
        if (listView.getSelectionModel().getSelectedItem().getComplete() == 'N'){
            listView.getSelectionModel().getSelectedItem().setComplete('Y');
        }
        else if (listView.getSelectionModel().getSelectedItem().getComplete() == 'Y'){
            listView.getSelectionModel().getSelectedItem().setComplete('N');
        }
        listView.refresh();
    }
    // clears the list of all items
    public void clearList(ActionEvent e){
        list.clear();
        listView.getItems().removeAll();
        listView.setItems(null);
        listView.refresh();
    }
    // removes the selected item from the list
    public void removeItem(ActionEvent e){
        list.remove(list.get(listView.getSelectionModel().getSelectedIndex()));
        listView.setItems(list);
        listView.refresh();
    }
    //replaces the date with the current date in the date picker
    public void editDate(ActionEvent e){
        listView.getSelectionModel().getSelectedItem().setDate(dateButton.getValue());
        dateButton.setValue(LocalDate.now());
        listView.refresh();
    }
    // replaces the selected description with the typed in description
    public void editDesc(ActionEvent e){
        listView.getSelectionModel().getSelectedItem().setDescription(itemDescText.getText());
        itemDescText.setText("");
        listView.refresh();

    }
    // goes through the list and shows all complete items in the list
    public void showComplete(ActionEvent e){
        ObservableList<Item> list2 = FXCollections.observableArrayList();
        for (int i = 0 ; i < list.size() ; i++){
            if(list.get(i).getComplete() == 'Y'){
                list2.add(list.get(i));
            }
        }
        listView.setItems(list2);
    }
    // goes through the list and shows all incomplete items in the list
    public void showIncomplete(ActionEvent e){
        ObservableList<Item> list2 = FXCollections.observableArrayList();
        for (int i = 0 ; i < list.size() ; i++){
            if(list.get(i).getComplete() == 'N'){
                list2.add(list.get(i));
            }
        }
        listView.setItems(list2);
    }
    // shows all items in the list
    public void showAll(ActionEvent e){
        listView.setItems(list);
    }


}