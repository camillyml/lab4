public class Cafeteria {
    public static void main(String[] args) {
        
        Cafe macchiato = new EspumaDeLeite(new Espresso());
        System.out.println("Ingredientes do Macchiato: \n" + macchiato.getDescricao());
        System.out.println("Preço do Macchiato: " + macchiato.calculaCusto());

        Cafe latte = new EspumaDeLeite(new LeiteVaporizado(new Espresso()));
        System.out.println("\nIngredientes do Latte: \n" + latte.getDescricao());
        System.out.println("Preço do Latte: " + latte.calculaCusto());

        Cafe mocha = new Chocolate(new EspumaDeLeite(new LeiteVaporizado(new Espresso())));
        System.out.println("\nIngredientes do Mocha: \n" + mocha.getDescricao());
        System.out.println("Preço do Mocha: " + mocha.calculaCusto());

        Cafe affogato = new Sorvete(new Espresso());
        System.out.println("\nIngredientes do Affogato: \n" + affogato.getDescricao());
        System.out.println("Preço do Affogato: " + affogato.calculaCusto());

        Cafe cappuccino = new Canela(new EspumaDeLeite(new LeiteVaporizado(new Espresso())));
        System.out.println("\nIngredientes do Cappuccino: \n" + cappuccino.getDescricao());
        System.out.println("Preço do Cappuccino: " + cappuccino.calculaCusto());

        Cafe latteDescaf = new EspumaDeLeite(new LeiteVaporizado(new Descafeinado()));
        System.out.println("\nIngredientes do Latte Descafeinado: \n" + latteDescaf.getDescricao());
        System.out.println("Preço do Latte Descafeinado: " + latteDescaf.calculaCusto());

        Cafe cappuccinoDescaf = new Canela(new EspumaDeLeite(new LeiteVaporizado(new Descafeinado())));
        System.out.println("\nIngredientes do Cappuccino Descafeinado: \n" + cappuccinoDescaf.getDescricao());
        System.out.println("Preço do Cappuccino Descafeinado: " + cappuccinoDescaf.calculaCusto());
    }
}
