public class Calabresa extends PizzaDecorator {
    public Calabresa(Pizza pizza){
        super(pizza);
    }
    public String getDescricao(){
       return pizza.getDescricao()+"caabresa\n";
    }
    public float getPreco(){
       return pizza.getPreco() + 10.0f;
    }
}
