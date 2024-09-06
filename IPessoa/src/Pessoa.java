/**
 * Classe que representa uma Pessoa e seus comportamentos.
 */
public class Pessoa implements IPessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void acordar() {
        System.out.println(nome + " acordou.");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }
    public void dormir() {
        System.out.println(nome + " foi dormir.");
    }
}
