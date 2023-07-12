package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("select users from User users",User.class).getResultList() ;
    }

    @Override
    public void save(User user) {
        if (user.getId() != null){
            entityManager.merge(user);
        }else {
            entityManager.persist(user);
        }
    }

    @Override
    public User getById(int id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public void delete(int id) {
        entityManager.createQuery("delete from User user where user.id = :id").
                setParameter("id",id).
                executeUpdate();
    }
}
