package Composite;

public class Computadora extends Component {

    public Computadora(){
        setTipo("computadora");
        setPrecioTotal(100);
    }

    @Override
    public void add(Component composite) {
        
        
    }

    @Override
    public Component getElement(int posicion) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println(getTipo()+"--------------------------------");
        System.out.println("PRECIO: "+this.getPrecioTotal()+"$");
    }

    @Override
    public void remove(Component composite) {
    
    }
    
}
