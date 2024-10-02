public class PizzaDecorator implements Pizza {
//implementa uma pizza e possui um atributo pizza
    protected Pizza pizza;
    
    public PizzaDecorator(Pizza p){
        this.pizza = p;
    }
    
    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public float getPreco() {
        return pizza.getPreco();
    }
    
    
}
