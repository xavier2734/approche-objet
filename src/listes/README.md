# Dossier : listes

Ce dossier explore l'utilisation intensive des listes dynamiques (`ArrayList`) en Java à travers des manipulations de types primitifs enveloppés (`Integer`), de chaînes de caractères (`String`), et d'objets personnalisés (`Ville`).

## Fichiers du dossier

### 1. CreationListe.java
* **Notions clés** : Initialisation d'une `ArrayList<Integer>`, remplissage par boucle itérative et utilisation de la méthode `.size()`.

### 2. FusionListe.java
* **Notions clés** : Parcours d'index imbriqués pour copier et fusionner manuellement le contenu de deux listes distinctes dans une troisième.

### 3. TestListeInt.java
* **Notions clés** : Algorithmes de recherche de bornes (minimum et maximum), suppression d'un élément par son index numérique avec `.remove(index)` et application de fonctions mathématiques (`Math.abs`) via `.set()`.

### 4. TestListeString.java
* **Notions clés** : Manipulation avancée de listes de chaînes, utilisation de `.startsWith()` et gestion impérative de la décrémentation de l'index (`i--`) lors d'une suppression en cours de boucle pour éviter les sauts d'éléments.

### 5. Ville.java
* **Notions clés** : Encapsulation totale d'un modèle d'objet métier complexe. Implémentation générée des contrats structurels essentiels de Java : `equals()`, `hashCode()`, accesseurs (getters/setters) et méthode `toString()`.

### 6. TestVilles.java
* **Notions clés** : Passage de la manipulation de types simples à des collections d'objets métier complexes. Application des algorithmes de calculs de populations et de transformations de chaînes appliquées à des attributs d'objets.
