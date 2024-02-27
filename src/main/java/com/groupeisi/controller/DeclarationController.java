package com.groupeisi.controller;

import com.groupeisi.entities.Declarant;
import com.groupeisi.entities.Declaration;
import com.groupeisi.service.DeclarantService;
import com.groupeisi.service.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class DeclarationController {
    private final DeclarationService declarationService;
    private final DeclarantService declarantService;

    @Autowired
    private DeclarationController(DeclarationService declarationService, DeclarantService declarantService){
        this.declarationService = declarationService;
        this.declarantService = declarantService;
    }

    @PostMapping("/declarations")
    public String saveDeclaration(@ModelAttribute("declarations") Declaration declaration) {
        declarationService.saveDeclaration(declaration);
        return "redirect:/declaration/declarations";
    }

    // handler method to handle list declarations and return mode and view
    @GetMapping("/declarations")
    public String listDeclarations(Model model) {
        model.addAttribute("declarations", declarationService.getAllDeclaration());
        return "declaration/declarations";
    }

    @GetMapping("/declarations/new")
    public String createDeclarationForm(Model model) {

        // create declaration object to hold declaration form data
        Declaration declaration = new Declaration();
        model.addAttribute("declarants", declarantService.getAllDeclarants());
        model.addAttribute("declaration", new Declaration());
        return "declaration/add";
    }



    @GetMapping("/declarations/edit/{id}")
    public String editDeclarationForm(@PathVariable Long id, Model model) {
        model.addAttribute("declaration", declarationService.getDeclarationById(id));
        return "declaration/update";
    }

    @PostMapping("/declarations/{id}")
    public String updateDeclaration(@PathVariable Long id,
                                  @ModelAttribute("declaration") Declaration declaration ) {

        // get declaration from database by id
        Declaration existingDeclaration = declarationService.getDeclarationById(id);
        existingDeclaration.setId(id);
        existingDeclaration.setDateDeclaration(declaration.getDateDeclaration());
        existingDeclaration.setMontantDeclaration(declaration.getMontantDeclaration());
        existingDeclaration.setDeclarant(declaration.getDeclarant());

        // save updated student object
        declarationService.updateDeclaration(existingDeclaration);
        return "redirect:/declaration/declarations";
    }




    // handler method to handle delete declaration request

    @GetMapping("/declarations/{id}")
    public String deleteDeclaration(@PathVariable Long id) {
        declarationService.deleteDeclarationById(id);
        return "redirect:/declaration/declarations";
    }

}
