package com.fidexio.pages;

import com.fidexio.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostPage {
    public VehicleCostPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement more_button;
    @FindBy(xpath = "//ul[@id='menu_more']")
    public WebElement menuMore;

    @FindBy(xpath = "//*[@id=\"menu_more\"]/li[9]/a/span")
    public WebElement fleetBtn;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[21]/ul[1]/li[3]/a")
    public WebElement vehicleCostBtn;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement vehicleDropDown;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement typeBtn;

    @FindBy(xpath = "//a[.='Calculation Benefit In Kind']")
    public WebElement readyType;

    @FindBy(xpath = "//li[.='Vehicle Costs']")
    public WebElement vehicleCostInfoPage;

    @FindBy(xpath = "//h4[.='Create a Vehicle']")
    public WebElement createVehiclePopup;

    @FindBy(xpath = "//a[.='Search More...']")
    public WebElement searchMoreBtn;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement searchCreateBtn;

   @FindBy(css = "button.btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement createNewBtn;

   @FindBy(xpath = "//button[normalize-space()='Create']")
   public WebElement createBtn;

    @FindBy (xpath = "//input[@id='o_field_input_51']")
    public WebElement vehicle_input_box;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public  WebElement vehicle_type;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement save_button;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/text()[2]")
    public WebElement invalidErrorMsg;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement edit_button;

    @FindBy(xpath = "//div[.='Cost Details']")
    public WebElement costDetailsEditPage;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discard_button;

    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input']")
    public WebElement total_price;

   @FindBy (id = "o_field_input_46")
    public WebElement cost_description_input;

    @FindBy(xpath = "//div[@class='modal-footer']/button[1]")
    public WebElement create_button2;

    @FindBy(xpath = "//div[@class='modal-footer']/button[2]")
    public WebElement create_and_edit_button;


}
