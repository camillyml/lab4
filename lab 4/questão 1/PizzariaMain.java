public class PizzariaMain {
    public static void main(String[] args){

        Pizza portuguesa = new Queijo(new Tomate(new MassaBordaRecheada()));
        System.out.println("Ingredientes da pizza portuguesa: \n" + portuguesa.getDescricao());
        System.out.println("Preço da pizza portuguesa: " + portuguesa.getPreco());

        Pizza quatroqueijos = new Queijo(new Queijo(new Queijo(new Queijo(new MassaFinaPizza()))));
        System.out.println("Ingredientes da pizza quatro queijos: \n" + quatroqueijos.getDescricao());
        System.out.println("Preço da pizza quatro queijos: " + quatroqueijos.getPreco()+"\n");

        Pizza pepperoni = new Pepperoni(new Queijo(new MassaBordaRecheada()));
        System.out.println("Ingredientes da pizza de pepperoni: \n" + pepperoni.getDescricao());
        System.out.println("Preço da pizza de pepperoni: " + pepperoni.getPreco()+"\n");

        Pizza moda = new Queijo(new Presunto(new Ovo(new Tomate(new Calabresa(new MassaBordaRecheada())))));
        System.out.println("Ingredientes da pizza à moda da casa: \n" + moda.getDescricao());
        System.out.println("Preço da pizza à moda da casa: " + moda.getPreco()+"\n");
    }
}
