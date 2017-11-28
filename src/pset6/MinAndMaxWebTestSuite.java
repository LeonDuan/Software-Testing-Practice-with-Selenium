        package pset6;

        import static org.junit.Assert.*;

        import org.junit.*;

        import org.junit.Test;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;
public class MinAndMaxWebTestSuite {
    public static WebDriver wd;
    @BeforeClass
    public static void setUpClass(){
        wd = new FirefoxDriver(); // launch the browser
// edit the next line to enter the location of "min.html" on your file system
        wd.get("file:///C:/Users/Leon/Desktop/min.html");
    }
    @AfterClass
    public static void tearDownClass(){
        wd.quit(); // close the browser window
    }
    @Test public void t0(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t1(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t2(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t3(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t4(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t5(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t6(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t7(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t8(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t9(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t10(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t11(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t12(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t13(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t14(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t15(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t16(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t17(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t18(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t19(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t20(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t21(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t22(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t23(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t24(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t25(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t26(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t27(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t28(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t29(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t30(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t31(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t32(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t33(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t34(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t35(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t36(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t37(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t38(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t39(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t40(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t41(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t42(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(-3, -3, -3) = -3", output);
    }
    @Test public void t43(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t44(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(-3, -3, 0) = -3", output);
    }
    @Test public void t45(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t46(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(-3, -3, 7) = -3", output);
    }
    @Test public void t47(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t48(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t49(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t50(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(-3, 0, -3) = -3", output);
    }
    @Test public void t51(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t52(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(-3, 0, 0) = -3", output);
    }
    @Test public void t53(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t54(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(-3, 0, 7) = -3", output);
    }
    @Test public void t55(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t56(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t57(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t58(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(-3, 7, -3) = -3", output);
    }
    @Test public void t59(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t60(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(-3, 7, 0) = -3", output);
    }
    @Test public void t61(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t62(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(-3, 7, 7) = -3", output);
    }
    @Test public void t63(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t64(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t65(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t66(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t67(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t68(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t69(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t70(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t71(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t72(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t73(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t74(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(0, -3, -3) = -3", output);
    }
    @Test public void t75(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t76(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(0, -3, 0) = -3", output);
    }
    @Test public void t77(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t78(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(0, -3, 7) = -3", output);
    }
    @Test public void t79(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t80(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t81(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t82(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(0, 0, -3) = -3", output);
    }
    @Test public void t83(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t84(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(0, 0, 0) = 0", output);
    }
    @Test public void t85(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t86(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(0, 0, 7) = 0", output);
    }
    @Test public void t87(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t88(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t89(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t90(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(0, 7, -3) = -3", output);
    }
    @Test public void t91(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t92(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(0, 7, 0) = 0", output);
    }
    @Test public void t93(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t94(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(0, 7, 7) = 0", output);
    }
    @Test public void t95(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t96(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t97(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t98(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t99(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t100(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t101(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t102(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t103(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t104(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t105(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t106(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(7, -3, -3) = -3", output);
    }
    @Test public void t107(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t108(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(7, -3, 0) = -3", output);
    }
    @Test public void t109(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t110(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(7, -3, 7) = -3", output);
    }
    @Test public void t111(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t112(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t113(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t114(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(7, 0, -3) = -3", output);
    }
    @Test public void t115(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t116(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(7, 0, 0) = 0", output);
    }
    @Test public void t117(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t118(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(7, 0, 7) = 0", output);
    }
    @Test public void t119(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t120(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t121(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t122(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(7, 7, -3) = -3", output);
    }
    @Test public void t123(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t124(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(7, 7, 0) = 0", output);
    }
    @Test public void t125(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t126(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("min(7, 7, 7) = 7", output);
    }
    @Test public void t127(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("min"));
        we.click();
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t128(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t129(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t130(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t131(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t132(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t133(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t134(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t135(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t136(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t137(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t138(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t139(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t140(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t141(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t142(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t143(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t144(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t145(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t146(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t147(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t148(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t149(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t150(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t151(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t152(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t153(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t154(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t155(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t156(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t157(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t158(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t159(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t160(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t161(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t162(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t163(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t164(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t165(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t166(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t167(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t168(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t169(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t170(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(-3, -3, -3) = -3", output);
    }
    @Test public void t171(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t172(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(-3, -3, 0) = 0", output);
    }
    @Test public void t173(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t174(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(-3, -3, 7) = 7", output);
    }
    @Test public void t175(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t176(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t177(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t178(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(-3, 0, -3) = 0", output);
    }
    @Test public void t179(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t180(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(-3, 0, 0) = 0", output);
    }
    @Test public void t181(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t182(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(-3, 0, 7) = 7", output);
    }
    @Test public void t183(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t184(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t185(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t186(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(-3, 7, -3) = 7", output);
    }
    @Test public void t187(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t188(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(-3, 7, 0) = 7", output);
    }
    @Test public void t189(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t190(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(-3, 7, 7) = 7", output);
    }
    @Test public void t191(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t192(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t193(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t194(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t195(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t196(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t197(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t198(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t199(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t200(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t201(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t202(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(0, -3, -3) = 0", output);
    }
    @Test public void t203(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t204(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(0, -3, 0) = 0", output);
    }
    @Test public void t205(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t206(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(0, -3, 7) = 7", output);
    }
    @Test public void t207(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t208(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t209(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t210(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(0, 0, -3) = 0", output);
    }
    @Test public void t211(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t212(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(0, 0, 0) = 0", output);
    }
    @Test public void t213(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t214(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(0, 0, 7) = 7", output);
    }
    @Test public void t215(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t216(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t217(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t218(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(0, 7, -3) = 7", output);
    }
    @Test public void t219(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t220(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(0, 7, 0) = 7", output);
    }
    @Test public void t221(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t222(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(0, 7, 7) = 7", output);
    }
    @Test public void t223(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("0");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t224(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t225(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t226(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t227(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t228(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t229(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t230(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t231(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t232(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t233(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t234(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(7, -3, -3) = 7", output);
    }
    @Test public void t235(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t236(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(7, -3, 0) = 7", output);
    }
    @Test public void t237(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t238(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(7, -3, 7) = 7", output);
    }
    @Test public void t239(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t240(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t241(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t242(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(7, 0, -3) = 7", output);
    }
    @Test public void t243(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t244(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(7, 0, 0) = 7", output);
    }
    @Test public void t245(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t246(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(7, 0, 7) = 7", output);
    }
    @Test public void t247(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("0");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t248(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }
    @Test public void t249(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("infinity");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t250(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(7, 7, -3) = 7", output);
    }
    @Test public void t251(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("-3");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t252(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(7, 7, 0) = 7", output);
    }
    @Test public void t253(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("0");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
    @Test public void t254(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        we.click();
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("max(7, 7, 7) = 7", output);
    }
    @Test public void t255(){
        wd.navigate().refresh();
        WebElement we = wd.findElement(By.id("x"));
        we.sendKeys("7");
        we = wd.findElement(By.id("y"));
        we.sendKeys("7");
        we = wd.findElement(By.id("z"));
        we.sendKeys("7");
        we = wd.findElement(By.id("computeButton"));
        WebElement result = wd.findElement(By.id("result"));
        String output = result.getText();
        assertEquals("",output);
    }
}

