package com.fidexio.pages;

import com.fidexio.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SurveysPages extends HomePage{

    public SurveysPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void clickSurveysModule(){
        if (moreBtn.isDisplayed()){
            moreBtn.click();
            surveysBtn.click();
        }else {
            surveysBtn.click();
        }
    }

    @FindBy(xpath = "//a[@data-menu='477']")
    public WebElement answerBtn;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_grouped']")
    public WebElement answersTable;

    @FindBy(xpath = "//a[@data-menu='476']")
    public WebElement surveysBtnInModule;

    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_grouped ui-sortable']")
    public WebElement surveysColumn;

    @FindBy(xpath = "//div[@class='o_cp_buttons']//button")
    public List<WebElement> buttons;

    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement formSheet;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement surveysCreatBtn;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement surveysImportBtn;

    @FindBy(xpath = "//div[@class='oe_import_box col-sm-9']")
    public WebElement surveysFileImportBox;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listViewBtn;

    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanViewBtn;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement titleNameInput;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement surveySaveBtn;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement surveyEditBtn;

    @FindBy(xpath = "//div[@class='o_notification undefined o_error']")
    public WebElement createSurveysErrMsg;

    @FindBy(xpath = "//a[normalize-space(.)='Delete']/../../..")
    public WebElement surveyActionsBtn;

    @FindBy(xpath = "//a[normalize-space(.)='Delete']")
    public WebElement surveyDeleteBtn;

    @FindBy(xpath = "//button/span[.='Ok']")
    public WebElement deleteConfirmBtn;

    public void deleteSurvey(){
        surveyActionsBtn.click();
        surveyDeleteBtn.click();
        deleteConfirmBtn.click();
    }

}
