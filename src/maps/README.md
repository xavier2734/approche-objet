# 📚 TP Maps — Structure de Données et Manipulation en Java

Ce dossier regroupe des exercices pratiques dédiés à la compréhension, à la manipulation et à l'optimisation des structures de données de type `Map` en Java, et plus particulièrement de la classe `HashMap`.

---

## 🎯 Concepts clés à retenir pour les révisions

Une `HashMap` fonctionne différemment d'une `ArrayList` (qui stocke les éléments séquentiellement). Elle associe une **clé unique** à une **valeur**.

### 💡 L'analogie du Vestiaire (Pour comprendre le concept)
* **L'approche `ArrayList` :** Les manteaux sont suspendus les uns à la suite des autres. Si vous cherchez le manteau de *"Paul"*, vous devez regarder l'étiquette de *chaque* manteau, un par un, en partant du début. C'est une recherche linéaire ($O(n)$).
* **L'approche `HashMap` :** Quand Paul dépose son manteau, on lui donne un **ticket unique** (la **Clé**) et on range le manteau (la **Valeur**). Quand Paul revient, il donne son ticket : on sait *exactement* sur quel cintre aller, instantanément ($O(1)$).

### 🔧 Les méthodes fondamentales à maîtriser
* `put(clé, valeur)` : Ajoute ou remplace une association. Si la clé existe déjà, la nouvelle valeur remplace l'ancienne (une clé est strictement unique).
    * 💡 *Analogie : Si on réutilise le même numéro de ticket pour un autre manteau, le premier est jeté et remplacé.*
* `putAll(autreMap)` : Copie toutes les associations d'une Map source vers une Map cible. Les structures d'origine restent inchangées.
    * 💡 *Analogie : On vide tout le contenu d'un vestiaire secondaire dans le vestiaire principal.*
* `get(clé)` : Récupère instantanément la valeur associée à la clé, sans avoir à parcourir toute la collection. Retourne `null` si la clé n'existe pas.
    * 💡 *Analogie : Vous donnez votre ticket au groom pour récupérer votre manteau.*
* `remove(clé)` : Supprime l'association liée à la clé spécifiée.
    * 💡 *Analogie : On jette le manteau et on détruit le ticket associé.*
* `size()` : Renvoie le nombre de paires (couples clé ➔ valeur) contenues dans la Map.
    * 💡 *Analogie : Compte le nombre exact de tickets distribués dans le vestiaire.*
* `keySet()` : Retourne la collection de toutes les clés de la Map (très utile pour les parcours).
    * 💡 *Analogie : Le carnet contenant la liste de tous les numéros de tickets.*
* `values()` : Retourne la collection de toutes les valeurs de la Map.
    * 💡 *Analogie : Le gros tas de tous les manteaux du vestiaire, sans distinction des tickets.*

### ⚙️ Comment ça fonctionne "Sous le Capot" ?
Quand vous utilisez `put("Paul", 1750.0)`, Java applique une moulinette mathématique appelée **`hashCode()`** sur la clé. Cela transforme le texte `"Paul"` en un index numérique unique. Java saute directement à cet index dans un tableau interne pour y stocker la valeur. C'est pourquoi un `.get("Paul")` ne parcourt jamais la Map et reste instantané !

---

## 📁 Liste des fichiers traités

Le dossier contient **7 fichiers** répartis de la manière suivante :

### 🚀 Exercices applicatifs

#### 1. `CreationMap.java`
* **Objectif :** Découverte des mécanismes de base (clé `String` ➔ valeur `Double`) modélisant une association **Prénom ➔ Salaire**.
* **Notions étudiées :** Déclaration, instanciation, insertion de données avec `put()` et calcul de la taille globale avec `size()`.
* 💡 *Compréhension : Premier exercice pour fabriquer le vestiaire, distribuer 5 tickets "Prénom" et vérifier qu'on a bien 5 employés en mémoire.*

