
public class Persona {

	//definir valores deffault
	private final static char sexoDeffault = 'H';
	
	public static final int bajoPeso = -1;
	
	public static final int pesoIdeal = 0;
	
	public static final int sobrePeso = 1;
	
	//variables
	private String n;
	
	private int edad;
	
	private String id;
	
	private char sexo;
	
	private double w;
	
	private double h;

	//Constructor deffault
	public Persona() {
		this("", 0, sexoDeffault, 0, 0);
	}

	//Construcor con 3 datos
	public Persona(String n, int edad, char sexo) {
		this(n, edad, sexo, 0, 0);
	}

	//Constructor con los 5 datos
	public Persona(String n, int edad, char sexo, double w, double h) {
		this.n = n;
		this.edad = edad;
		generarId();
		this.sexo = sexo;
		this.w = w;
		this.h = h;
	}
	
	//metodos privados
	//comprobar el sexo
	@SuppressWarnings("unused")
	private void comprobarSexo() {
		if((sexo != 'H'||sexo != 'h') && (sexo != 'M'||sexo != 'm')) {
			this.sexo=sexoDeffault;
		}
	}
	//generar un id aleatorio...
	private void generarId() {
		final int divisor = 23;
		
		int numId = ((int)Math.floor(Math.random()*(100000000 - 10000000)+10000000));
		
		int r = numId - (numId / divisor * divisor);
		
		char letraId = generaLetraId(r);
		
		id = Integer.toString(numId)+letraId;
	}
	
	private char generaLetraId(int r) {
		char letras[]= {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		return letras[r];
	}
/*  Metodos publicos
	public String getN() {
		return n;
	}*/

	public void setN(String n) {
		this.n = n;
	}

	/*public int getEdad() {
		return edad;
	}*/

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/*public char getSexo() {
		return sexo;
	}*/

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/*public double getW() {
		return w;
	}*/

	public void setW(double w) {
		this.w = w;
	}

	/*public double getH() {
		return h;
	}*/

	public void setH(double h) {
		this.h = h;
	}
	
	//calcular el IMC
	public int calcularIMC() {
		double pesoR = w / (Math.pow(h, 2));
		
		if (pesoR >= 20 && pesoR <=25) {
			return pesoIdeal;
		} else if (pesoR < 20) {
			return bajoPeso;
		} else {
			return sobrePeso;
		}
	}
	
	//Logica para mayor o menor de edad
	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if(edad>=18) {
			mayor = true;
		}
		return mayor;
	}

	//logica para el genero 
	@Override
	public String toString() {
		String sexo;
		if(this.sexo == 'H') {
			sexo = "hombre";
		}
		else {
			sexo = "mujer";
		}
		return "Informacion personal: \n" + "Nombre: " + n + "\n" + "Sexo: " + sexo + "\n" + "Edad: " + edad + " años\n" + "Identificacion: " + id + "\n" + "Peso: " + w + " Kg\n" + "Altura: " + h + " metros\n";
				
	}
	
}
