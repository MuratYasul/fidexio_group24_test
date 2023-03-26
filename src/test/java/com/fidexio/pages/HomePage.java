package com.fidexio.pages;

import com.fidexio.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='115']")
    public WebElement discussBtn;

    @FindBy(xpath = "//a[@data-menu='120']")
    public WebElement calendarBtn;

    @FindBy(xpath = "//a[@data-menu='194']")
    public WebElement notesBtn;

    @FindBy(xpath = "//a[@data-menu='68']")
    public WebElement contactsBtn;

    @FindBy(xpath = "//a[@data-menu='261']")
    public WebElement crmBtn;

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesBtn;

    @FindBy(xpath = "//a[@data-menu='382']")
    public WebElement websiteBtn;

    @FindBy(xpath = "//a[@data-menu='484']")
    public WebElement pointOfSaleBtn;

    @FindBy(xpath = "//a[@data-menu='504']")
    public WebElement purchasesBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Inventory']")
    public WebElement inventoryBtn;

    @FindBy(xpath = "//a[@class='dropdown-toggle']/b/..")
    public WebElement moreBtn;

    @FindBy(xpath = "//a[@data-menu='415']")
    public WebElement manufacturingBtn;

    @FindBy(xpath = "//a[@data-menu='535']")
    public WebElement repairsBtn;

    @FindBy(xpath = "//a[@data-menu='333']")
    public WebElement projectBtn;

    @FindBy(xpath = "//a[@data-menu='124']")
    public WebElement eventsBtn;

    @FindBy(xpath = "//a[@data-menu='475']")
    public WebElement surveysBtn;

    @FindBy(xpath = "//a[@data-menu='157']")
    public WebElement employeesBtn;

    @FindBy(xpath = "//a[@data-menu='281']")
    public WebElement attendancesBtn;

    @FindBy(xpath = "//a[@data-menu='295']")
    public WebElement leavesBtn;

    @FindBy(xpath = "//a[@data-menu='388']")
    public WebElement expensesBtn;

    @FindBy(xpath = "//a[@data-menu='165']")
    public WebElement maintenanceBtn;

    @FindBy(xpath = "//a[@data-menu='134']")
    public WebElement fleetBtn;

    @FindBy(xpath = "//a[@data-menu='1']")
    public WebElement dashboardBtn;

    @FindBy(xpath = "//a[@data-menu='199']")
    public WebElement invoicingBtn;

    @FindBy(xpath = "//a[@data-menu='180']")
    public WebElement emailMarketingBtn;

    @FindBy(className = "oe_topbar_name")
    public WebElement usernameBtn;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutBtn;

}
