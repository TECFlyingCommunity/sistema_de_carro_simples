package domain.entitis;

public class Funcionario {
	
	private int funcod;
	private String funcpf;
	private String funrg;
	private String funnome;
	private String funsenha;
	
	

	public Funcionario( String funcpf, String funrg, String funnome, String funsenha) {
		super();
		
		this.funcpf = funcpf;
		this.funrg = funrg;
		this.funnome = funnome;
		this.funsenha = funsenha;
	}
	
	
	public Funcionario() {
		super();
	}

	public int getFuncod() {
		return funcod;
	}
	public void setFuncod(int funcod) {
		this.funcod = funcod;
	}
	public String getFuncpf() {
		return funcpf;
	}
	public void setFuncpf(String funcpf) {
		this.funcpf = funcpf;
	}
	public String getFunrg() {
		return funrg;
	}
	public void setFunrg(String funrg) {
		this.funrg = funrg;
	}
	public String getFunnome() {
		return funnome;
	}
	public void setFunnome(String funnome) {
		this.funnome = funnome;
	}
	public String getFunsenha() {
		return funsenha;
	}
	public void setFunsenha(String funsenha) {
		this.funsenha = funsenha;
	}



	@Override
	public String toString() {
		return "Funcionario [funcod=" + funcod + ", funcpf=" + funcpf + ", funrg=" + funrg + ", funnome=" + funnome
				+ ", funsenha=" + funsenha + "]";
	}
	

}
