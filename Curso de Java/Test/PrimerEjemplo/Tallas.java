package PrimerEjemplo;

public enum Tallas {
	
	S("s"),M("m"),L("l"),XL("xl");
	
	private Tallas(String abreviaturas) {
		this.abreviaturas = abreviaturas;
	}
	
	public String getAbreviatura() {
		return this.abreviaturas;
	}
	 private String abreviaturas; 
}
