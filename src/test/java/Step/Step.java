package Step;

import org.example.Environments;
import org.openqa.selenium.WebDriver;

public class Step {

    protected static WebDriver driver;
    public Step(WebDriver driver) {
        super();
        Step.driver = driver;
    }

    public void goTo(){
       new Environments(driver).goToPro();
    }


    // Pasos de nuestro test para gestionar las cookies

}
