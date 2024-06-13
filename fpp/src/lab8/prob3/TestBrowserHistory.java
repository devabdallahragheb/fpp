package lab8.prob3;

public class TestBrowserHistory {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home.html"); // Start with home.html
        browser.visit("page1.html"); // Current URL
        browser.visit("page2.html"); // Current URL
        browser.back(); // Goto page1.html
        browser.back(); // Goto home.html
        browser.back(); //Trying to back again -> No action
        browser.forward(); // Goto page1.html
        browser.forward(); // Goto page2.html
        browser.forward(); // Trying to forward again -> No action
        browser.visit("page3.html"); // Current URL
    }
}
