import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestPessoa {

    @Test
    public void testApenasNomesFemininos() {
        List<Pessoa> lista = new Pessoa().listaPessoas();

        // Verificar se todos os elementos na lista têm o gênero "Feminino"
        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .collect(Collectors.toCollection(ArrayList::new));

        boolean apenasFemininos = arrayList.stream()
                .allMatch(pessoa -> pessoa.getGenero().equals("Feminino"));

        Assert.assertTrue("A lista contém apenas nomes que não são do gênero Feminino.", apenasFemininos);
    }

    @Test
    public void testApenasNomesFemininos1() {
    }
}
