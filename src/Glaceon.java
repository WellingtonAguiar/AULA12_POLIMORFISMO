public class Glaceon extends Eevee{

    public Glaceon(String nome, String tipo, int altura, int hp, double peso) {
        super(nome, tipo, altura, hp, peso);

    }
    @Override
    public String ataque(){
        return "Estilhaço de Gelo - Ice Shard";
    }
    @Override
    public String defesa(){
        return "Ultimo Recurso - Last Resort";
    }
    @Override
    public String especial(){
        return "Raio de Gelo - Ice Beam";
}
@Override
public void scanear(){
    System.out.println("Nome: "+getNome());    
    System.out.println("Tipo: "+getTipo());
    System.out.println("Altura: "+getAltura()+"Cm");
    System.out.println("Pontos de Vida: "+getHp()+"Hp");
    System.out.println("Peso: "+getPeso()+"Kg");
    System.out.println("Ataque basic: "+ataque());
    System.out.println("Movimento defensivo: "+defesa());
    System.out.println("Ataque especial: "+especial());
    System.out.println("\n");
}
}
