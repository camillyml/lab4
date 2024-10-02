public class Presunto extends PizzaDecorator{
    public Presunto(Pizza pizza){
        super(pizza);
    }
    public String getDescricao(){
       return pizza.getDescricao()+"presunto\n";
    }
    public float getPreco(){
       return pizza.getPreco() + 5.0f;
    }
}
