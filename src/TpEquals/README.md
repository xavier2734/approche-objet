# TpEquals

Ce dossier explore un concept pilier de la programmation orientée objet (POO) en Java : la distinction entre **l'égalité de référence** et **l'égalité métier (sémantique)** via la redéfinition de la méthode `equals()`.

## 📂 Liste des fichiers du TP

*   `Pays.java` : Classe modèle encapsulant les données d'un pays et embarquant la logique de comparaison personnalisée (générée proprement avec la norme Javadoc).
*   `TestEqualsPays.java` : Classe de test technique contenant la méthode principale (`main`) nettoyée des scories de décompilation pour valider le comportement des comparaisons.

---

## 🔬 Théorie : Pourquoi `==` ne suffit pas en Java ?

En Java, l'opérateur classique `==` possède une fonction stricte : il compare des valeurs primitives ou des **adresses mémoires** (les pointeurs de référence) :
*   Si deux variables pointent vers deux objets créés séparément (via `new`), `==` renverra toujours `false`, même si les données stockées à l'intérieur de ces objets (le nom et la population) sont rigoureusement identiques.

Pour remédier à cela, la classe mère universelle de Java (`Object`) fournit la méthode `equals()`. Par défaut, elle se comporte exactement comme `==`. L'objectif de ce TP est de la **surcharger** (`@Override`) pour lui donner une intelligence métier.

---

## ⚙️ Logique de la méthode `equals()` implémentée

Dans `Pays.java`, la méthode a été réécrite pour suivre un protocole de validation sécurisé en 4 étapes :

1.  **Vérification de l'identité de référence** : Si `this == obj`, les deux variables pointent vers le même tiroir mémoire. L'égalité est immédiate et retourne `true`.
2.  **Vérification de la validité et du type** : Si l'objet passé en paramètre est `null` ou n'appartient pas exactement à la classe `Pays` (via `getClass()`), la comparaison s'arrête et retourne `false`.
3.  **Le Cast (Conversion de type)** : L'objet générique `obj` est converti en type `Pays` pour pouvoir accéder à ses variables internes de façon sécurisée.
4.  **Comparaison sémantique des données métier** : L'égalité finale est validée si et seulement si :
    *   Leurs **populations** sont numériquement égales (`population == autre.population`).
    *   Leurs **noms** sont textuellement identiques (`Objects.equals(nom, autre.nom)`), ce qui évite un plantage si l'un des noms est vide (`null`).
