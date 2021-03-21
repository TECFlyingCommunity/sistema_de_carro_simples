package domain.repositories;

import java.util.List;

import domain.entitis.Carro;

public interface CarroRepository {
	void create(Carro carro);
	Carro read(int cod);
	void update(Carro carro);
	void delete(int cod);
	List<Carro> list();
	 
}
