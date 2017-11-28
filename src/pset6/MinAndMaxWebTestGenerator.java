package pset6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinAndMaxWebTestGenerator {
    public static void main(String[] a) {
        String suite = new MinAndMaxWebTestGenerator().createTestSuite();
        System.out.println(suite);
    }
    String createTestSuite() {
        StringBuilder sb = new StringBuilder();
        sb.append(packageDecl());
        sb.append("\n");
        sb.append(imports());
        sb.append("\n");
        sb.append(testsuite());
        return sb.toString();
    }
    String packageDecl() {
        return "package pset6;\n";
    }
    String imports() {
        return "        import static org.junit.Assert.*;\n" +
                "\n" +
                "        import org.junit.*;\n" +
                "\n" +
                "        import org.junit.Test;\n" +
                "\n" +
                "        import org.openqa.selenium.By;\n" +
                "        import org.openqa.selenium.WebDriver;\n" +
                "        import org.openqa.selenium.WebElement;\n" +
                "        import org.openqa.selenium.firefox.FirefoxDriver;";
    }
    String testsuite() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class MinAndMaxWebTestSuite {\n");
// your code goes here
// ...
        sb.append("    public static WebDriver wd;\n" +
                "    @BeforeClass\n" +
                "    public static void setUpClass(){\n" +
/*
                "        System.setProperty(\"webdriver.gecko.driver\",\"D:\\\\\\\\geckodriver.exe\");\n" +
*/
                "        wd = new FirefoxDriver(); // launch the browser\n" +
                "// edit the next line to enter the location of \"min.html\" on your file system\n" +
                "        wd.get(\"file:///C:/Users/Leon/Desktop/min.html\");\n" +
                "    }\n" +
                "    @AfterClass\n" +
                "    public static void tearDownClass(){\n" +
                "        wd.quit(); // close the browser window\n" +
                "    }\n");
        Map<Integer, String> m = new HashMap<>();
        m.put(0, "infinity");
        m.put(1, "-3");
        m.put(2, "0");
        m.put(3, "7");
        int testNum = 0;
        for(int e = 0; e < 2; e++) {
            for (int a = 0; a < 4; a++) {
                for (int b = 0; b < 4; b++) {
                    for (int c = 0; c < 4; c++) {
                        for (int d = 0; d < 2; d++) {
                            ArrayList<Integer> nums = new ArrayList<>();
                            nums.add(a);
                            nums.add(b);
                            nums.add(c);


                            sb.append("@Test public void t" + Integer.toString(testNum) + "(){\n");
                            sb.append("wd.navigate().refresh();\n");
                            sb.append("\tWebElement we = wd.findElement(By.id(\"x\"));\n");
                            sb.append("\twe.sendKeys(\"" + m.get(a) + "\");\n");
                            sb.append("\twe = wd.findElement(By.id(\"y\"));\n");
                            sb.append("\twe.sendKeys(\"" + m.get(b) + "\");\n");
                            sb.append("\twe = wd.findElement(By.id(\"z\"));\n");
                            sb.append("\twe.sendKeys(\"" + m.get(c) + "\");\n");

                            //select min or max
                            if(e == 0){//min
                                sb.append("\twe = wd.findElement(By.id(\"min\"));\n");
                                sb.append("\twe.click();\n");
                            }

                            //click or not
                            sb.append("\twe = wd.findElement(By.id(\"computeButton\"));\n");
                            if (d == 0) sb.append("\twe.click();\n");
                            sb.append("\tWebElement result = wd.findElement(By.id(\"result\"));\n");
                            sb.append("\tString output = result.getText();\n");
                            if (d == 0) {//click
                                if (a == 0 || b == 0 || c == 0) {
                                    sb.append("\tassertEquals(\"Please enter integer values only!\", output);\n");
                                } else {
                                    if (e == 0) {//min
                                        sb.append("\tassertEquals(\"min(" + m.get(a) + ", " + m.get(b) + ", " + m.get(c) + ") = " + m.get(findMin(nums)) + "\", output);\n");
                                    }
                                    else{
                                        sb.append("\tassertEquals(\"max(" + m.get(a) + ", " + m.get(b) + ", " + m.get(c) + ") = " + m.get(findMax(nums)) + "\", output);\n");
                                    }
                                }
                            } else {//don't click
                                sb.append("\tassertEquals(\"\",output);\n");
                            }
                            sb.append("}\n");
                            testNum++;

                        }
                    }
                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }
    // implement any helper methods that you need in this class
    public int findMin(ArrayList<Integer> nums){
        if(nums.contains(1)) return 1;
        if(nums.contains(2)) return 2;
        if(nums.contains(3)) return 3;
        return 0;
    }
    public int findMax(ArrayList<Integer> nums){
        if(nums.contains(3)) return 3;
        if(nums.contains(2)) return 2;
        if(nums.contains(1)) return 1;
        return 0;
    }
}