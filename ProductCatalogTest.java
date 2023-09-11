import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ProductCatalogTest {

    @Test
   void testSomething() {
        open("https://mejuri.com/world/en#");
        $("#onetrust-accept-btn-handler").click();
        $("#__next .cCHlFz .dpFmfQ .gmNOlo ul li .cEWIkl").click();
        $("#input-email").setValue("p.okwaraebuzie@gmail.com");
        $("#input-password").setValue("Testone1");
        $("form").submit();
        open("https://mejuri.com/world/en/shop/products/honey-signet?qID=9142fcd21e36d190feef6adae656906a");
        $(".jVynKt").click();
        open("https://mejuri.com/world/en/account/my-wishlist");



        /**product search method**/
       // open("https://mejuri.com/world/en#");
       // $("#nav-dp-l1-user-navigation-signup-icon").click();
       //  $(By.name("input-email")).setValue("p.okwaraebuzie@gmail.com");
       //  $(By.name("input-password")).setValue("Testone1");
       //  $("#submit").click();
       // $("#__next .cCHlFz .dpFmfQ .gmNOlo ul li .iZjJDZ").click();
       // open("https://mejuri.com/world/en/shop/products/honey-signet?qID=9142fcd21e36d190feef6adae656906a");




    }

    @Test
    void test(){
        System.out.println("https://mejuri.com/world/en#");
    }
}
