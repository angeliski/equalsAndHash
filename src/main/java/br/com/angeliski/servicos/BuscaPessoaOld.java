package br.com.angeliski.servicos;

import java.util.List;

import br.com.angeliski.model.semEqualsAndHash.PessoaFisicaSemEqualsAndHashCode;

public class BuscaPessoaOld {

    public PessoaFisicaSemEqualsAndHashCode buscaPessoaPorCpf(List<PessoaFisicaSemEqualsAndHashCode> pessoas, String cpf) {

        for (PessoaFisicaSemEqualsAndHashCode pessoaFisica : pessoas) {
            if (pessoaFisica.getCpf().equals(cpf)) {
                return pessoaFisica;
            }
        }

        return null;
    }

}
