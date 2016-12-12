package br.com.angeliski.servicos;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import br.com.angeliski.model.comEqualsAndHash.PessoaFisicaComEqualsAndHashCode;

import static org.junit.Assert.assertEquals;

public class BuscaPessoaTest {

    private List<PessoaFisicaComEqualsAndHashCode> pessoas;

    @Before
    public void setUp() throws Exception {
        pessoas = new ArrayList<PessoaFisicaComEqualsAndHashCode>();

        pessoas.add(gerarPessoa("Miguel", "561.215.672-36"));
        pessoas.add(gerarPessoa("Joao", "137.573.576-47"));
        pessoas.add(gerarPessoa("Ronaldo", "525.961.436-40"));
        pessoas.add(gerarPessoa("Marcelo", "613.687.440-79"));
        pessoas.add(gerarPessoa("Laura", "121.492.725-47"));
    }

    private PessoaFisicaComEqualsAndHashCode gerarPessoa(String nome, String cpf) {
        return new PessoaFisicaComEqualsAndHashCode(nome, cpf);
    }

    @Test
    public void buscaPessoaPorCpf() throws Exception {
        String cpf = "525.961.436-40";
        PessoaFisicaComEqualsAndHashCode joao = new PessoaFisicaComEqualsAndHashCode("Ronaldo", cpf);

        BuscaPessoa servicoDeLocalizacao = new BuscaPessoa();
        PessoaFisicaComEqualsAndHashCode pessoaFisica = servicoDeLocalizacao.buscaPessoaPorCpf(pessoas, cpf);

        //O Cpf e o nome são o mesmos, além do objeto ser considerado o mesmo
        assertEquals(cpf, pessoaFisica.getCpf());
        assertEquals(joao.getNome(), pessoaFisica.getNome());
        assertEquals(joao, pessoaFisica);
    }

}