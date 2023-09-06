package itheima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class WebClientService {
    public static void main(String[] args) {
        WebDriver driver =new EdgeDriver();
        driver.get("http://www.fyzserver.com/data/H5/HFWX/Home/appoint.php");

        driver.findElement(By.id("pc_change_know")).click();
        driver.findElement(By.id("pc_know")).click();
        //driver.close();
        driver.findElement(By.id("pc_date")).sendKeys("2023-09-20");
        List<WebElement> elements = driver.findElements(By.className("layui-icon-ok"));
        elements.get(3).click();elements.get(4).click();elements.get(5).click();
        driver.findElement(By.id("dyy2")).click();

        driver.findElements(By.className("layui-edge")).get(5).click();
        driver.findElement(By.id("pc_danwei")).sendKeys("安徽省水利水电勘测设计研究总院有限公司");

        List<WebElement> dd = driver.findElements(By.tagName("dd"));
        dd.get(26).click();

        driver.findElements(By.className("layui-edge")).get(6).click();
        dd.get(37).click();

        driver.findElement(By.id("pc_small")).sendKeys("25");

        driver.findElements(By.className("layui-edge")).get(7).click();
        dd.get(46).click();

        driver.findElement(By.id("pc_name")).sendKeys("王静");
        driver.findElement(By.id("pc_phone")).sendKeys("13805604923");
        driver.findElement(By.id("pc_email")).sendKeys("1270751771@qq.com");

        driver.findElement(By.className("pc_upload")).click();

        //driver.findElement(By.className("pc_upload")).sendKeys("C:\\Users\\Administrator\\Desktop\\1.png");
        //driver.findElement(By.className("pc_submit")).click();
    }
}