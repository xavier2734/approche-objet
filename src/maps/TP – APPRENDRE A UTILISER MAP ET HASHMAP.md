# Classe `CreationMap`

---

# 🎯 Objectif de cette classe

Cette classe est le tout premier exercice du TP consacré aux **Map** et aux **HashMap**.

Son objectif est très simple :

- créer une `HashMap` ;
- ajouter des éléments ;
- connaître le nombre d'éléments qu'elle contient.

Cette classe ne réalise aucun traitement compliqué.

Elle sert à découvrir le fonctionnement d'une `HashMap`.

---

# 🧠 Avant de commencer

Jusqu'à présent, tu as surtout utilisé des collections comme les `ArrayList`.

Une `ArrayList` stocke simplement des objets les uns à la suite des autres.

Exemple :

```text
Index

0 → Paul

1 → Hicham

2 → Yu

3 → Ingrid
```

Pour retrouver **Yu**, Java doit parcourir la liste.

---

Une `HashMap` fonctionne différemment.

Elle associe une **clé** à une **valeur**.

```text
clé ---------> valeur
```

Dans cet exercice :

```text
Paul ---------> 1750 €

Hicham -------> 1825 €

Yu -----------> 2250 €

Ingrid -------> 2015 €

Chantal ------> 2418 €
```

Le prénom devient la clé.

Le salaire devient la valeur.

---

# 📖 Comprendre la déclaration

La première ligne importante est :

```java
HashMap<String, Double> mapSalaires = new HashMap<>();
```

Elle peut sembler impressionnante au début.

En réalité, elle est très simple.

Décomposons-la.

```text
HashMap
```

→ indique le type de collection.

---

```text
<String, Double>
```

signifie :

```text
String → clé

Double → valeur
```

Autrement dit :

```text
Prénom
      │
      ▼
Salaire
```

Il faut toujours lire une HashMap comme :

```text
clé → valeur
```

Cette manière de raisonner deviendra très naturelle avec l'habitude.

---

# ➕ Ajouter des éléments : `put()`

Pour remplir la HashMap, on utilise :

```java
mapSalaires.put("Paul", 1750.0);
```

Cette méthode ajoute une association.

Après plusieurs appels à `put()`, la mémoire ressemble à ceci :

```text
mapSalaires

Paul -------> 1750

Hicham -----> 1825

Yu ---------> 2250

Ingrid -----> 2015

Chantal ----> 2418
```

Chaque clé est unique.

Chaque clé possède une valeur associée.

---

# ⚠️ Que se passe-t-il si la clé existe déjà ?

Supposons :

```java
mapSalaires.put("Paul",1750.0);

mapSalaires.put("Paul",1900.0);
```

Le résultat sera :

```text
Paul → 1900
```

Pourquoi ?

Parce qu'une HashMap ne peut pas contenir deux fois la même clé.

La deuxième instruction remplace simplement la première.

💡 À retenir :

Une clé est **unique**.

La valeur peut être remplacée.

---

# 📏 Compter les éléments : `size()`

La méthode :

```java
mapSalaires.size();
```

renvoie :

```text
5
```

Pourquoi ?

Parce que la HashMap contient cinq associations.

Attention :

`size()` ne compte pas les caractères.

Il ne compte pas les salaires.

Il compte uniquement le nombre de couples :

```text
clé → valeur
```

Dans notre exercice :

```text
Paul → 1750

Hicham → 1825

Yu → 2250

Ingrid → 2015

Chantal → 2418
```

Il y a donc :

```text
5 associations
```

---

# 🧠 Comment réfléchir ?

Lorsque tu vois :

```java
HashMap<String, Double>
```

Ne lis pas seulement :

> "HashMap de String et Double"

Lis plutôt :

```text
Prénom
     │
     ▼
Salaire
```

Cette lecture est beaucoup plus parlante.

Tu comprendras immédiatement ce que contient la collection.

---

# 🧩 Pourquoi utiliser une HashMap ?

Imaginons une entreprise contenant plusieurs milliers d'employés.

Si tu veux retrouver le salaire de **Paul** dans une liste, il faut parcourir tous les employés.

Avec une HashMap, il suffit d'écrire :

```java
mapSalaires.get("Paul");
```

Java retrouve directement la valeur associée à cette clé.

C'est tout l'intérêt d'une HashMap.

---

# ⚠️ Les erreurs fréquentes

## Erreur n°1

Confondre la clé et la valeur.

Ici :

```text
clé = prénom

valeur = salaire
```

---

## Erreur n°2

Penser que plusieurs clés identiques sont possibles.

C'est faux.

