public class Pepperoni extends PizzaDecorator {
    
    public Pepperoni(Pizza pizza){
        super(pizza);
    }
    public String getDescricao(){
       return pizza.getDescricao()+"pepperoni\n";
    }
    public float getPreco(){
       return pizza.getPreco() + 18.0f;
    }
}
