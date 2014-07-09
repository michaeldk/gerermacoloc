package com.gerermacoloc.app.service.generic;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gerermacoloc.app.repo.generic.GenericDao;

/**
 * A Generic service implementation providing default implementation for Create, Update, Delete and Display functions.
 * 
 * @param <T>
 *            an entity to manipulate
 * @param <F>
 *            the form allowing to validate the input
 */
@Transactional
public abstract class GenericServiceImpl<T> implements GenericService<T> {

    protected GenericDao<T> dao;

    public GenericServiceImpl(final GenericDao<T> dao) {

        this.dao = dao;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void create(T entity) throws Exception {
	    this.dao.create(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(final T element) {
        this.dao.delete(element);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteFromId(final int id) {
        this.dao.delete(this.dao.findById(id));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T findById(final int id) {
        return this.dao.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> list() {
        return this.dao.findAll();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final T element) {
        this.dao.update(element);
    }
    
    /**
     * Verify all the business rules on that element
     * 
     * @param element the element to test against rules
     * @throws Exception
     */
    public abstract void verifyBusinessRules(T element) throws Exception;
}
