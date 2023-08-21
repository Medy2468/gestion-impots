package com.groupeisi.controller;

import com.groupeisi.entities.Declarant;
import com.groupeisi.entities.Paiement;
import com.groupeisi.service.DeclarationService;
import com.groupeisi.service.PaiementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaiementController {
    private PaiementService paiementService;
    private DeclarationService declarationService;

    private PaiementController(PaiementService paiementService, DeclarationService declarationService){
        this.paiementService = paiementService;
        this.declarationService = declarationService;
    }

    // handler method to handle list paiements and return mode and view
    @GetMapping("/paiements")
    public String listPaiements(Model model) {
        model.addAttribute("paiements", paiementService.getAllPaiement());
        return "paiement/paiements";
    }

    @GetMapping("/paiements/new")
    public String createPaiementForm(Model model) {

        // create paiement object to hold paiement form data
        model.addAttribute("declarations", declarationService.getAllDeclaration());
        model.addAttribute("paiement", new Paiement());
        return "paiement/add";
    }

    @PostMapping("/paiements")
    public String savePaiement(@ModelAttribute("paiement") Paiement paiement) {
        paiementService.savePaiement(paiement);
        return "redirect:/paiements";
    }

    @GetMapping("/paiements/edit/{id}")
    public String editPaiementForm(@PathVariable Long id, Model model) {
        model.addAttribute("paiement", paiementService.getPaiementById(id));
        return "paiement/update";
    }

    @PostMapping("/paiements/{id}")
    public String updatePaiement(@PathVariable Long id,
                                  @ModelAttribute("paiement") Paiement paiement,
                                  Model model) {

        // get paiement from database by id
        Paiement existingPaiement = paiementService.getPaiementById(id);
        existingPaiement.setId(id);
        existingPaiement.setDatePaiement(paiement.getDatePaiement());
        existingPaiement.setMontantPaiement(paiement.getMontantPaiement());
        existingPaiement.setDeclaration(paiement.getDeclaration());

        // save updated paiement object
        paiementService.updatePaiement(existingPaiement);
        return "redirect:/paiements";
    }

    // handler method to handle delete paiement request

    @GetMapping("/paiements/{id}")
    public String deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiementById(id);
        return "redirect:/paiements";
    }
}
