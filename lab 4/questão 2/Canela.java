public class Canela extends CafeDecorator{
    public Canela(Cafe cafe){
        super(cafe);
    }
    public String getDescricao(){
       return cafe.getDescricao()+"canela\n";
    }
    public float calculaCusto(){
       return cafe.calculaCusto() + 2.5f;
    }
}
