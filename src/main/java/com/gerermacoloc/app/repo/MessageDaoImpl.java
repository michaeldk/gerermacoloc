package com.gerermacoloc.app.repo;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Message;
import com.gerermacoloc.app.repo.contract.MessageDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class MessageDaoImpl extends GenericDaoImpl<Message> implements MessageDao {
	private static final int MAX_MESSAGES = 10;

    public MessageDaoImpl() {
        super(Message.class);
    }

	@Override
	public List<Message> findMessages(Colocation coloc, int page) {
		int startPos = page*10;
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<Message> criteria = builder.createQuery(Message.class);
        final Root<Message> messageRoot = criteria.from(Message.class);
        criteria.select(messageRoot);
        criteria.where(builder.equal(messageRoot.get("colocation"), coloc));

        return this.entityManager.createQuery(criteria).setFirstResult(startPos).setMaxResults(MAX_MESSAGES).getResultList();
	}

}
