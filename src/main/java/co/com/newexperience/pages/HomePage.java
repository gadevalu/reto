package co.com.newexperience.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://automationpractice.com")

public class HomePage extends PageObject {

    //logeo
    @FindBy(xpath = "//a[@class='login']")
    WebElement btnlogin;

    @FindBy(xpath ="//input[@id='email']")
    WebElement ingesarUserEmail;

    @FindBy(xpath ="//input[@id='passwd']")
    WebElement ingesarUserPass;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement btnLoginsubmit;

    //selelcionar un producto

    @FindBy(xpath = "//a[@class='sf-with-ul'and contains(text(),'Women')]")
    WebElement Linkproducto;

    @FindBy(xpath = "//a[@class='subcategory-name'and contains(text(),'Tops')]")
    WebElement selecproducto;

    @FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default']")
    WebElement agregarCar;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    WebElement btnChequeoProducto;

    //continuar con la compra

    @FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
    WebElement continiuProducto;




    //metodos de llamado de los locator

    public void logearse(){
        btnlogin.click();
    }

    //logeo de usuarios
    public void ingresaremail(){

        ingesarUserEmail.sendKeys("correofalso123@yopmail.com");
    }

    public void ingrsarpassword(){

        ingesarUserPass.sendKeys("pass123");
    }

    public void btningreso(){
        btnLoginsubmit.submit();
    }


    //seleccionar un producto

    public void seleccionalproducto(){

        Linkproducto.click();
    }

    public void unproducto(){

        selecproducto.click();
    }

    public void agregaralcarro(){

        agregarCar.click();
    }

    public void btnchequeodeproducto(){

        btnChequeoProducto.click();
    }

    //continuar  con la compra

    public void continuaproducto(){

        continiuProducto.click();

    }

}
