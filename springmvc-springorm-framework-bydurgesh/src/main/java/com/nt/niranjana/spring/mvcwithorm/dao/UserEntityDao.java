package com.nt.niranjana.spring.mvcwithorm.dao;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.nt.niranjana.spring.mvcwithorm.entity.UserEntity;



@Repository
public class UserEntityDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
private HibernateTransactionManager transactionManager;
	
	public void setTransactionManager(HibernateTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
	
	//@Transactional
	public int saveUser(UserEntity userEntity)
	{
		TransactionDefinition txDef = new DefaultTransactionDefinition();
        TransactionStatus txStatus = transactionManager.getTransaction(txDef);
        try {
		Session session = transactionManager.getSessionFactory().openSession();
        session.setFlushMode(FlushMode.COMMIT);
        transactionManager.commit(txStatus);
		int noOfUserInserted = (Integer) hibernateTemplate.save(userEntity);
		
		return noOfUserInserted;
	}
        catch (Exception e) {
            transactionManager.rollback(txStatus);
            throw e;
        }
       
}
}
