package futbol;

public class Portero extends Futbolista{

	public short golesRecibidos;
	public byte dorsal;



	public Portero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		// TODO Auto-generated constructor stub
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
	}

	@Override
	public int compareTo(Object Futbolista) {
		// TODO Auto-generated method stub		
		return (Math.abs(this.golesRecibidos-(((Portero)Futbolista).golesRecibidos)));
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene" + this.getEdad()  + "y juega de "+ this.getPosicion() + " con el dorsal "+ this.dorsal+ ".Le han marcado "+ golesRecibidos;
	}



}