Une HashMap remplace la valeur existante.

---

## Erreur n°3

Lire :

```java
HashMap<String, Double>
```

sans savoir ce que représentent les types.

Habitue-toi à traduire immédiatement :

```text
String → Double

↓

Prénom → Salaire
```

---

# 💡 Astuce de développeur

Lorsque tu découvres une nouvelle HashMap, oublie les types Java pendant quelques secondes.

Pose-toi simplement cette question :

> **Qu'est-ce qui sert de clé ?**

Puis :

> **Qu'est-ce qui est associé à cette clé ?**

Tu comprendras la structure presque instantanément.

---

# 📚 Ce que cette classe apporte au TP

Cette classe introduit les bases indispensables :

✔ création d'une HashMap

✔ ajout avec `put()`

✔ comptage avec `size()`

Toutes les autres classes du TP réutiliseront ces notions.

Cette classe constitue donc la fondation de tout le chapitre consacré aux `Map`.

---

# ✅ À retenir

✔ Une HashMap fonctionne avec une clé et une valeur.

✔ Une clé est unique.

✔ `put()` ajoute une association.

✔ `size()` retourne le nombre d'associations.

✔ Une HashMap permet de retrouver rapidement une valeur grâce à sa clé.

---

## 📝 Mini défi

Sans regarder le code, réponds aux questions suivantes.

1. Que représente la clé dans cette HashMap ?

2. Que représente la valeur ?

3. Que se passe-t-il si tu ajoutes deux fois `"Paul"` ?

4. Que retourne `size()` après les cinq ajouts ?

Si tu sais répondre à ces quatre questions, alors tu maîtrises les bases d'une `HashMap`.



1. [x] # Class MapVilles

## Objectif

Apprendre à utiliser une HashMap.

Une HashMap fonctionne avec un couple :

clé -> valeur

Dans ce TP :

"Nice" -> Objet Ville

La clé permet de retrouver rapidement l'objet.

---

## Pourquoi utiliser une HashMap ?

Parce que je veux retrouver une ville grâce à son nom.

Si je possède seulement une liste, je dois parcourir toute la liste.

Avec une HashMap, je récupère directement la valeur avec :

map.get("Nice")

---

## Comment trouver la ville la moins peuplée ?

### Étape 1

Je crée une variable qui représentera le minimum.

Au départ je ne connais pas ce minimum.

Je lui donne donc la plus grande valeur possible :

Integer.MAX_VALUE

Ainsi, la première ville rencontrée sera forcément plus petite.

---

## Pourquoi utiliser keySet() ?

keySet() retourne toutes les clés.

Comme je possède les clés, je peux récupérer les objets avec :

map.get(cle)

Schéma :

clé
↓
get(cle)
↓
objet Ville

---

## À retenir

Quand je cherche un minimum :

je commence par Integer.MAX_VALUE

Quand je cherche un maximum :

je commence par Integer.MIN_VALUE

---

## Pièges

❌ oublier de mettre à jour minimum

❌ supprimer pendant que je parcours la HashMap

❌ confondre keySet() et values()

---

## Ce qu'il faut retenir pour le prochain TP

✔ put()

✔ get()

✔ remove()

✔ keySet()

✔ values()

✔ parcours d'une HashMap

✔ recherche d'un minimum

# Classe `FusionMap`

---

## 🎯 Objectif de cette classe

Cette classe montre comment **fusionner plusieurs HashMap** en une seule.

Jusqu'à présent, nous avons appris à :

- créer une HashMap ;
- ajouter des éléments avec `put()`.

Dans cet exercice, nous découvrons une nouvelle méthode :

```java
putAll()
```

Son rôle est de copier tous les éléments d'une Map dans une autre.

---

## 🧠 Avant de commencer

Imaginons deux boîtes contenant des informations.

La première contient des couleurs.

```text
map1

1 → Rouge

2 → Vert

3 → Orange
```

La seconde contient également des couleurs.

```text
map2

4 → Blanc

5 → Bleu

6 → Orange
```

Notre objectif est de créer une troisième Map qui regroupera toutes les informations.

```text
map3

?

?
```

---

## 📖 Création des deux premières HashMap

Le programme commence par créer deux collections distinctes.

```java
HashMap<Integer, String> map1 = new HashMap<>();
HashMap<Integer, String> map2 = new HashMap<>();
```

Le type :

```java
HashMap<Integer, String>
```

se lit toujours de la même manière.

```text
clé (Integer)
        │
        ▼
valeur (String)
```

Dans cet exercice :

```text
Numéro → Couleur
```

Par exemple :

