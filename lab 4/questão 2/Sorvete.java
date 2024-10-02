public class Sorvete extends CafeDecorator{
    public Sorvete(Cafe cafe){
        super(cafe);
    }
    public String getDescricao(){
       return cafe.getDescricao()+"sorvete\n";
    }
    public float calculaCusto(){
       return cafe.calculaCusto() + 5.0f;
    }
}
