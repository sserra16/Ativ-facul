public abstract class Personagens {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected String temporada;
    protected double ki;
    protected String poderEspecial;

    public Personagens(String nome, int idade, String sexo, String temporada, double ki, String poderEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.temporada = temporada;
        this.ki = ki;
        this.poderEspecial = poderEspecial;
    }

    public abstract double calcularPoder();
}
