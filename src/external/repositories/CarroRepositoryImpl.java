package external.repositories;

import java.util.List;

import domain.entitis.Carro;
import domain.repositories.CarroRepository;
import infra.datasource.DataSource;




public class CarroRepositoryImpl implements CarroRepository {
	
	final DataSource dataSource;
	
	

	public CarroRepositoryImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public void create(Carro carro) {
		
		
	}

	@Override
	public Carro read(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Carro carro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int cod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Carro> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
