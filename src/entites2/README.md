# Dossier : entites2

Ce dossier se concentre sur l'approfondissement des concepts de la Programmation Orientée Objet (POO) en Java, notamment la surcharge de constructeurs, l'encapsulation (via les accesseurs et mutateurs), et la manipulation de chaînes de caractères.

## Fichiers du dossier

### 1. Personne.java
* **Objectif** : Modéliser une identité humaine complète liée à une entité externe d'adresse.
* **Notions clés** :
  * **Surcharge de constructeur** : Présence de deux constructeurs distincts. L'un permet de créer une personne avec son identité de base (nom/prénom), tandis que l'autre permet d'y associer immédiatement une `AdressePostale`.
  * **Inter-connectivité des packages** : Importation et utilisation d'une classe située dans un autre package (`entites.AdressePostale`).
  * **Méthodes de manipulation de texte** : Utilisation de la méthode native `.toUpperCase()` de la classe `String` pour formater dynamiquement l'affichage du nom de famille en majuscules.
  * **Getters et Setters personnalisés** : Mise en place de méthodes d'accès (`getNom`, `getAdresse`) et de modification (`modifierNom`, `modifierAdresse`) pour manipuler les attributs de l'objet de manière sécurisée et explicite.
