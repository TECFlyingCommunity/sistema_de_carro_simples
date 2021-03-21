package domain.entitis;

public class Carro {
	private int carcod;
	private String carmodelo;
	private String carmarca;
	private String carplaca;
	private String carcor;
	private String cardescri;
	
	public Carro(String carmodelo, String carmarca, String carplaca, String carcor, String cardescri) {
		super();
		this.carmodelo = carmodelo;
		this.carmarca = carmarca;
		this.carplaca = carplaca;
		this.carcor = carcor;
		this.cardescri = cardescri;
	}
	
	

	
	public Carro() {
		super();
	}



	public int getCarcod() {
		return carcod;
	}
	public void setCarcod(int carcod) {
		this.carcod = carcod;
	}
	public String getCarmodelo() {
		return carmodelo;
	}
	public void setCarmodelo(String carmodelo) {
		this.carmodelo = carmodelo;
	}
	public String getCarmarca() {
		return carmarca;
	}
	public void setCarmarca(String carmarca) {
		this.carmarca = carmarca;
	}
	public String getCarplaca() {
		return carplaca;
	}
	public void setCarplaca(String carplaca) {
		this.carplaca = carplaca;
	}
	public String getCarcor() {
		return carcor;
	}
	public void setCarcor(String carcor) {
		this.carcor = carcor;
	}
	public String getCardescri() {
		return cardescri;
	}
	public void setCardescri(String cardescri) {
		this.cardescri = cardescri;
	}
	@Override
	public String toString() {
		return "Carro [carcod=" + carcod + ", carmodelo=" + carmodelo + ", carmarca=" + carmarca + ", carplaca="
				+ carplaca + ", carcor=" + carcor + ", cardescri=" + cardescri + "]";
	}
	
	
	
	
	
}
