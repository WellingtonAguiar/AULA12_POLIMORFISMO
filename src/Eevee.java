public class Eevee {
    private String tipo,nome;
    private int altura,hp;
    private double peso;

    // funções
    public String ataque(){
        return "Ataque rapido";
    }
    public String defesa(){
        return "desvio";
    }
    public String especial(){
        return "Tri-ataque";
    }
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
    
    public Eevee(String nome,String tipo, int altura, int hp, double peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.altura = altura;
        this.hp = hp;
        this.peso = peso;
    }
    public Eevee(){

    }
    //métodos acessores  
    public String getNome(){
        return nome;
    }   
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    


    
}
