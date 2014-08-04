package com.gerermacoloc.app.repo;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.ColocationList;
import com.gerermacoloc.app.repo.contract.ColocationListDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class ColocationListDaoImpl extends GenericDaoImpl<ColocationList> implements ColocationListDao {

    public ColocationListDaoImpl() {
        super(ColocationList.class);
    }
    
    @Override
    public ColocationList getColocationList(Colocation coloc) {
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<ColocationList> criteria = builder.createQuery(ColocationList.class);
        final Root<ColocationList> colocationListRoot = criteria.from(ColocationList.class);
        criteria.select(colocationListRoot);
        criteria.where(builder.equal(colocationListRoot.get("colocation"), coloc));
        try {
        	return this.entityManager.createQuery(criteria).getSingleResult();
        } catch (NoResultException nre) {
        	return null;
        }
    }
}
