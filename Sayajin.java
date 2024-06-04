public class Sayajin extends Personagens implements Interface {
    private int nivelMaximoSSJ;
    private boolean temRabo;

    public Sayajin(String nome, int idade, String sexo, String temporada, double ki, String poderEspecial, int nivelMaximoSSJ, boolean temRabo) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;
    }

    
    public double calcularPoder() {
        return this.ki * (1 + this.nivelMaximoSSJ * 0.1);
    }

    
    public String transformar(int nivel) {
        if (nivel < 1 || nivel > 5) {
            return "Não foi possível transformar esse sayajin";
        }
        if ((this.nome.equals("Goku") || this.nome.equals("Vegeta")) && nivel <= 5) {
            return this.nome + " transformou para super sayajin nível " + nivel;
        } else if (nivel <= 3) {
            return this.nome + " transformou para super sayajin nível " + nivel;
        } else {
            return "Não foi possível transformar esse sayajin";
        }
    }

    
    public String toString() {
        return "Sayajin{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", temporada='" + temporada + '\'' +
                ", ki=" + ki +
                ", poderEspecial='" + poderEspecial + '\'' +
                ", nivelMaximoSSJ=" + nivelMaximoSSJ +
                ", temRabo=" + temRabo +
                '}';
    }
}
