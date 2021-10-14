package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj); // Inserir no banco
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id); //Responsável por pegar o id e consultar no banco se existe ou não
	List <Seller> findAll(); // Retorna todos os departamentos
	
}
