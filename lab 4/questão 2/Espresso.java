public class Espresso implements Cafe {
    @Override
    public String getDescricao() {
        return "café espresso\n";
    }

    @Override
    public float calculaCusto() {
        return 5.0f;
    }

}
