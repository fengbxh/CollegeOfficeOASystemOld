package cn.edu.usts.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TeacherControllerTest {

    //WebDriver webDriver;
    ChromeDriver chromeDriver;
    @Before
    public void setUp() throws Exception {
        // 加载浏览器驱动
        System.setProperty("webdriver.chrome.driver","/Users/bixinghua/Downloads/chromedriver");
        chromeDriver = new ChromeDriver();

    }

    @After
    public void tearDown() throws Exception {
    }
    //登陆测试
    @Test
    public void Login() throws InterruptedException {
        chromeDriver.get("http://localhost:8080");
        chromeDriver.findElement(By.id("login_username")).sendKeys("admin");
        chromeDriver.findElement(By.id("login_password")).sendKeys("123456");
        chromeDriver.findElement(By.id("login_sub")).click();
    }

    @Test
    public void selectTeacher() throws InterruptedException {
        chromeDriver.get("http://localhost:8080");
        chromeDriver.findElement(By.id("login_username")).sendKeys("admin");
        chromeDriver.findElement(By.id("login_password")).sendKeys("123456");
        chromeDriver.findElement(By.id("login_sub")).click();
        WebDriverWait wait=new WebDriverWait(chromeDriver, 10);
        WebElement wl= wait("a_teacherinfo",wait);
        chromeDriver.findElement(By.id("a_teacherinfo")).click();
        wl= wait("a_teacherlist",wait);
        chromeDriver.findElement(By.id("a_teacherlist")).click();

    }
    private WebElement wait(final String control, WebDriverWait webDriverWait){
        return webDriverWait.until(new ExpectedCondition<WebElement>() {

            @Override

            public WebElement apply(WebDriver d) {

                return d.findElement(By.id(control));

            }

        });
    }
}