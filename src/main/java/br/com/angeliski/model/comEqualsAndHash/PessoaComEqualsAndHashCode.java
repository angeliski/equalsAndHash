package br.com.angeliski.model.comEqualsAndHash;

public class PessoaComEqualsAndHashCode {

    String nome;
    String sobrenome;
    String idade;

    public PessoaComEqualsAndHashCode(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idade == null) ? 0 : idade.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result
                 + ((sobrenome == null) ? 0 : sobrenome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PessoaComEqualsAndHashCode other = (PessoaComEqualsAndHashCode) obj;
        if (idade == null) {
            if (other.idade != null) {
                return false;
            }
        } else if (!idade.equals(other.idade)) {
            return false;
        }
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        if (sobrenome == null) {
            if (other.sobrenome != null) {
                return false;
            }
        } else if (!sobrenome.equals(other.sobrenome)) {
            return false;
        }
        return true;

    }

}
