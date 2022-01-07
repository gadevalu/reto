package co.com.newexperience.stepdefinitions;

import co.com.newexperience.steps.ShoppingHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ShoppingCartStepDefinitions {

    @Steps
    ShoppingHomePage shoppinghomepage;

    @Given("^Que el usuario esta en la pagina de inicio$")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {

        shoppinghomepage.opensShoppingCartPage();
    }

    @Given("^Que el usuario hace clic en el boton de singin$")
    public void queElUsuarioHaceClicEnElBotonDeSingin() {

        shoppinghomepage.logerarPage();
    }

    @When("^El usuario ingrese su email$")
    public void elUsuarioIngreseSuEmail() {

        shoppinghomepage.autenticarseemail();
    }

    @When("^El usuario ingrese su contrasena$")
    public void elUsuarioIngreseSuContrasena() {

        shoppinghomepage.autenticarsepass();
    }

    @Then("^El usuario hace clic en el boton singin$")
    public void elUsuarioHaceClicEnElBotonSingin() {

       shoppinghomepage.btnautenticacion();
    }


    //escenario 2

    @Given("^El usuario hace clic en Mujeres$")
    public void elUsuarioHaceClicEnMujeres() {

        shoppinghomepage.seleccionarproduc();
    }

    @When("^El usuario hace clic en Tops$")
    public void elUsuarioHaceClicEnTops() {

        shoppinghomepage.unproduc();
    }

    @Given("^Las blusas de User Clicks$")
    public void lasBlusasDeUserClicks() {

        shoppinghomepage.agregarproducto();
    }

    @Given("^El usuario hace clic en adicionar al carrito$")
    public void elUsuarioHaceClicEnAdicionarAlCarrito() {

        shoppinghomepage.btnproducto();

    }

    @Then("^Que el usuario hace clic en continuar comprando$")
    public void queElUsuarioHaceClicEnContinuarComprando() {

        shoppinghomepage.continuarproductos();
    }
}
