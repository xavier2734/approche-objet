# Dossier : Dates

Ce dossier regroupe des exercices pratiques pour apprendre à manipuler, configurer et formater les dates en Java à l'aide des anciennes API standards (`java.util.Date`, `java.util.Calendar` et `java.text.SimpleDateFormat`).

## Fichiers du dossier

### 1. TestCalendar.java
* **Objectif** : Utilisation de la classe `Calendar` pour définir une date précise et gestion de l'internationalisation (`Locale`).
* **Notions clés** :
  * Instanciation via `Calendar.getInstance()`.
  * Modification des champs avec `calendrier.set(année, mois, jour, heure, minute, seconde)`.
  * Récupération de l'objet `Date` associé via `.getTime()`.
  * Formatage linguistique régional personnalisé (Français, Russe, Chinois, Allemand) en passant un paramètre `Locale` à `SimpleDateFormat`.

### 2. TestDates.java
* **Objectif** : Instanciation directe de la classe `Date` et application de masques de formatage simples.
* **Notions clés** :
  * Instanciation de la date système actuelle (`new Date()`).
  * Utilisation du constructeur historique (déprécié dans les versions récentes de Java mais essentiel pour la compréhension) où l'année commence en 1900 (116 = 2016) et les mois sont indexés à partir de 0 (4 = Mai).
  * Définition de patterns de formatage comme `"dd/MM/yyyy"` ou `"yyyy/MM/dd HH:mm:ss"`.
