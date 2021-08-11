package co.com.choucair.challenge.utestautomation.stepdefinitions;

import co.com.choucair.challenge.utestautomation.model.AccountData;
import co.com.choucair.challenge.utestautomation.model.DevicesFormData;
import co.com.choucair.challenge.utestautomation.model.LocationFormData;
import co.com.choucair.challenge.utestautomation.model.UserFormData;
import co.com.choucair.challenge.utestautomation.questions.Answer;
import co.com.choucair.challenge.utestautomation.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestCreateUserStepDefinition {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Dario wants to register as a new user$")
    public void thatDarioWantsToRegisterAsANewUser() {
        OnStage.theActor("Dario").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fill the basic information form$")
    public void heFillThePersonalInformationForm(List<UserFormData> userFormData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillBasicInfo.form(userFormData.get(0).getName(), userFormData.get(0).getLastname(), userFormData.get(0).getEmail(),
                userFormData.get(0).getMonth(), userFormData.get(0).getDay(), userFormData.get(0).getYear(), userFormData.get(0).getLanguage()));
    }

    @When("^he fill the location information form$")
    public void heFillTheLocationInformationForm(List<LocationFormData> locationFormData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillLocationInfo.form(locationFormData.get(0).getCity(), locationFormData.get(0).getPostal(),
                locationFormData.get(0).getCountry()));
    }

    @When("^he fill the device information form$")
    public void heFillTheDeviceInformationForm(List<DevicesFormData> devicesFormData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillDevicesInfo.form(devicesFormData.get(0).getComputer(), devicesFormData.get(0).getVersion(),
                devicesFormData.get(0).getPcLanguage(), devicesFormData.get(0).getMobile(), devicesFormData.get(0).getModel(), devicesFormData.get(0).getOs()));
    }

    @When("^he create a password and accept the terms and conditions$")
    public void heCreateAPasswordAndAcceptTheTermsAndConditions(List<AccountData> accountFormData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillAccountInfo.form(accountFormData.get(0).getPassword()), Accept.termsAndConditions());
    }

    @Then("^he see the welcome message$")
    public void heSeeTheWelcomeMessage(List<AccountData> accountData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(accountData.get(0).getWelcomeMessage())));
    }

}
