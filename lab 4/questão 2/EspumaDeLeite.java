public class EspumaDeLeite extends CafeDecorator {
    public EspumaDeLeite(Cafe cafe){
        super(cafe);
    }
    public String getDescricao(){
       return cafe.getDescricao()+"espuma de leite\n";
    }
    public float calculaCusto(){
       return cafe.calculaCusto() + 3.5f;
    }
}
