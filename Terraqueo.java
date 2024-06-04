public class Terraqueo extends Personagens {
    private String pais;
    private String cidade;

    public Terraqueo(String nome, int idade, String sexo, String temporada, double ki, String poderEspecial, String pais, String cidade) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.pais = pais;
        this.cidade = cidade;
    }

    
    public double calcularPoder() {
        return this.ki;
    }

    
    public String toString() {
        return "Terraqueo{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", temporada='" + temporada + '\'' +
                ", ki=" + ki +
                ", poderEspecial='" + poderEspecial + '\'' +
                ", pais='" + pais + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
