package Excelhashmap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReaderUsingHashmap {

    public static final String Excelloc = "E:\\Automation Workspace Backup 26-05-2023\\SELENIUM\\HasmapExcel.xlsx";

    private static FileInputStream fis;
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;

    public static void LoadExcel() throws IOException {

        System.out.println("Loading Excel data...");
        File file = new File(Excelloc);
        fis = new FileInputStream(file);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet("Login");
        fis.close();

    }

    public static Map<String, Map<String,String>>getDatamap() throws Exception {
        if (sheet == null) {
            LoadExcel();
        }

        Map<String, Map<String,String>> supermap = new HashMap<String, Map<String,String>>();
        int lastRowNum = sheet.getLastRowNum();
        int lastColNum = sheet.getRow(0).getLastCellNum();
        Map<String,String>Mymap = new HashMap<String, String>();
        for(int i = 0; i <lastRowNum ; i++) {
            row = sheet.getRow(i);
            String Keycell  = row.getCell(0).getStringCellValue();

            for (int j = 0; j < lastColNum; j++) {
                String value = row.getCell(j).getStringCellValue();
                Mymap.put(value, sheet.getRow(i + 1).getCell(j).getStringCellValue());
            }

            supermap.put(Keycell, new HashMap<>(Mymap));
            Mymap.clear();
        }
        return supermap;
    }

    public static String getvalue(String key) throws Exception {
        Map<String, Map<String, String>> dataMap = getDatamap();

        for (Map.Entry<String, Map<String, String>> entry : dataMap.entrySet()) {
            Map<String, String> myval = entry.getValue();
            String retvalue = myval.get(key);
            if (retvalue != null) {
                return retvalue;
            }
        }

        return null; // or handle the case when the key is not found
    }


    public static void main(String[]args) throws Exception {

        System.out.println(getvalue("Username"));
        System.out.println(getvalue("Password"));

    }


}
