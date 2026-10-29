# Dossier : Fichier

Ce dossier est dédié à la manipulation pratique des fichiers de données textuelles (I/O) en Java. Il met en application la lecture séquentielle, le découpage de chaînes de caractères (parsing) et l'écriture de données filtrées dans un nouveau document.

## Fichiers du dossier

### 1. Ville.java
* **Objectif** : Servir de modèle de données (modèle POO) pour structurer les informations démographiques extraites.
* **Notions clés** :
  * Encapsulation des données via des propriétés privées (`private`).
  * Accès sécurisé via des getters publics (`getNom()`, `getPopulation()`).
  * Redéfinition de la méthode `.toString()` pour faciliter le débogage et l'affichage des informations dans la console.

### 2. LectureFichier.java
* **Objectif** : Découvrir la lecture brute et séquentielle d'un fichier externe.
* **Notions clés** :
  * Utilisation des classes modernes du package `java.nio.file` (`Path`, `Paths`, `Files`).
  * Chargement complet d'un fichier volumineux en mémoire via `Files.readAllLines(path)`.
  * Parcours de listes avec une boucle `for-each` pour afficher le contenu ligne par ligne.

### 3. CreerFichier.java
* **Objectif** : Orchestrer un traitement complet de type ETL (Extraction, Transformation, Chargement).
* **Notions clés** :
  * **Extraction** : Lecture des données du fichier source `recensement.csv`.
  * **Transformation (Parsing & Filtrage)** : Découpage de chaque ligne avec `.split(";")`, nettoyage des espaces dans les nombres, conversion en entier avec `Integer.parseInt()` et instanciation d'objets `Ville` ayant plus de 25 000 habitants.
  * **Chargement** : Reformatage des données au format CSV et création du fichier de sortie `recensement25k.csv` via `Files.write(path, liste)`.
