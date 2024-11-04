import java.util.List;
import java.util.ArrayList;
public class Aerolinea {

	int CUIT;
	String nombre;
	List<Aeropuerto> aeropuertos;
	List<Clientes> clientes;
	List<Vuelo> vuelos;
	
	public Aerolinea(int CUIT,String nombre) {
		this.nombre=nombre;
		this.CUIT=CUIT;
		this.clientes=new ArrayList<>();
		this.aeropuertos=new ArrayList<>();
		this.vuelos=new ArrayList<>();
		
	}
	  @Override
	public void registrarCliente(int DNI, String nombre, int telefono) {
		  Cliente cliente=new Cliente(DNI,nombre, telefono);
		  if(!cliente.contains(cliente) ) {
			  clientes.add(cliente);
			  System.out.print("Se ha registrado cliente"+nombre);
		  }else {
			  System.out.print("El cliente ya ha sido registrado");
		  }
	  }
	
}
