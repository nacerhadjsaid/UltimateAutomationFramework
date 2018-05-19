package testcelldata;

import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import tabledata.ReadDataFromTable;

public class TestReadDataFromTable extends ReadDataFromTable{

    @Test
    public void read(){
        ApplicationLog.epicLogger("Browser launched");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readData();
    }

}
