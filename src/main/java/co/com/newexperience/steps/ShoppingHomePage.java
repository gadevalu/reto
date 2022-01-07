package co.com.newexperience.steps;


import co.com.newexperience.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ShoppingHomePage {

    HomePage homepage;

    @Step
    public void opensShoppingCartPage(){
        homepage.open();
    }

    //logeo
    @Step
    public void logerarPage(){
        homepage.logearse();
    }

    //logeo de usuarios

    @Step
    public void autenticarseemail(){

        homepage.ingresaremail();
    }

    @Step
    public void autenticarsepass(){

        homepage.ingrsarpassword();
    }

    @Step
    public void btnautenticacion(){

        homepage.btningreso();
    }

    //selelcionar un producto

    @Step
    public void seleccionarproduc(){
        homepage.seleccionalproducto();
    }
    @Step
    public void unproduc(){
        homepage.unproducto();
    }

    @Step
    public void agregarproducto(){
        homepage.agregaralcarro();
    }

    @Step
    public void btnproducto(){
        homepage.btnchequeodeproducto();
    }

    //continuar  con la compra
    @Step
    public void continuarproductos(){
        homepage.continuaproducto();
    }


}
