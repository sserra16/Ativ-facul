public class Principal {
    public static void main(String[] args) {
        
        Sayajin goku = PersonagemFactory.criarGoku();
        Sayajin gohan = PersonagemFactory.criarGohan();
        Namekuseijin dende = PersonagemFactory.criarDende();

        // Evoluir Goku para Super Sayajin 5
        System.out.println(goku.transformar(5));

        // Evoluir Gohan para Super Sayajin 5, se não for possível, evolua para nível 3
        String transformacaoGohan = gohan.transformar(5);
        if (transformacaoGohan.contains("Não foi possível")) {
            transformacaoGohan = gohan.transformar(3);
        }
        System.out.println(transformacaoGohan);

        // Dendê fazer um pedido para as esferas do dragão
        String desejo = "Quero paz e força";
        String desejoTraduzido = dende.fazerDesejo(desejo);
        System.out.println("Desejo em Namekusei: " + desejoTraduzido);
    }
}
