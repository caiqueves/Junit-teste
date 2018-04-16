package aula06.ativ03;

public enum TipoImovel {
     
	RESIDENCIAL (1, "RESIDENCIAL"), 
	NAO_RESIDENCIAL (2, "NAORESIDENCIAL"),
	TERRITORIAL (3, "TERRITORIAL");
	
	
	private int cod;
	private String descricao;
	
	private TipoImovel () {
		
	}
	
	private TipoImovel(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoImovel toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (TipoImovel x : TipoImovel.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException ("Id inválido: " + cod );
	}
	
	
	}
