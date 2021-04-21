import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejerciciotarea {

    @Test
    public void netflixUno(){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/co/");

        System.out.println("El titulo es " + driver.getTitle());

        List<WebElement> listah1 = driver.findElements(By.tagName("h1"));
        System.out.println("el numero total de h1 es" + listah1.size());

        List<WebElement> listah2 = driver.findElements(By.tagName("h2"));
        System.out.println("el numero total de h2 es" + listah2.size());

        List<WebElement> listalinks = driver.findElements(By.tagName("a"));
        System.out.println("El numero de links que hay es: " + listalinks.size());

        for (WebElement link: listalinks){
            if (link.getText().isEmpty() == false){
                System.out.println("link: --> " + link.getText());

            }
        }
        List<WebElement>listaButtons= driver.findElements(By.tagName("button"));
        System.out.println("La catidad de botones que hay es " + listaButtons.size());
        for (WebElement button:  listaButtons){
            if (button.getText().isEmpty() == false){
            System.out.println("button: --> " + button.getText());
            }
        }

        List<WebElement>divElements= driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de div que hay es " + divElements.size());
    }
}
