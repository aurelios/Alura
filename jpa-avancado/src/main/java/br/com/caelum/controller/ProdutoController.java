package br.com.caelum.controller;

import br.com.caelum.dao.ProdutoDao;
import br.com.caelum.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoDao produtoDao;

    @Transactional
    @RequestMapping(method = RequestMethod.POST, name = "cadastraProduto")
    public String salvar(@ModelAttribute @Valid Produto produto, BindingResult result, RedirectAttributes atts) {

        if (result.hasErrors()) {
            return form(produto);
        }

        produtoDao.insere(produto);

        return "redirect:/";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Produto produto) {
        return "produto/form";
    }

    @RequestMapping(value = "/{id}/form", method = RequestMethod.GET)
    public String update(@PathVariable Integer id, Model model) {
        Produto produto = produtoDao.getProduto(id);

        model.addAttribute("produto", produto);
        return form(produto);
    }

    @RequestMapping("/{id}")
    public String detalhe(@PathVariable Integer id, Model model) {
        Produto produto = produtoDao.getProduto(id);

        model.addAttribute("produto", produto);
        return "produto/detalhe";
    }

    @RequestMapping(value = "/buscar", method = RequestMethod.POST, name = "buscarProdutos")
    public String buscarPor(Model model,
                            @RequestParam String nome,
                            @RequestParam Integer categoriaId,
                            @RequestParam(required = false) Integer lojaId) {

        List<Produto> produtos = produtoDao.getProdutos(nome, categoriaId, lojaId);

        model.addAttribute("produtos", produtos);

        return "home";

    }
}
