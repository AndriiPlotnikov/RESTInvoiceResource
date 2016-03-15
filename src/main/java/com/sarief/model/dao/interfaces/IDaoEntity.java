package com.sarief.model.dao.interfaces;

import java.util.List;

/**
 * Data Access Object to abstract storage interface
 * @author Andrii
 * @param <T> - Class of entity
 */
public interface IDaoEntity<T>{
	/**
	 * creates/saves entity to storage
	 * @param entity - to be saved
	 * @return created entity, with id set
	 */
	T create(T entity);
	/**
	 * read entity from storage
	 * @param id - id of entity in storage 
	 * @return entity loaded from storage
	 */
	T read  (long id);
	/**
	 * edit existing entity
	 * @param entity - information to update storage
	 * @return entity containing info before update
	 */
	T update(T entity);
	/**
	 * delete entity from storage
	 * @param entity - to be deleted
	 * @return deleted entity - returned entity will not have reference in storage
	 */
	T delete(T entity);
	/**
	 * read all entities
	 * @return list of all entities 
	 */
	List<T> readAll();
	
}
