
public class Cuenta {
		
		//variables "privadas!"
		private String titular;
		private double cantidad;
		
		//Constructor "Sobrecarga"
		public Cuenta(String titular) {
			this(titular,0);
		}
		//Constructor con la condición inicial
		public Cuenta(String titular, double cantidad) {
			this.titular = titular;
			if(cantidad<0) {
				this.cantidad=0;
			}
			else {
				this.cantidad = cantidad;
			}
		}
		//Getters and setters
		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public double getCantidad() {
			return cantidad;
		}

		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		//Metodos de deposito o retiros
		public void adicion(double cantidad) {
			if(cantidad>0) {
				this.cantidad += cantidad;
			}
		}
		public void sustraccion(double cantidad) {
			if(this.cantidad-cantidad<0) {
				this.cantidad=0;
			}
			else {
				this.cantidad -= cantidad;
			}
		}
		
		//metodo "toString"
		@Override
		public String toString() {
			return "El titular " + titular + " tiene " + cantidad + " Euros en la cuenta.";
		}	
	}

