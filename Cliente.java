package tp;

public class Cliente {
	private int dni;
    private String nombre;
    private int telefono;
    private boolean esPasajero;
    private Pasajero pasajero;
	public Cliente(int dni, String nombre, int telefono, boolean esPasajero, Pasajero pasajero) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.esPasajero = esPasajero;
        this.pasajero = pasajero;
    }
	
	public int getDni() {
	        return dni;
	}

	public String getNombre() {
	        return nombre;
	}

	public int getTelefono() {
	        return telefono;
	}

	public boolean isEsPasajero() {
	        return esPasajero;
	}

	public Pasajero getPasajero() {
	        return pasajero;
	}

	public void setEsPasajero(boolean esPasajero) {
	        this.esPasajero = esPasajero;
	}

	public void setPasajero(Pasajero pasajero) {
	        this.pasajero = pasajero;
	}
}
