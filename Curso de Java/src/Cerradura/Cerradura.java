package Cerradura;

public class Cerradura {

		public Cerradura(Integer claveApertura,Integer cantidadDeFallosConsecutivosQueLaBloquea
						 ) {
			this.clave_apertura = claveApertura;
			this.cantidadDeFallos = cantidadDeFallosConsecutivosQueLaBloquea;
			this.contadorDefallos = 0;
			this.contadorDeAciertos = 0;
			this.cerraduraNuevaCerrada = true;
		}
		
		private Integer clave_apertura;
		private Integer cantidadDeFallos;
		private Integer contadorDefallos;
		private Integer contadorDeAciertos;
		private Boolean cerraduraNuevaCerrada;
		
		public Boolean abrir(Integer clave) {
			if(cerraduraNuevaCerrada) {
				if(!this.fueBloqueada()) {
					if(this.clave_apertura.equals(clave)) {
						this.contadorDeAciertos++;
						this.cerraduraNuevaCerrada = false;
						return true;
					}
					else {
						this.contadorDefallos++;
						return false;
					}
				}
			}
			
			return false;
		}
		
		public Boolean estaAbierta() {
			if(!this.cerraduraNuevaCerrada) {
				return true;
			}
			return false;
		}
		public Boolean estaCerrada() {
			if(this.cerraduraNuevaCerrada) {
				return true;
			}
			return false;
		}
		
		public Boolean fueBloqueada() {
			if(this.contadorDefallos.equals(cantidadDeFallos)) {
				return true;
			}
			return false;
		}
		
		public Integer contarAperturasExitosas() {
			return this.contadorDeAciertos;
		}
		
		public Integer contarAperturasFallidas() {
			return this.contadorDefallos;
		}
}

