package br.com.angeliski.model.semEqualsAndHash;

public class PessoaFisicaSemEqualsAndHashCode extends PessoaSemEqualsAndHashCode {

    String cpf;

    public PessoaFisicaSemEqualsAndHashCode(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
