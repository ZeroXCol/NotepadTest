package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.OpenBrowser;
import tasks.TypeInTheNotePad;

public class NotepadStepDefinitions {
    private String user;
    private String password;

    @Managed(driver = "chrome")
    private WebDriver herbrowser;
    private Actor userTester = Actor.named("Fabian");

    @Before
    public void permissions(){
        userTester.can(BrowseTheWeb.with(herbrowser));
    }

        @Given("I'm in the page of note pad")
        public void iMInThePageOfNotePad() {
            userTester.attemptsTo(OpenBrowser.withUrl("https://www.online-notepad.net/es/bloc-de-notas-online"));
        }
        @When("I type my notes")
        public void iTypeMyNotes() {

        userTester.attemptsTo(TypeInTheNotePad.withText("Esto deberia ir en un Excel con escenario outline pero el tiempo apremia."));
        }
        @Then("The words are in bold")
        public void theWordsAreInBold() {

        }

    }

