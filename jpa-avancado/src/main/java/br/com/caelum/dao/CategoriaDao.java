package br.com.caelum.dao;

import br.com.caelum.model.Categoria;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CategoriaDao {

    @PersistenceContext
    private EntityManager em;

    public List<Categoria> getCategorias() {
        TypedQuery<Categoria> query = em.createQuery("from Categoria", Categoria.class);

        return query.getResultList();
    }
}
