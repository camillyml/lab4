public class Queijo extends PizzaDecorator{
    public Queijo(Pizza pizza){
        super(pizza);
    }
    public String getDescricao(){
       return pizza.getDescricao()+"queijo\n";
    }
    public float getPreco(){
       return pizza.getPreco() + 15.0f;
    }
}