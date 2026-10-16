import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {

        Pedido pedido = new Pedido("Fabricio Topon", "Laptop", 1500.00, "ftmarce@gmail.com"); // creamos manualmente el objeto de la clase Pedido
        PedidoService pedidoService = new PedidoService(); // creacion manual de el objeto de la clase PedidoService

        pedidoService.realizar(pedido);

        pedido = null; // el objeto es elegible por el Garbage Collector
        pedidoService = null; // el objeto es elegible por el Garbage Collector
    }
}
