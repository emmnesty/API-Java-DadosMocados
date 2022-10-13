package br.com.magna.agendador.config.validacao;

public class ErroDeFormularioVO {

    private String campo;
    private String erro;

    public ErroDeFormularioVO(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }


}
