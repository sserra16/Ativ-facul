import java.util.HashMap;
import java.util.Map;

public class Namekuseijin extends Personagens {
    private int quantidadeEsferas;
    private boolean podeCurar;

    public Namekuseijin(String nome, int idade, String sexo, String temporada, double ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    @Override
    public double calcularPoder() {
        return this.ki * (1 + (this.podeCurar ? 0.2 : 0));
    }

    public String fazerDesejo(String desejo) {
        Map<String, String> traducao = new HashMap<>();
        traducao.put("paz", "nama");
        traducao.put("amor", "dori");
        traducao.put("vida", "kima");
        traducao.put("força", "raka");
        
        String[] palavras = desejo.split(" ");
        StringBuilder desejoTraduzido = new StringBuilder();
        
        for (String palavra : palavras) {
            desejoTraduzido.append(traducao.getOrDefault(palavra, palavra)).append(" ");
        }
        
        return desejoTraduzido.toString().trim();
    }

    @Override
    public String toString() {
        return "Namekuseijin{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", temporada='" + temporada + '\'' +
                ", ki=" + ki +
                ", poderEspecial='" + poderEspecial + '\'' +
                ", quantidadeEsferas=" + quantidadeEsferas +
                ", podeCurar=" + podeCurar +
                '}';
    }
}
