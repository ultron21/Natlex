# Natlex
The project is an autotests using: Java, Selenide, JUnit 5, Gradle.


The core of the library. Main methods are open, $ and $$ (import static com.codeborne.selenide.Selenide.* for readability):
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

com.codeborne.selenide.SelenideElement [src] [javadoc]
The SelenideElement class describes an element found on the page. The object of this class can be acquired e.g. by the $ command. The following useful methods are defined in the class.

Inner elements search methods
find(String cssSelector) / $(String cssSelector)
find(By) / $(By)
findAll(String cssSelector) / $$(String cssSelector)
findAll(By) / $$(By)

open(String URL) opens the browser (if yet not opened) and loads the URL
$(String cssSelector) – returns object of the SelenideElement class that represents first element found by CSS selector on the page.
$(By) – returns "first SelenideElement" by the locator of the By class.
