package com.fidexio.step_definitions;

import com.fidexio.pages.SurveysPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SurveysFunctionality_StepDefs {

    SurveysPages surveysPages = new SurveysPages();

    @And("user click surveys module button")
    public void userClickSurveysModuleButton() {

        surveysPages.clickSurveysModule();

    }

    @Then("verify all button is enable to click")
    public void verifyAllButtonIsEnableToClick() {
        surveysPages.answerBtn.click();
        Assert.assertTrue(surveysPages.answersTable.isDisplayed());

        surveysPages.surveysBtnInModule.click();
        Assert.assertTrue(surveysPages.surveysColumn.isDisplayed());

        surveysPages.surveysCreatBtn.click();
        Assert.assertTrue(surveysPages.formSheet.isDisplayed());
        surveysPages.surveysBtnInModule.click();

        surveysPages.surveysImportBtn.click();
        Assert.assertTrue(surveysPages.surveysFileImportBox.isDisplayed());
        surveysPages.surveysBtnInModule.click();

        surveysPages.listViewBtn.click();
        Assert.assertTrue(surveysPages.surveysColumn.isEnabled());

        surveysPages.kanbanViewBtn.click();
        Assert.assertTrue(surveysPages.surveysColumn.isDisplayed());
    }

    @When("user click create btn in surveys module")
    public void userClickCreateBtnInSurveysModule() {
        surveysPages.surveysCreatBtn.click();
    }

    @And("user enters empty title and save survey")
    public void userEntersEmptyTitleAndSaveSurvey() {
        surveysPages.titleNameInput.sendKeys("");
        surveysPages.surveySaveBtn.click();
    }

    @And("user can not create new survey")
    public void userCanNotCreateNewSurvey() {
        Assert.assertTrue(surveysPages.createSurveysErrMsg.isDisplayed());
    }

    @And("user type title in the form")
    public void userTypeTitleInTheForm() {
        surveysPages.titleNameInput.sendKeys("Test");
        surveysPages.surveySaveBtn.click();
    }

    @Then("user created survey successfully")
    public void userCreatedSurveySuccessfully() {
        Assert.assertTrue(surveysPages.surveyEditBtn.isDisplayed());
        surveysPages.deleteSurvey();
    }
}
