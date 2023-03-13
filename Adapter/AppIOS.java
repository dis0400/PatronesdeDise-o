package Adapter;

public class AppIOS  implements IAppEmpresa1{
    @Override
    public void login() {
        System.out.println("IOS: Login...");
    }

    @Override
    public void logout() {
        System.out.println("IOS: Logout...");
    }

    @Override
    public void reportes() {
        System.out.println("IOS: Generando Reporte...");
    }

}
