import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQATest extends PageSetup {


    @Test
    public void test1() {
        WebElement buttonUsingID = driver.findElement(By.id("idExample"));
        buttonUsingID.click();

        WebElement buttonSuccesText = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals("Button success", buttonSuccesText.getText());

    }

    @Test
    public void test2() throws InterruptedException {
        WebElement nameTextField = driver.findElement(By.id("et_pb_contact_name_0"));
        nameTextField.sendKeys("Tester");

        WebElement emailTextField = driver.findElement(By.id("et_pb_contact_email_0"));
        emailTextField.sendKeys("adamtester@test.com");

        Thread.sleep(2000);

        WebElement emailmeButton = driver.findElement(By.name("et_builder_submit_button"));
        emailmeButton.click();

        Thread.sleep(3000);

        WebElement TFCUT = driver.findElement(By.xpath("//div[@class='et-pb-contact-message']/p"));
        Assertions.assertEquals("Thanks for contacting us", TFCUT.getText());
    }


}
