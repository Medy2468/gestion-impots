Mise en place de système de régularisation des impôts pour les contribuables en spring-boot. Ce système va permettre de mettre aux usagers d'effectuer les paiements de leurs impôts. Il est possible pour un déclarant d'effectuer plusieurs paiements d'une même déclaration. 
Declarant (id long, raisonSociale String, adresse String, email String, telephone String) 
Declaration(id long, dateDeclaration date, montantDeclaration double, idDeclarant long) 
Paiement(id long, datePaiement Date, montantPaiement double, idDeclaration long) 
Interface avec thymeleaf pour l'ajout et la liste de chaque classe seulement.

* Liste des declarant avant insertion
  ![Liste_declarant_avant_insertion](https://github.com/Medy2468/gestion-impots/assets/95325770/3a5b35b2-f1be-4df1-be6c-2dd654ec49d5)

* Formulaire d'ajout des déclarants
  ![Ajout_declarant](https://github.com/Medy2468/gestion-impots/assets/95325770/0ad4edcd-2ff0-407d-a94b-d4e4c569f4dd)

* Insertion des déclarants
  ![Après_insertion_declarant](https://github.com/Medy2468/gestion-impots/assets/95325770/ba62683e-d5e0-41c0-97b2-6381399dbfc2)

* Modification du second déclarant
  ![Modification_declarant](https://github.com/Medy2468/gestion-impots/assets/95325770/1850295d-2581-4a7a-b8d5-6b0c88000092)

* Après modification du declarant
  ![Apres_modification_declarant](https://github.com/Medy2468/gestion-impots/assets/95325770/d76316d5-4669-4b3b-acfd-c02840e35642)

* Suppression du premier declarant
  ![Suppression_1er_declarant](https://github.com/Medy2468/gestion-impots/assets/95325770/d936b963-95c3-40ec-adf4-564557260f4b)

* Insertion à nouveau d'un declarant
  ![Ajout_declarant_apres_suppression](https://github.com/Medy2468/gestion-impots/assets/95325770/1788fa8e-c74c-408e-9889-c2a3737b6e63)

* Liste déclaration
  ![liste_declaration](https://github.com/Medy2468/gestion-impots/assets/95325770/664e837b-8a46-4675-bf99-c8a775537218)

* Formulaire ajout déclaration
  ![Formulaire_ajout_declaration](https://github.com/Medy2468/gestion-impots/assets/95325770/016e9511-a66f-4902-92f7-ab1508a8a6d2)

* Liste déclaration après ajout
  ![Insertion_Declaration](https://github.com/Medy2468/gestion-impots/assets/95325770/712f153d-fa35-40e8-a65e-eca5a11648bd)

* Suppression de la première déclaration
![Suppression_1er_declaration](https://github.com/Medy2468/gestion-impots/assets/95325770/702499d9-9898-4fc7-aec2-5a2bbb02e54b)

* Insertion à nouveau du déclarant supprimer
  ![Ajout_declaration_apres_suppression](https://github.com/Medy2468/gestion-impots/assets/95325770/f895131a-5c62-4b36-b66a-c2b6801c543b)

* Liste des paiements
  ![Liste_paiement](https://github.com/Medy2468/gestion-impots/assets/95325770/759dc78d-bc1a-4add-8790-d7f562d51569)

* Formulaire d'ajout des paiements
  Lors de l'ajout il renvoie la date de declaration dans la liste déroulante et au résultat il affiche la raisonSociale du déclarant qui fait la déclaration
  ![Ajout_paiement](https://github.com/Medy2468/gestion-impots/assets/95325770/be1fcda7-dedc-424e-9f2a-573e9cf3ec4b)

* Liste des paiements après insertion
  Comme nous le constant au niveau du déclarant il donne la raisonSociale du déclarant qui effectue le paiement qui est en rapport avec la déclaration.
  ![insertion_paiement](https://github.com/Medy2468/gestion-impots/assets/95325770/37cf3b6c-312f-4224-8d68-e8d2a89c8b18)

* Suppression du second paiement
  ![Suppression_paiement](https://github.com/Medy2468/gestion-impots/assets/95325770/2b89ca9c-2854-4c8a-9182-88802ed0b2c0)

* Ajout à nouveau du paiement supprimer
  ![Ajout_Apres_Suppression_Paiement](https://github.com/Medy2468/gestion-impots/assets/95325770/82e2d0b6-77ae-4b7b-a434-f33f8a1e2b4d)








