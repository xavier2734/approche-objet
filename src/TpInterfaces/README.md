# 📚 TP Interfaces — Contrats de Code et Polymorphisme en Java

Ce dossier regroupe des exercices pratiques dédiés à la compréhension, à la mise en œuvre et à l'utilisation des interfaces en programmation orientée objet avec Java.

---

## 🎯 Concepts clés à retenir pour les révisions

Une interface établit un contrat strict que les classes choisissent de remplir. Elle permet d'unifier le comportement d'objets différents.

### 💡 L'analogie de la Prise Électrique (Pour comprendre le concept)
* **[PRO]** : Une interface définit un ensemble de signatures de méthodes abstraites (sans corps de code) servant de type de référence commun pour découpler les implémentations concrètes du code client.
* **[PERSO]** : Une interface est une **prise électrique murale standard**. La prise définit des règles obligatoires (la forme des trous, le voltage). Peu importe que vous y branchiez un aspirateur, une lampe ou un chargeur de téléphone (les classes concrètes), tant que l'appareil possède la bonne fiche (implémente l'interface), il recevra du courant et fonctionnera.

### 🔧 Les mots-clés et mécanismes fondamentaux
* `interface` : Déclare une structure abstraite qui liste des méthodes obligatoires, sans écrire leur code.
    * 💡 *Analogie : C'est le plan de construction de la prise de courant.*
* `implements` : Indique qu'une classe s'engage à écrire et à concrétiser toutes les méthodes listées par l'interface.
    * 💡 *Analogie : C'est le fabricant du sèche-cheveux qui s'engage à adapter sa prise au standard mural.*
* **Le Polymorphisme** : Capacité de manipuler des objets de types réels différents à travers un type d'interface unique et commun.
    * 💡 *Analogie : C'est votre multiprise. Elle ne sait pas quel appareil est branché, mais elle sait qu'elle peut envoyer de l'électricité à chacun d'eux de la même manière.*

---

## 📁 Liste des fichiers traités

Le dossier contient **4 fichiers** répartis de la manière suivante :

### ⚙️ Le Contrat de base

#### 1. `ObjetGeometrique.java`
* **Objectif :** Définition de l'interface pivot listant les signatures de calculs géométriques obligatoires pour toutes les formes.
* **Notions étudiées :** Déclaration de méthodes abstraites sans corps (`perimetre()` et `surface()`) retournant un type primitif `double`.
* 💡 *Compréhension : C'est le cahier des charges officiel. Il dit : "Toute forme géométrique dans ce projet DOIT savoir calculer son périmètre et sa surface, peu importe sa forme mathématique".*

### 🚀 Classes d'implémentation (Les formes concrètes)

#### 2. `Cercle.java`
* **Objectif :** Implémentation concrète des calculs géométriques spécifiques au cercle.
* **Notions étudiées :** Utilisation du mot-clé `implements`, application de la constante `Math.PI` pour le périmètre et la surface, et encapsulation de la propriété `rayon`.
* 💡 *Compréhension : Le Cercle signe le contrat. Il écrit sa propre formule mathématique ($2 \times \pi \times r$) pour répondre à l'obligation du périmètre.*

#### 3. `Rectangle.java`
* **Objectif :** Implémentation concrète des calculs géométriques spécifiques au rectangle.
* **Notions étudiées :** Redéfinition des méthodes de l'interface avec les formules de géométrie plane basées sur les attributs encapsulés `longueur` et `largeur`.
* 💡 *Compréhension : Le Rectangle signe le même contrat, mais fournit sa propre formule interne ($2 \times (L + l)$) pour calculer son périmètre.*

### 🖥️ Classe d'Exécution / Test

#### 4. `TestObjetGeometrique.java`
* **Objectif :** Création d'un tableau de 2 objets géométriques et parcours du tableau pour valider le comportement dynamique de l'application.
* **Notions étudiées :** Instanciation d'un tableau polymorphe `ObjetGeometrique[]` capable de stocker des instances de types hétérogènes (`Cercle` et `Rectangle`), et itération transparente sans transtypage (casting).
* 💡 *Compréhension : On crée une boîte de rangement étiquetée "ObjetGeometrique". On y dépose un Cercle et un Rectangle. Quand on fait défiler les objets de la boîte, Java appelle automatiquement la bonne formule mathématique en fonction du type réel de l'objet sur lequel on clique.*

---

## ⚠️ Les pièges fréquents à éviter aux examens
1. **Oublier une méthode de l'interface** : Si une classe utilise le mot-clé `implements`, elle doit obligatoirement écrire le code de **TOUTES** les méthodes de l'interface, sous peine de provoquer une erreur de compilation immédiate (sauf si la classe est déclarée comme `abstract`).
    * 💡 *Analogie : Si le fabricant d'aspirateur oublie de mettre les tiges métalliques sur sa prise, l'appareil ne se branchera jamais.*
2. **Tenter d'instancier l'interface** : Écrire `ObjetGeometrique obj = new ObjetGeometrique();` est strictement interdit et impossible en Java car une interface n'a pas de constructeur et son code n'est pas écrit.
    * 💡 *Analogie : Vous ne pouvez pas acheter "une idée de prise de courant". Vous devez acheter un appareil réel (un Cercle ou un Rectangle).*
3. **Le faux polymorphisme** : Lorsque vous manipulez un objet via le type de son interface (ex: `ObjetGeometrique obj = new Cercle(10);`), vous avez uniquement accès aux méthodes listées dans l'interface (`perimetre()` et `surface()`). Vous ne pouvez pas appeler la méthode `getRayon()` sans faire un transtypage (un cast), car l'interface globale ne connaît pas l'existence des rayons.
