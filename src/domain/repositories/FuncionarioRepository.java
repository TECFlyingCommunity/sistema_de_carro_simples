package domain.repositories;

import java.util.List;

import domain.entitis.Carro;
import domain.entitis.Funcionario;

public interface FuncionarioRepository {
	void create(Funcionario funcionario);
	Funcionario read(int cod);
	void update(Funcionario funcionario);
	void delete(int cod);
	List<Funcionario> list();
}
