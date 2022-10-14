import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedir los datos
		 String nombre = JOptionPane.showInputDialog("Introduce el nombre");
		 String texto = JOptionPane.showInputDialog("Introduce la edad");
		 int edad = Integer.parseInt(texto);
		 texto = JOptionPane.showInputDialog("Introduce el sexo");
		 char sexo = texto.charAt(0);
		 texto = JOptionPane.showInputDialog("Introduce el peso");
		 double peso = Double.parseDouble(texto);
		 texto = JOptionPane.showInputDialog("Introduce la altura");
		 double altura = Double.parseDouble(texto);
		 //Crear objetos
		 Persona persona1 = new Persona();
		 Persona persona2 = new Persona(nombre, edad, sexo);
		 Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
		 //Completamos los datos incompletos con los Set
		 persona1.setN("Laura");
		 persona1.setEdad(30);
		 persona1.setSexo('M');
		 persona1.setW(60);
		 persona1.setH(1.60);
		 persona2.setW(90.5);
		 persona2.setH(1.80);
		 //Usamos metodos para realizar la misma accion para cada objeto
		 System.out.println("Persona1");
		 MuestraMensajePeso(persona1);
		 MuestraMayorDeEdad(persona1);
		 System.out.println(persona1.toString());
		 System.out.println("Persona2");
		 MuestraMensajePeso(persona2);
		 MuestraMayorDeEdad(persona2);
		 System.out.println(persona2.toString());
		 System.out.println("Persona3");
		 MuestraMensajePeso(persona3);
		 MuestraMayorDeEdad(persona3);
		 System.out.println(persona3.toString());
		 }
		//salidas 
		public static void MuestraMensajePeso(Persona p) {
		 int IMC = p.calcularIMC();
		 switch (IMC) {
		 case Persona.pesoIdeal:
		 System.out.println("La persona esta en su peso ideal");
		 break;
		 case Persona.bajoPeso:
		 System.out.println("La persona esta por debajo de su peso ideal");
		 break;
		 case Persona.sobrePeso:
		 System.out.println("La persona esta por encima de su peso ideal");
		 break;
		 }
		 }
		 public static void MuestraMayorDeEdad(Persona p) {
		 if (p.esMayorDeEdad()) {
		 System.out.println("La persona es mayor de edad");
		 } else {
		 System.out.println("La persona no es mayor de edad");
		 }
		 
	}

}
