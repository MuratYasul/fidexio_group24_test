package com.fidexio.pages;

import com.fidexio.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Contract_Page {
    public New_Contract_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement more_button;

    @FindBy(xpath = "//ul[@id='menu_more']//li[12]/a")
    public WebElement fleet;

    @FindBy(linkText = "Vehicles Contracts")
    public WebElement vehicle_contracts;

    @FindBy(linkText = "Create")
    public WebElement create_button;

    @FindBy (xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement vehicle_input_box;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public  WebElement vehicle_type;

    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input']")
    public WebElement activation_cost;


    @FindBy (id = "o_field_input_18")
    public WebElement recurring_cost_amount;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement save_button;

@FindBy(xpath = "//div[@class='modal-footer']/button[1]")
    public WebElement create_button2;
@FindBy(xpath = "//div[@class='modal-footer']/button[2]")
    public WebElement create_and_edit_button;








}
