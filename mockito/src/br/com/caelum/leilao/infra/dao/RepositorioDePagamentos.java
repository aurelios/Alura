package br.com.caelum.leilao.infra.dao;

import br.com.caelum.leilao.dominio.Pagamento;

/**
 * Created by tqi_agimenes on 14/02/2017.
 */
public interface RepositorioDePagamentos {
    void salva(Pagamento pagamento);
}
