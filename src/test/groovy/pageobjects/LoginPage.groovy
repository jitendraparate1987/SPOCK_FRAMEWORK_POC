package pageobjects

import geb.Page
import org.openqa.selenium.By

class LoginPage extends Page {

    static at = {
        print(driver.getCurrentUrl())
        title == "MarkersPro Login"
        waitFor {usernameField.displayed}
        waitFor {passwordField.displayed}
        waitFor {loginButton.displayed}

    }

    static content = {
        usernameField { $(By.xpath("//input[@id='Username']")) }
        passwordField { $(By.xpath("//input[@id='Password']")) }
        loginButton { $(By.xpath("//button[@type='submit']")) }
    }

    void login(String username, String password) {
        driver.manage().window().maximize()
        usernameField.value(username)
        passwordField.value(password)
        loginButton.click()


    }
}