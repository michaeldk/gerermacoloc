package com.gerermacoloc.app.repo;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Operation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.contract.OperationDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class OperationDaoImpl extends GenericDaoImpl<Operation> implements OperationDao {

    public OperationDaoImpl() {
        super(Operation.class);
    }

	@Override
	public List<Operation> findOperationsbyRoommate(Roommate roommate) {
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<Operation> criteria = builder.createQuery(Operation.class);
        final Root<Operation> operationRoot = criteria.from(Operation.class);
        criteria.select(operationRoot);
        Predicate owedOrOwingClause = builder.or(builder.equal(operationRoot.get("roommateOwing"), roommate), builder.equal(operationRoot.get("roommateOwed"), roommate));
        criteria.where(owedOrOwingClause);

        return this.entityManager.createQuery(criteria).getResultList();
	}

	@Override
	public List<Operation> findOperationsbyColoc(Colocation coloc) {
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<Operation> criteria = builder.createQuery(Operation.class);
        final Root<Operation> operationRoot = criteria.from(Operation.class);
        criteria.select(operationRoot);
        criteria.where(builder.equal(operationRoot.get("colocation"), coloc));

        return this.entityManager.createQuery(criteria).getResultList();
	}
}
