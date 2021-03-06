package com.gerermacoloc.app.service.generic;

import java.util.List;

/**
 * A generic service template providing an API for CUD operations.
 * 
 * @param <T>
 *            an entity type
 * @param <F>
 *            a form type
 */
public interface GenericService<T> {

    /**
     * Create an entity from a form.
     * 
     * @param form
     *            the form containing the entity attributes
     * @throws Exception 
     */
    void create(T entity) throws Exception;

    /**
     * Delete an entity
     * 
     * @param element
     *            the entity to delete
     */
    void delete(T element);

    /**
     * Delete an entity from its id.
     * 
     * @param id
     *            the id of the entity
     */
    void deleteFromId(int id);

    /**
     * Get an entity from its id.
     * 
     * @param id
     *            the id of the entity
     * @return the entity matching the id
     */
    T findById(int id);

    /**
     * List all the entities.
     * 
     * @return a list containing all the entities
     */
    List<T> list();

    /**
     * Update an entity from a form.
     * 
     * @param element
     *            the entity to update
     * @param form
     *            the form containing the new entity attributes
     */
    void update(T element);
}
