package Adapter;

public class AppEscritorioAdapter implements IAppEmpresa1{
    private AppEscritorio appEscritorio;

    public AppEscritorioAdapter(AppEscritorio appEscritorio) {
        this.appEscritorio = appEscritorio;
    }

    @Override
    public void login() {
        appEscritorio.iniciarSesion();
    }

    @Override
    public void logout() {
        appEscritorio.cerrarSesion();
    }

    @Override
    public void reportes() {
        System.out.println("App Escritorio: Generando reporte... "+appEscritorio.generacionDeDatos());
    }
    
}
