package topicoEnums;

public enum EstadosBrasileiros {
	SAO_PAULO ("SP","São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão"),
	CEARA("CE","CEARA")
	;
	private String sigla;
	private String nome;
	
	
	private EstadosBrasileiros(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	

}
