package br.com.angeliski.servicos;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import br.com.angeliski.model.semEqualsAndHash.PessoaFisicaSemEqualsAndHashCode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BuscaPessoaOldTest {

    private List<PessoaFisicaSemEqualsAndHashCode> pessoas;

    @Before
    public void setUp() throws Exception {
        pessoas = new ArrayList<PessoaFisicaSemEqualsAndHashCode>();

        pessoas.add(gerarPessoa("Joao", "137.573.576-47"));
        pessoas.add(gerarPessoa("Miguel", "561.215.672-36"));
        pessoas.add(gerarPessoa("Ronaldo", "525.961.436-40"));
        pessoas.add(gerarPessoa("Marcelo", "613.687.440-79"));
        pessoas.add(gerarPessoa("Laura", "121.492.725-47"));
    }

    private PessoaFisicaSemEqualsAndHashCode gerarPessoa(String nome, String cpf) {
        return new PessoaFisicaSemEqualsAndHashCode(nome, cpf);
    }

    @Test
    public void buscaPessoaPorCpf() throws Exception {
        String cpf = "137.573.576-47";
        PessoaFisicaSemEqualsAndHashCode joao = new PessoaFisicaSemEqualsAndHashCode("Joao", cpf);

        BuscaPessoaOld servicoDeLocalizacao = new BuscaPessoaOld();
        PessoaFisicaSemEqualsAndHashCode pessoaFisica = servicoDeLocalizacao.buscaPessoaPorCpf(pessoas, cpf);

        //O Cpf e o nome são o mesmos, mas o objeto não é considerado o mesmo
        assertEquals(cpf, pessoaFisica.getCpf());
        assertEquals(joao.getNome(), pessoaFisica.getNome());
        assertNotEquals(joao, pessoaFisica);
    }

}