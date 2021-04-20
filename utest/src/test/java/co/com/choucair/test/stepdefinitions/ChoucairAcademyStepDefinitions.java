package co.com.choucair.test.stepdefinitions;

import co.com.choucair.test.model.AcademyChoucairData;
import co.com.choucair.test.questions.Answer;
import co.com.choucair.test.tasks.JoinToday;
import co.com.choucair.test.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Luisa wants to register in a new platform$")
    public void thanLuisaWantsToRegisterInANewPlatform() throws Exception {
        OnStage.theActorCalled("Luisa").wasAbleTo(OpenUp.thePage());
                        //(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    @When("^she fills the fields that contains hers personal information$")
    public void sheFillsTheFieldsThatContainsHersPersonalInformation(List<AcademyChoucairData> academyChoucairData) throws Exception  {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.onThePage(academyChoucairData.get(0).getStrName(),academyChoucairData.get(0).getStrLast(),
                academyChoucairData.get(0).getStrEmail(),academyChoucairData.get(0).getStrMonth(),academyChoucairData.get(0).getStrDay(),academyChoucairData.get(0).getStrYear()));
    }

    @Then("^she can create her user in the page utest$")
    public void sheCanCreateHerUserInThePageUtest() throws Exception  {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Finish")));
              //academyChoucairData.get(0).getStrCourse())));


    }
}
