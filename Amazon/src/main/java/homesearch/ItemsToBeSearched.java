package homesearch;

import base.CommonAPI;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI{

    DataReader dr = new DataReader();
    @Test
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/data/Book1.xls";
        String [] data = dr.fileReader(path);
        return data;
    }


    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"/data/file1.xls";
        String [] data = dr.fileReader(path);
        return data;
    }
}
