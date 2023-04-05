package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class TechproStepdefinition {
    @Given("techproeducation sayfasına gidilir")
    public void techproeducationSayfasınaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }

    @When("sayfa basligi yazdirilir")
    public void sayfaBasligiYazdirilir() {
        System.out.println(Driver.getDriver().getTitle());
    }

    @Then("sayfa basliginda Bootcamp yazisi oldugu test edilir")
    public void sayfaBasligindaBootcampYazisiOlduguTestEdilir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Bootcamp"));
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }
}