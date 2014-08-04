package com.gerermacoloc.app.repo;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.domain.RoommateList;
import com.gerermacoloc.app.repo.contract.RoommateListDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class RoommateListDaoImpl extends GenericDaoImpl<RoommateList> implements RoommateListDao {

    public RoommateListDaoImpl() {
        super(RoommateList.class);
    }

	@Override
	public RoommateList findToBuyList(Roommate roommate) {
		try {
			return (RoommateList) this.entityManager.createQuery("SELECT list FROM RoommateList list WHERE list.owner = :owner AND list.type = 'TOBUYLIST'").setParameter("owner", roommate).getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RoommateList> findUserCreatedLists(Roommate roommate) {
		return (List<RoommateList>) this.entityManager.createQuery("SELECT list FROM RoommateList list WHERE list.owner = :owner AND list.type != 'TOBUYLIST'").setParameter("owner", roommate).getResultList();
	}
}
