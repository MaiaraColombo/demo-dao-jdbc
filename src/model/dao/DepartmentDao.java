package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj); // Inserir no banco
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); //Responsável por pegar o id e consultar no banco se existe ou não
	List <Department> findAll(); // Retorna todos os departamentos
	
}
