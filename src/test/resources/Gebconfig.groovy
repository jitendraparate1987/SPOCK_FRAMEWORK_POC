import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

driver = {
    System.setProperty('webdriver.chrome.driver', 'C:\\Users\\Jitendra Parate\\IdeaProjects\\SPOCK\\src\\test\\resources\\drivers\\chromedriver.exe')
   // ChromeOptions options = new ChromeOptions()
    //options.addArguments('--headless')
    new ChromeDriver()
}

baseUrl = "http://matrix.qa.markerspro.in/"

waiting {
    timeout = 20  // Default timeout for wait operations
    retryInterval = 1  // Interval between retries during waiting
    includeCauseInMessage = true  // Whether to include the cause of timeout in the exception message
}


