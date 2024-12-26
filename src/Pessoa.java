import java.util.List;

public class Pessoa {

    private String nome;
    private String genero;

    public Pessoa() {

    }

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List listaPessoas() {
        Pessoa pessoa1 = new Pessoa("Filipe", "Masculino");
        Pessoa pessoa2 = new Pessoa("Beatriz", "Feminino");
        Pessoa pessoa3 = new Pessoa("Arthur", "Masculino");
        Pessoa pessoa4 = new Pessoa("Bruna", "Feminino");
        Pessoa pessoa5 = new Pessoa("Bartolomeu", "Masculino");
        Pessoa pessoa6 = new Pessoa("Julia", "Feminino");
        Pessoa pessoa7 = new Pessoa("Leon", "Masculino");
        Pessoa pessoa8 = new Pessoa("Melissa", "Feminino");
        Pessoa pessoa9 = new Pessoa("Raimundo", "Masculino");
        Pessoa pessoa10 = new Pessoa("Mariana", "Feminino");
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7, pessoa8, pessoa9, pessoa10);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Gênero: " + genero;
    }
}
