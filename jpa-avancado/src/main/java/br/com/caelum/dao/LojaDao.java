package br.com.caelum.dao;

import br.com.caelum.model.Loja;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class LojaDao {

    @PersistenceContext
    private EntityManager em;

    public List<Loja> getLojas() {
        TypedQuery<Loja> query = em.createQuery("from Loja", Loja.class);

        return query.getResultList();
    }

    public Loja getLoja(Integer lojaId) {
        return em.find(Loja.class, lojaId);
    }

}
