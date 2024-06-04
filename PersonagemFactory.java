public class PersonagemFactory {
    public static Terraqueo criarKuririn() {
        return new Terraqueo("Kuririn", 35, "Masculino", "Z", 1500, "Kamehameha", "Terra", "Cidade do Oeste");
    }

    public static Sayajin criarGoku() {
        return new Sayajin("Goku", 42, "Masculino", "Z", 5000, "Kamehameha", 5, true);
    }

    public static Sayajin criarGohan() {
        return new Sayajin("Gohan", 23, "Masculino", "Z", 3000, "Masenko", 3, true);
    }

    public static Namekuseijin criarDende() {
        return new Namekuseijin("Dendê", 20, "Masculino", "Z", 2000, "Curar", 7, true);
    }
}
