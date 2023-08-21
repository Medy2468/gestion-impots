package com.groupeisi.controller;

import com.groupeisi.entities.Declarant;
import com.groupeisi.service.DeclarantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeclarantController {
    private DeclarantService declarantService;

    private DeclarantController(DeclarantService declarantService){
        super();
        this.declarantService = declarantService;
    }

    // handler method to handle list declarants and return mode and view
    @GetMapping("/declarants")
    public String listDeclarants(Model model) {
        model.addAttribute("declarants", declarantService.getAllDeclarants());
        return "declarants";
    }

    @GetMapping("/declarants/new")
    public String createDeclarantForm(Model model) {

        // create declarant object to hold declarant form data
        Declarant declarant = new Declarant();
        model.addAttribute("declarant", declarant);
        return "add";

    }

    @PostMapping("/declarants")
    public String saveDeclarant(@ModelAttribute("declarant") Declarant declarant) {
        declarantService.saveDeclarant(declarant);
        return "redirect:/declarants";
    }

    @GetMapping("/declarants/edit/{id}")
    public String editDeclarantForm(@PathVariable Long id, Model model) {
        model.addAttribute("declarant", declarantService.getDeclarantById(id));
        return "update";
    }

    @PostMapping("/declarants/{id}")
    public String updateDeclarant(@PathVariable Long id,
                                @ModelAttribute("declarant") Declarant declarant,
                                Model model) {

        // get declarant from database by id
        Declarant existingDeclarant = declarantService.getDeclarantById(id);
        existingDeclarant.setId(id);
        existingDeclarant.setRaisonSociale(declarant.getRaisonSociale());
        existingDeclarant.setAdresse(declarant.getAdresse());
        existingDeclarant.setEmail(declarant.getEmail());
        existingDeclarant.setTelephone(declarant.getTelephone());

        // save updated student object
        declarantService.updateDeclarant(existingDeclarant);
        return "redirect:/declarants";
    }

    // handler method to handle delete declarant request

    @GetMapping("/declarants/{id}")
    public String deleteDeclarant(@PathVariable Long id) {
        declarantService.deleteDeclarantById(id);
        return "redirect:/declarants";
    }


}
