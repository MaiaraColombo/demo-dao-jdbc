package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj); // Inserir no banco
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id); //Respons�vel por pegar o id e consultar no banco se existe ou n�o
	List <Seller> findAll(); // Retorna todos os departamentos
	
}
