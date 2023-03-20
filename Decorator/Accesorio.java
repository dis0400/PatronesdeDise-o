package Decorator;

public class Accesorio implements Component {
        private Component component;
    
        public Accesorio(Component component) {
            this.component = component;
        }
    
        
    
        @Override
        public void show() {
            component.show();
        }
    
    
    
        public Component getComponent() {
            return component;
        }
    
    
    
        public void setComponent(Component component) {
            this.component = component;
        }
    
    
    
        @Override
        public void setVelocidad(double velocidad) {
            throw new UnsupportedOperationException("Unimplemented method 'setVelocidad'");
        }
    
    
    
        @Override
        public double getVelocidad() {
            throw new UnsupportedOperationException("Unimplemented method 'getVelocidad'");
        }
}
