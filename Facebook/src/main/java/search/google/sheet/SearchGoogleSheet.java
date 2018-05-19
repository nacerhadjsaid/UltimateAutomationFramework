package search.google.sheet;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utility.GoogleSheetReader.getSheetsService;

public class SearchGoogleSheet extends CommonAPI {

    public void logIn(){
        typeByXpath("//*[@name='email']", "nacer7hadj@gmail.com");
        typeByXpath("//*[@name='pass']", "newaccount123");
        clickByXpath("//*[@id='loginbutton']");
    }

    public List<List<Object>> getSpreadSheetRecords(String spreadSheetID, String range) throws IOException{
        //build a authorize api client service
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values().get(spreadSheetID,range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0){
            return null;
        }else{
            return values;
        }
    }

    public List<String> searchItemsByName(String spreadSheetID, String range) throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords(spreadSheetID,range);
        List<String> actual = new ArrayList<String >();
        for(List row : values){
            sleepFor(2);
            typeByXpathEnter("//*[@name='q']",row.get(0).toString());
            sleepFor(2);
            actual.add(getCurrentPageUrl());
            clearInputByXpath("//*[@name='q']");
            sleepFor(2);
        }return actual;
    }
}
