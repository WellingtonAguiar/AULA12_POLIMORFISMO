public class Flareon extends Eevee{

    public Flareon(String nome, String tipo, int altura, int hp, double peso) {
        super(nome,tipo, altura, hp, peso);

    }
    @Override
    public String ataque(){
        return "Giro de Fogo - Fire Spin";
    }
    @Override
    public String defesa(){
        return "Superaquecimento - Overheat";
    }
    @Override
    public String especial(){
        return "Explosão de fogo - Fire Blast";
    }
    @Override
    public void scanear(){
        System.out.println("Nome: "+getNome());        
        System.out.println("Tipo: "+getTipo());
        System.out.println("Altura: "+getAltura());
        System.out.println("Pontos de Vida: "+getHp());
        System.out.println("Peso: "+getPeso());
        System.out.println("Ataque basic: "+ataque());
        System.out.println("Movimento defensivo: "+defesa());
        System.out.println("Ataque especial: "+especial());
        System.out.println("\n");   
}
}