#### 2. `CreationEtManipulationMap.java`
* **Objectif :** Manipulation avancée des structures en isolant les deux composants d'une Map (clé `Integer` ➔ valeur `String`) représentant l'association **Département ➔ Ville**.
* **Notions étudiées :** Extraction et affichage sélectif de toutes les clés via `keySet()`, et de toutes les valeurs via `values()`.
* 💡 *Compréhension : Exercice pour apprendre à séparer les choses : lister d'un côté uniquement les numéros de tickets (départements), de l'autre uniquement les manteaux (villes).*

#### 3. `FusionMap.java`
* **Objectif :** Apprendre à consolider ou regrouper des données issues de sources multiples (clés `Integer` ➔ valeurs `String`) représentant l'association **Numéro ➔ Couleur**.
* **Notions étudiées :** Utilisation de la méthode `putAll()` pour cloner/fusionner des Maps de manière performante et gestion des écrasements de valeurs en cas de clés en doublon.
* 💡 *Compréhension : On fusionne deux boîtes de couleurs. Si le ticket n°1 était rouge dans la première boîte et bleu dans la deuxième, le résultat final pour le ticket n°1 sera bleu.*

#### 4. `ComptagePaysParContinent.java`
* **Objectif :** Algorithme de comptage et de mise à jour dynamique de compteurs au sein d'une Map (clés `String` ➔ valeurs `Integer`).
* **Notions étudiées :** Utilisation de `containsKey()` pour initialiser à `1` ou incrémenter un compteur existant, ou alternative pédagogique via le contrôle des retours à `null` sur un `get()`.
* 💡 *Compréhension : La Map sert de compteur. On trie des pays : si le ticket du continent existe déjà, on fait `+1` sur le compteur. Si le continent apparaît pour la première fois, on crée le ticket et on l'initialise à `1`.*

#### 5. `MapVilles.java`
* **Objectif :** Algorithme de recherche de valeurs extrêmes (minimum) et modification de structure de données.
* **Notions étudiées :** Initialisation d'un référentiel minimum avec `Integer.MAX_VALUE` et application d'une suppression sécurisée à l'aide de `remove()` à l'extérieur de la boucle de parcours pour éviter les exceptions de modification concurrente.
* 💡 *Compréhension : On cherche la plus petite ville. On commence avec un plafond maximum fictif très haut. Dès qu'une ville a moins d'habitants, elle prend la place du minimum. On note son nom pour la supprimer **après** la boucle pour ne pas perturber le parcours de Java.*

### 📦 Classes d'entités / Modèles

#### 6. `Pays.java`
* Encapsulation des données d'un pays : `nom`, `habitants` (en millions) et `continent`. Utilisé par `ComptagePaysParContinent`.
* 💡 *Compréhension : Un simple tiroir contenant le nom, le continent et la population d'un pays.*

#### 7. `Ville.java`
* Encapsulation des données d'une ville : `nom` et `habitants`. Utilisé par `MapVilles`.
* 💡 *Compréhension : Un simple tiroir contenant le nom et le nombre exact d'habitants d'une ville.*

---

## ⚠️ Les pièges fréquents à éviter aux examens
1. **Confondre la clé et la valeur** : Posez-vous toujours la question : *"Qu'est-ce qui me sert d'identifiant pour retrouver mon information ?"* (La clé).
2. **Tentative de clés doublons** : Ajouter une clé existante n'ajoute pas une ligne, cela écrase l'ancienne valeur sans générer d'erreur.
3. **Supprimer pendant un parcours** : Ne faites jamais un `remove()` à l'intérieur d'une boucle de parcours de votre Map (via ses clés ou ses valeurs), sous peine de lever une `ConcurrentModificationException`. Stockez la clé à supprimer dans une variable intermédiaire et effectuez l'action après la boucle.
    * 💡 *Analogie : Essayer de jeter un manteau pendant que le groom est en train de compter tous les cintres de la boucle. Ça fait planter le programme !*
