public class Chocolate extends CafeDecorator {
    public Chocolate(Cafe cafe){
        super(cafe);
    }
    public String getDescricao(){
       return cafe.getDescricao()+"chocolate\n";
    }
    public float calculaCusto(){
       return cafe.calculaCusto() + 4.0f;
    }
}
