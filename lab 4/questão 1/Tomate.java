public class Tomate extends PizzaDecorator{

    public Tomate(Pizza pizza){
        super(pizza);
    }
    public String getDescricao(){
        return pizza.getDescricao()+"tomate\n";
    }
    public float getPreco(){
        return pizza.getPreco() + 10.0f;
    }
    
}