```text
1 → Rouge

2 → Vert

3 → Orange
```

---

## 📖 Pourquoi créer une troisième HashMap ?

Le but n'est pas de modifier `map1` ni `map2`.

Nous voulons conserver leur contenu intact.

Nous créons donc une troisième collection.

```java
HashMap<Integer, String> map3 = new HashMap<>();
```

Au départ, cette Map est vide.

```text
map3

(vide)
```

---

➕ Copier une HashMap avec `putAll()`

La première copie est réalisée avec :

```java
map3.putAll(map1);
```

Cette instruction signifie :

> Copie toutes les associations présentes dans `map1` vers `map3`.

Après cette instruction :

```text
map3

1 → Rouge

2 → Vert

3 → Orange
```

La deuxième copie est ensuite effectuée :

```java
map3.putAll(map2);
```

La Map devient :

```text
map3

1 → Rouge

2 → Vert

3 → Orange

4 → Blanc

5 → Bleu

6 → Orange
```

---

## 🧠 Comment réfléchir ?

Beaucoup de débutants pensent que :

```java
putAll()
```

est une méthode "magique".

En réalité, elle effectue simplement une copie de toutes les associations.

Tu peux imaginer que Java fait ceci :

```text
Pour chaque clé de map1

↓

copier la clé

↓

copier la valeur

↓

les ajouter dans map3
```

Autrement dit :

```text
clé → valeur

↓

clé → valeur
```

répété jusqu'à la fin de la collection.

---

## ⚠️ Que se passe-t-il si une clé existe déjà ?

C'est le point le plus important de cette classe.

Imaginons :

```text
map1

1 → Rouge
```

et

```text
map2

1 → Bleu
```

Puis :

```java
map3.putAll(map1);

map3.putAll(map2);
```

Le résultat sera :

```text
1 → Bleu
```

Pourquoi ?

Parce que la clé **1** existe déjà.

La deuxième copie remplace la première valeur.

💡 À retenir :

Dans une HashMap, une clé est unique.

Si la clé existe déjà, la nouvelle valeur remplace l'ancienne.

---

## 📊 Résultat final

À la fin de l'exercice :

```text
map3

1 → Rouge

2 → Vert

3 → Orange

4 → Blanc

5 → Bleu

6 → Orange
```

Les deux premières Maps n'ont jamais été modifiées.

Seule `map3` contient l'ensemble des données.

---

## 🧠 Comment retenir `putAll()` ?

Lorsque tu vois :

```java
putAll()
```

Ne pense pas :

> "Fusion"

Pense plutôt :

> **Copier tous les couples clé → valeur dans une autre Map.**

Cette image mentale est beaucoup plus fidèle à ce que fait réellement Java.

---

## ⚠️ Les erreurs fréquentes

### Erreur n°1

Croire que `putAll()` déplace les éléments.

C'est faux.

Les données sont copiées.

Les Maps d'origine restent inchangées.

---

### Erreur n°2

Oublier qu'une clé est unique.

Si deux Maps possèdent la même clé, la dernière valeur copiée remplacera la précédente.

---

### Erreur n°3

Penser que `putAll()` crée automatiquement une nouvelle Map.

Non.

Il faut d'abord créer une HashMap vide.

Puis utiliser `putAll()`.

---

## 💡 Astuce de développeur

La méthode `putAll()` est très utilisée lorsqu'on souhaite :

- regrouper plusieurs jeux de données ;
- compléter une Map existante ;
- créer une copie d'une HashMap.

Elle évite d'écrire plusieurs dizaines de lignes de `put()`.

---

## 📚 Ce que cette classe apporte au TP

Cette classe introduit une nouvelle méthode essentielle :

```java
putAll()
```

Elle montre qu'une HashMap peut être enrichie très facilement à partir d'une autre.

Cette notion sera très utile dans de nombreux projets professionnels où les données proviennent de plusieurs sources.

---

## ✅ À retenir

✔ `putAll()` copie tous les éléments d'une Map.

✔ Les Maps d'origine restent inchangées.

✔ Une clé est unique.

✔ Une clé identique remplace l'ancienne valeur.

✔ `putAll()` évite de recopier les éléments un par un.

---

## 📝 Mini défi

Sans regarder le code, réponds aux questions suivantes.

1. Quel est le rôle de `putAll()` ?

2. Pourquoi crée-t-on une troisième HashMap ?

3. Que se passe-t-il si deux Maps possèdent la même clé ?

4. Les Maps d'origine sont-elles modifiées ?

Si tu sais répondre à ces quatre questions, alors tu maîtrises parfaitement le fonctionnement de `putAll()`.

