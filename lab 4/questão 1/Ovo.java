public class Ovo extends PizzaDecorator{
    public Ovo(Pizza pizza){
        super(pizza);
    }
    public String getDescricao(){
        return pizza.getDescricao() +"ovo\n";
    }
    public float getPreco(){
        return pizza.getPreco() + 5.0f;
    }
}
