import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PachinkoPage extends HentaiHeroesPage{

    public PachinkoPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#pachinko_left > div.right_part > div:nth-child(2) > button.blue_text_button.left_pck1")
    private WebElement pachinkoGratuit;

    @FindBy(css = "#pachinko_left > div.left_part > h3")
    private WebElement reperePatchinko;

    public void collectPachinkoGratuit(WebDriver driver) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOf(reperePatchinko));
        if(pachinkoGratuit.isDisplayed()) {
            pachinkoGratuit.click();
        }
        //ajouter le click manquant
        getHeader().openHomePage(driver);
    }
}
