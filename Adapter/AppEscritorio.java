package Adapter;

public class AppEscritorio implements IAppEmpresa2{
    private String datos = "datos App Escritorio";
    @Override
    public void iniciarSesion() {
        System.out.println("App Escritorio: Iniciar Sesion...");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("App Escritorio: Cerrar Sesion...");
    }

    @Override
    public String generacionDeDatos() {
        return datos;
    }
    
}
