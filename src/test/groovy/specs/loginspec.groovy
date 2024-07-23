package specs

import geb.spock.GebSpec
import pageobjects.LoginPage
import spock.lang.Unroll


class LoginPageSpec extends GebSpec {

    def countryCode = "ac"

    @Unroll
    def "test login page"() {
        when: "I go to the login page"
        to LoginPage

        then: "I am at the login page"
        at LoginPage

        when: "I login with valid credentials"
        page.login("OjgjJclR0XSkhiev", "QApassword@123")

        then: "I am successfully logged in"

    }
}