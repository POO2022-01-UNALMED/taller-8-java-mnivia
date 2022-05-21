package futbol;

public abstract class Futbolista implements Comparable<Object> {

	private String nombre;
	private int edad;
	private final String posicion; // No debe cambiar una vez establecida

	public Futbolista() {
		this("Maradona",30,"delantero");
	}

	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion ;
	}

	public boolean equals(Futbolista f) {
		if(this.nombre.equals(f.nombre) && this.edad==f.edad && this.posicion.equals(f.posicion)) {
			return true;
		}
		return false;
	}



	public abstract boolean jugarConLasManos();



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}


}
