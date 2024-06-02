public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee("Eevee","Normal",30,55,6.5f);
        Espeon es = new Espeon("Espeon","Psychic",90,65,26.5f);
        Flareon f = new Flareon("Flareon","Fire",90,65,25.0f);
        Glaceon g = new Glaceon("Flareon","Gelo", 80, 65, 25.9f);
        Jolteon j = new Jolteon("Jolteon","Eletrico",80,65,24.5f);
        Sylveon s = new Sylveon("Sylveon","Fairy", 100, 65, 23.5f);
        Umbreon u = new Umbreon("Umbreon","Dark", 100, 95, 27f);
        Vaporeon v = new Vaporeon("Vaporeon","Water", 100, 130, 29f);


        e.scanear();
        es.scanear();
        f.scanear();
        g.scanear();
        j.scanear();
        s.scanear();
        u.scanear();
        v.scanear();


}
}
