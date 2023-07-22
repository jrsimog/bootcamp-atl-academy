package ATL.ACADEMY.newslatter.repository;

import ATL.ACADEMY.newslatter.models.Prospecto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmailRepository {
    @PersistenceContext
    EntityManager database;

    @Transactional
    public void guardarEmail(String emailStr) {
        String query = "INSERT into prospecto (email)" +
                "values (:emailStr);";
        //HQL
        // SE LLAMAN OBJETOS
        //database.createNativeQuery(query).executeUpdate();
        //SQL
        // SE LLAMAN TABLAS
        //database.createQuery(query).executeUpdate();
        // ASEGURAR QUERY
        database.createNativeQuery(query)
                .setParameter("emailStr",emailStr)
                .executeUpdate();
    }

    @Transactional
    public void eliminarEmail(String emailStr) {
        String query = "UPDATE prospecto set deleted_at = NOW() WHERE email  = :emailStr";
        database.createNativeQuery(query)
                .setParameter("emailStr",emailStr)
                .executeUpdate();
    }

    @Transactional
    public List<Prospecto> suscribeList() {
        String query = "SELECT * FROM prospecto;";
        List<Prospecto> prospectos = database.createNativeQuery(query)
                .getResultList();
        return  prospectos;
    }
}
