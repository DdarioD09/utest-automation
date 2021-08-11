package co.com.choucair.challenge.utestautomation.stepdefinitions;

import co.com.choucair.challenge.utestautomation.tasks.FillBasicInfo;
import co.com.choucair.challenge.utestautomation.tasks.FillDevicesInfo;
import co.com.choucair.challenge.utestautomation.tasks.FillLocationInfo;
import co.com.choucair.challenge.utestautomation.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestCreateUserStepDefinition {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Dario wants to register as a new user$")
    public void thatDarioWantsToRegisterAsANewUser() {
        OnStage.theActor("Dario").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fill the personal information form$")
    public void heFillThePersonalInformationForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillBasicInfo.form(), FillLocationInfo.form(), FillDevicesInfo.form());
    }

    @When("^he fill the location information form$")
    public void heFillTheLocationInformationForm() {
    }

    @When("^he fill the device information form$")
    public void heFillTheDeviceInformationForm() {
    }

    @When("^he create a password and accept the terms and conditions$")
    public void heCreateAPasswordAndAcceptTheTermsAndConditions() {
    }

    @Then("^he see the welcome message$")
    public void heSeeTheWelcomeMessage() {
    }

}
