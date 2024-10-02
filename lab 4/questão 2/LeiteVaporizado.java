public class LeiteVaporizado extends CafeDecorator{
    public LeiteVaporizado(Cafe cafe){
        super(cafe);
    }
    public String getDescricao(){
       return cafe.getDescricao()+"leite vaporizado\n";
    }
    public float calculaCusto(){
       return cafe.calculaCusto() + 4.0f;
    }
}
