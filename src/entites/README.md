# Dossier : Entites

Ce dossier est dédié à la création, à la manipulation et au test d'entités Java simples représentant des objets du monde réel (`AdressePostale` et `Personne`), mettant en pratique les concepts fondamentaux de la programmation orientée objet (POO).

## Fichiers du dossier

### 1. AdressePostale.java
* **Objectif** : Modéliser un objet d'adresse avec ses attributs caractéristiques (numéro, rue, code postal, ville).
* **Notions clés** :
  * Variables d'instance avec différents niveaux de visibilité.
  * Constructeur d'initialisation personnalisé avec des paramètres nommés explicitement (`nvnumeroRue`, `nvlibelleRue`...).
  * Surcharge de la méthode standard `toString()` pour obtenir une représentation textuelle propre de l'objet.

### 2. TestAdressePostale.java
* **Objectif** : Classe exécutable de test unitaire basique.
* **Notions clés** :
  * Instanciation concrète d'objets via le mot-clé `new` et appel du constructeur d'adresse postale.

### 3. TestPersonne.java
* **Objectif** : Orchestrer des scénarios de tests plus avancés croisant plusieurs entités.
* **Notions clés** :
  * Importation de classes issues d'autres packages (`entites2.Personne`).
  * Association d'objets (liaison d'une instance de `AdressePostale` à une instance de `Personne`).
  * Utilisation intensive et validation des méthodes d'accès (getters) et de modification (setters/méthodes dédiées).
  * Vérification du cycle de vie des données (changement de nom/prénom en cours d'exécution et ré-affichage).
