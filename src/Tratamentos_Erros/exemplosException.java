package Tratamentos_Erros;

@SuppressWarnings("serial")
public class exemplosException extends RuntimeException {
	private String nomeDoAtributo;
	public exemplosException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	public String getMessage() {
		return String.format("O atributo %s está fora do intevalo", nomeDoAtributo);
	}
}
