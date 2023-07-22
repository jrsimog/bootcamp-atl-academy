package ATL.ACADEMY.newslatter.repository;

import ATL.ACADEMY.newslatter.models.Prospecto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
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
    public boolean isSuscribe(String email) {
        String query = "SELECT count(*) as total FROM prospecto WHERE email LIKE :emailStr";
        Query nativeQuery = database.createNativeQuery(query);
        nativeQuery.setParameter("emailStr", email);
        long count = (long) nativeQuery.getSingleResult();
        return count > 0;
    }

    @Transactional
    public List<Prospecto> suscribeList() {

        String query = "SELECT * FROM prospecto WHERE deleted_at IS NULL";
        // query nativa sql
        //List<Prospecto> prospectos = database.createNativeQuery(query)
        //        .getResultList();
        //return  prospectos;
        // resultado
        //[
        //    [1, "jose@at.id", null],
        //    [2, "jose@at.id", null]
        //]
        //
        List<Prospecto> prospectos = database.createNativeQuery(query, Prospecto.class).getResultList();
        return prospectos;

    }
}
