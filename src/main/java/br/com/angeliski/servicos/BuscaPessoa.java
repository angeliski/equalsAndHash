package br.com.angeliski.servicos;

import java.util.List;

import br.com.angeliski.model.comEqualsAndHash.PessoaFisicaComEqualsAndHashCode;

public class BuscaPessoa {

    public PessoaFisicaComEqualsAndHashCode buscaPessoaPorCpf(List<PessoaFisicaComEqualsAndHashCode> pessoas, String cpf) {
        PessoaFisicaComEqualsAndHashCode pessoaFisica = new PessoaFisicaComEqualsAndHashCode("", cpf);
        int indexOfPessoa = pessoas.indexOf(pessoaFisica);
        if (indexOfPessoa > 0) {
            return pessoas.get(indexOfPessoa);
        }

        return null;
    }

}
