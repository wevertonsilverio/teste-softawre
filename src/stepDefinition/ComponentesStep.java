package stepDefinition;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuario acessou o arquivo Campo de treinamento")
    public void que_o_usuario_acessou_o_a_arquivo_Campo_de_treinamento(){
        componentes.inicializar();
    }


    //Questao 1
    @Quando("o usuario clicar em cadastrar")
    public void o_usuario_clicar_em_cadastrar(){
        componentes.cadastrarInformacoes();
    }
    @Entao("as informacoes serao apresentadas")
    public void as_informacoes_serao_apresentadas(){
        componentes.validarCadastro();
        componentes.fecharNavegador();
    }

    //Questao 2
    @Quando("o usuario cadastrar seu nome")
    public void o_usuario_cadastrar_seu_nome(){
        componentes.cadastrarNome();
    }
    @Entao("se o nome estiver em branco ocorrera um erro")
    public void se_o_nome_estiver_em_branco_ocorrera_um_erro(){
        componentes.validarNome();
        componentes.fecharNavegador();
    }

    @Quando("o usuario cadastrar seu sobrenome")
    public void o_usuario_cadastrar_seu_sobrenome(){
        componentes.cadastrarSobrenome();
    }
    @Entao("se o sobrenome estiver em branco ocorrera um erro")
    public void se_o_sobrenome_estiver_em_branco_ocorrera_um_erro(){
        componentes.validarSobrenome();
        componentes.fecharNavegador();
    }

    @Quando("o usuario cadastrar seu sexo")
    public void o_usuario_cadastrar_seu_sexo(){
        componentes.cadastrarSexo();
    }
    @Entao("se o sexo estiver em branco ocorrera um erro")
    public void se_o_sexo_estiver_em_branco_ocorrera_um_erro(){
        componentes.validarSexo();
        componentes.fecharNavegador();
    }

    //Questao 3a
    @Quando("o usuario clicar em alert")
    public void o_usuario_clicar_em_alert(){
        componentes.clicarAlert();
    }
    @Entao("o alert deve ser mostrado")
    public void o_alert_deve_ser_mostrado(){
        componentes.validarAlert();
        componentes.fecharNavegador();
    }

    //Questao 3b
    @Quando("o usuario clicar em confirmar")
    public void o_usuario_clicar_em_confirmar(){
        componentes.clicarConfirm();
    }
    @Entao("a mensagem de confirmacao sera mostrada")
    public void a_mensagem_de_confirmacao_sera_mostrada(){
        componentes.validarConfirm();
        componentes.fecharNavegador();
    }

    //Questao 3c
    @Quando("o usuario clicar em cancelar")
    public void o_usuario_clicar_em_cancelar(){
        componentes.clicarConfirm();
        componentes.clicarCancelar();
    }
    @Entao("a mensagem negado devera ser mostrada")
    public void a_mensagem_negado_devera_ser_mostrada(){
        componentes.validarCancelar();
        componentes.fecharNavegador();
    }

    //Questao 3d
    @Quando("o usuario clicar em prompt")
    public void o_usuario_clicar_em_prompt(){
        componentes.clicarPrompt();
    }
    @Entao("ele confirmara seu numero")
    public void ele_confirmara_seu_numero(){
        componentes.validarPrompt();
        componentes.fecharNavegador();
    }


}
