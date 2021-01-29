package Tp1;

public class Ascensor {

		public Ascensor(Integer capacidad_maxima,TipoAscensor tipo) {
			this.capacidad_maxima = capacidad_maxima;
			this.tipo = tipo;
		}
		
		private Integer capacidad_maxima;
		private TipoAscensor tipo;
		
		public Integer getCapacidad_maxima() {
			return capacidad_maxima;
		}
		public TipoAscensor getTipo() {
			return tipo;
		}
		
		public Integer subir(Integer cantidad_pisos) {
			Integer piso = 0;
			for (int i = 0; i < cantidad_pisos; i++) {
				piso++;
			}
			return piso;
		}
}
