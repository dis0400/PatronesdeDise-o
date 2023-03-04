package Observer;
import java.util.List;

public interface IUsuario {
    void update(String propaganda, String categoria);
    void addCategoria(String categoria);
    List<String> getCategorias();
    void quitarCategoria(String categoria);
}
