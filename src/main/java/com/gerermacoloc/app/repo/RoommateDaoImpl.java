package com.gerermacoloc.app.repo;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.contract.RoommateDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class RoommateDaoImpl extends GenericDaoImpl<Roommate> implements RoommateDao {

    public RoommateDaoImpl() {
        super(Roommate.class);
    }

	@Override
	public Roommate findByEmail(String email) {
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<Roommate> criteria = builder.createQuery(Roommate.class);
        final Root<Roommate> roommmateRoot = criteria.from(Roommate.class);
        criteria.select(roommmateRoot);
        criteria.where(builder.equal(roommmateRoot.get("email"), email));

        return this.entityManager.createQuery(criteria).getSingleResult();
	}

	@Override
	public List<Roommate> findRoommatesByColoc(Colocation coloc) {
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<Roommate> criteria = builder.createQuery(Roommate.class);
        final Root<Roommate> roommmateRoot = criteria.from(Roommate.class);
        criteria.select(roommmateRoot);
        criteria.where(builder.equal(roommmateRoot.get("colocation"), coloc));

        return this.entityManager.createQuery(criteria).getResultList();
	}

}
