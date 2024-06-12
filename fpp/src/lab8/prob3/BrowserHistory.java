package lab8.prob3;

import java.util.Stack;

public class BrowserHistory {

    private final Stack<String> backStack = new Stack<>();
    private final Stack<String> forwardStack = new Stack<>();
    private String currentUrl;

    public BrowserHistory(String url) {
        currentUrl = url;
    }

    public void visit(String newUrl) {
        backStack.push(currentUrl);
        currentUrl = newUrl;
        System.out.println(STR."Visited: \{currentUrl}");
    }

    public void forward() {
        if (forwardStack.empty()) {
            return;
        }
        backStack.push(currentUrl);
        currentUrl = forwardStack.pop();
        System.out.println(STR."Forward: \{currentUrl}");
    }

    public void back() {
        if (backStack.empty()) {
            return;
        }
        forwardStack.push(currentUrl);

        currentUrl = backStack.pop();
        System.out.println(STR."Back to: \{currentUrl}");

    }
}
