public class Espeon extends Eevee {

    public Espeon(String nome,String tipo, int altura, int hp, double peso) {
        super(nome,tipo, altura, hp, peso);

    }    
    @Override
    public String ataque(){
        return "Confundir - Psybeam";
    }
    @Override
    public String defesa(){
        return "Visão futura- Future Sight";
    }
    @Override
    public String especial(){
        return "Sincronizar - Synchronize";
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
