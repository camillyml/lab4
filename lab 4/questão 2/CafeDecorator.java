public class CafeDecorator implements Cafe {
    
        protected Cafe cafe;
        
        public CafeDecorator(Cafe c){
            this.cafe = c;
        }
        
        @Override
        public String getDescricao() {
            return cafe.getDescricao();
        }
    
        @Override
        public float calculaCusto() {
            return cafe.calculaCusto();
        }
}
    
