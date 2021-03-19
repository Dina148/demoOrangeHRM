package utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

import java.io.File;
import java.io.IOException;

public class BrowserUtils {

    public static void selectByIndex(WebElement element,int indexNumber){
        Select select=new Select(element);
        select.selectByIndex(indexNumber);
    }
    public static void selectByValue(WebElement element,String value){
        Select select=new Select(element);
        select.selectByValue(value);
    }
    public static void selectByText(WebElement element,String text){
        Select select=new Select(element);
        select.selectByVisibleText(text);
    }
    public static String takeScreenShot(){
        //we use getScreenshotAs method to gete the screenshot from our driver.
        //we convert output to the File type.

        File source=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        //System.getProperty("user.dir");-->it will give the current project file directory.
        //CurrentTimeMillis()-->we use this method to get unique name for our every screenshot file
        String destination=System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
        //create one file object for destination
        File des=new File(destination);
        try {
            FileUtils.copyFile(source, des);
        }catch(IOException e){
            e.printStackTrace();
        }
        return destination;
    }
}

