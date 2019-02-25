package co.grandcircus.javaBeansLab.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import java.util.List;

import co.grandcircus.javaBeansLab.entity.users;


	@Repository
	@Transactional
	public class UsersDao {
			
			@PersistenceContext
			private EntityManager em;
	
//			public void create(users user) {
//				em.persist(user);
//			}
//			public void delete(Long id) {
//				users sql = em.getReference(users.class, id);
//				em.remove(sql);
//			}
			public List<users> findAll() {
				// The SELECT clause is optional in HQL. If omitted, it's basically SELECT *.
				// When creating a a query specify the type of the results: Food.class
				// HQL queries use Java class and property names, not SQL table & column names.
				return em.createQuery("FROM User", users.class).getResultList();
			}
			
			public users findById(Long id) {
				return em.find(users.class, id);
			}
			
			public void create(users user) {
				em.persist(user);
			}
			
			public void update(users user) {
				em.merge(user);
			}
			
			public void delete(Long id) {
				// Deleting with Hibernate entity manager requires fetching a reference first.
				users user = em.getReference(users.class, id);
				em.remove(user);
			}
	}

