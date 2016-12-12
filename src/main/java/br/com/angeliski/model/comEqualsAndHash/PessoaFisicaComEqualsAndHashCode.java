package br.com.angeliski.model.comEqualsAndHash;

public class PessoaFisicaComEqualsAndHashCode extends PessoaComEqualsAndHashCode {

    String cpf;

    public PessoaFisicaComEqualsAndHashCode(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PessoaFisicaComEqualsAndHashCode that = (PessoaFisicaComEqualsAndHashCode) o;

        return getCpf() != null ? getCpf().equals(that.getCpf()) : that.getCpf() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getCpf() != null ? getCpf().hashCode() : 0);
        return result;
    }
}
