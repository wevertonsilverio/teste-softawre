package util;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Componentes {

    private WebDriver driver;
    private Select combo;
    private WebElement botao;


    public void inicializar(){
        String chromeDriver = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/resource/componentes.html");
    }

    public void fecharNavegador(){
        driver.quit();
    }


    //Questao 1
    public void cadastrarInformacoes(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("nome");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("sobrenome");
        driver.findElement(By.id("elementosForm:sexo:1")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();

        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
        combo.selectByIndex(5);

        WebElement elemento2 = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(elemento2);
        combo.selectByVisibleText("O que eh esporte?");

        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("sugestoes");

        botao = driver.findElement(By.id("elementosForm:cadastrar"));
        botao.click();
    }
    public void validarCadastro(){
        WebElement mensagemConfirmacao = driver.findElement(By.id("resultado"));
        Assert.assertTrue(mensagemConfirmacao.isDisplayed());

        Assert.assertEquals("Cadastrado!", mensagemConfirmacao.findElement(By.tagName("span")).getText());

        Assert.assertEquals("Nome: nome", mensagemConfirmacao.findElement(By.id("descNome")).getText());
        Assert.assertEquals("Sobrenome: sobrenome", mensagemConfirmacao.findElement(By.id("descSobrenome")).getText());
        Assert.assertEquals("Sexo: Feminino", mensagemConfirmacao.findElement(By.id("descSexo")).getText());
        Assert.assertEquals("Comida: Carne", mensagemConfirmacao.findElement(By.id("descComida")).getText());
        Assert.assertEquals("Escolaridade: especializacao", mensagemConfirmacao.findElement(By.id("descEscolaridade")).getText());
        Assert.assertEquals("Esportes: O que eh esporte?", mensagemConfirmacao.findElement(By.id("descEsportes")).getText());
        Assert.assertEquals("Sugestoes: sugestoes", mensagemConfirmacao.findElement(By.id("descSugestoes")).getText());
    }

    //Questao 2
    public void cadastrarNome(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("");
        botao = driver.findElement(By.id("elementosForm:cadastrar"));
        botao.click();
    }
    public void validarNome(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Nome eh obrigatorio", alertMensagem);
        alert.accept();
    }

    public void cadastrarSobrenome(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("teste");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("");
        botao = driver.findElement(By.id("elementosForm:cadastrar"));
        botao.click();
    }
    public void validarSobrenome(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Sobrenome eh obrigatorio", alertMensagem);
        alert.accept();
    }

    public void cadastrarSexo(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("teste");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("teste");
        botao = driver.findElement(By.id("elementosForm:cadastrar"));
        botao.click();
    }
    public void validarSexo(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Sexo eh obrigatorio", alertMensagem);
        alert.accept();
    }

    //Questao 3a
    public void clicarAlert(){
        botao = driver.findElement(By.id("alert"));
        botao.click();
    }
    public void validarAlert(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Alert Simples", alertMensagem);
        alert.accept();
    }

    //Questao 3b
    public void clicarConfirm(){
        botao = driver.findElement(By.id("confirm"));
        botao.click();
    }
    public void validarConfirm(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Confirm Simples", alertMensagem);
        alert.accept();
        alertMensagem = alert.getText();
        Assert.assertEquals("Confirmado", alertMensagem);
        alert.accept();
    }


    //Questao 3c
    public void clicarCancelar(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public void validarCancelar(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Negado", alertMensagem);
        alert.accept();
    }

    //Questao 3d
    public void clicarPrompt(){
        botao = driver.findElement(By.id("prompt"));
        botao.click();
    }
    public void validarPrompt(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Digite um numero", alertMensagem);
        alert.sendKeys("12");
        alert.accept();
        alertMensagem = alert.getText();
        Assert.assertEquals("Era 12?", alertMensagem);
        alert.accept();
        alertMensagem = alert.getText();
        Assert.assertEquals(":D", alertMensagem);
        alert.accept();
    }


}
