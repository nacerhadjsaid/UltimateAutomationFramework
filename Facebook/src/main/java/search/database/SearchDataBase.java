package search.database;

import base.CommonAPI;
import database.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class SearchDataBase extends CommonAPI{
    public void logIn(){
        typeByXpath("//*[@name='email']", "nacer7hadj@gmail.com");
        typeByXpath("//*[@name='pass']", "newaccount123");
        clickByXpath("//*[@id='loginbutton']");
    }
    //insert data to database
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Nikelback");
        itemsList.add("Green Day");
        itemsList.add("Dire Straights");
        itemsList.add("Black Eyed Peace");
        return itemsList;
    }
    //put Data to DB-Mysql
    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql1(getItemValue(),"MusicBands","");
    }
    //bring data from db and search using them
    public void searchByDB() throws Exception {
        ConnectDB connectDB = new ConnectDB();
            List<String> items = connectDB.readDataBase("MusicBands","Names");
            for (int i = 0; i < items.size(); i++) {
                typeByXpathEnter("//*[@name='q']", items.get(i));
                clearInputByXpath("//*[@name='q']");
        }
    }
}
