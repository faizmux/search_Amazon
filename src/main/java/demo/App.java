/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        // Initialize your test class
        //TestCases tests = new TestCases(); 
        Search_Amazon search = new Search_Amazon();
        //TODO: call your test case functions one after other here

        //tests.testCase01();
        search.searchAmazon();
        // End your test by clearning connections and closing browser
        //tests.endTest();
        search.endTest();
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
