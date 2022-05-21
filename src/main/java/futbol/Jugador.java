package futbol;

public class Jugador extends Futbolista{

	public short golesMarcados;
	public byte dorsal;



	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
		// TODO Auto-generated constructor stub
	}

	public Jugador(String nombre, int edad, String posicion,short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object Futbolista) {
		// TODO Auto-generated method stub
		return (Math.abs(this.getEdad()-((Jugador)Futbolista).getEdad()));
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene" + this.getEdad()  + "y juega de "+ this.getPosicion() + " con el dorsal "+ this.dorsal+ ".Ha marcado "+ golesMarcados;
	}



}
