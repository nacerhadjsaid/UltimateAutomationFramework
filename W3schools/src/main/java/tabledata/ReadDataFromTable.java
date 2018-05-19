package tabledata;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

import java.util.List;

public class ReadDataFromTable extends CommonAPI{

    public void readData() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //read table
//        String cellData = getTextByCss(".w3-table-all.notranslate");
//        System.out.println(cellData);

        //read row in table (tr = table row)
//        String cellData = getTextByCss(".w3-table-all.notranslate tr:nth-child(3)");
//        System.out.println(cellData);

        //read specifique element in table (td = table data) cross row/data(column)
//        String cellData = getTextByCss(".w3-table-all.notranslate tr:nth-child(3) td:nth-child(2)");
//        System.out.println(cellData);

        //method1
//        List<String> list = getTextFromWebElement(".w3-table-all.notranslate tr");
//        for (String cellData : list){
//            System.out.println(cellData);
//        }

        //method2
        List<String> list = getTextFromWebElements(".w3-table-all.notranslate tr");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
