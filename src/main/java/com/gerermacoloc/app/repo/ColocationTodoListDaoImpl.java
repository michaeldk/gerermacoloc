package com.gerermacoloc.app.repo;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.ColocationTodoList;
import com.gerermacoloc.app.repo.contract.ColocationTodoListDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class ColocationTodoListDaoImpl extends GenericDaoImpl<ColocationTodoList> implements ColocationTodoListDao {

    public ColocationTodoListDaoImpl() {
        super(ColocationTodoList.class);
    }

	@Override
	public ColocationTodoList findByColocation(Colocation colocation) {
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<ColocationTodoList> criteria = builder.createQuery(ColocationTodoList.class);
        final Root<ColocationTodoList> queryRoot = criteria.from(ColocationTodoList.class);
        criteria.select(queryRoot);
        criteria.where(builder.equal(queryRoot.get("colocation"), colocation));

        return this.entityManager.createQuery(criteria).getSingleResult();
	}
}
