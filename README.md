# Application de comptage de symptômes

[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)  [![forthebadge](http://forthebadge.com/images/badges/powered-by-electricity.svg)](http://forthebadge.com)

L'objectif du projet est de récupérer les symptômes contenus dans un fichier texte, de les compter, de les trier et enfin de générer un fichier avec chaque symptômes et son nombre d'itérations.

## Pour commencer

- Il faut disposer d'un fichier texte contenant les symptômes.
    
    Avec pour nom : "symptoms.txt"
    
    Dans le cas échéant, changer la variable **String `pathIn`** avec le nom que vous désirez.
    
- Un symptôme par ligne.

    EXEMPLE de fichier texte :
 
    
    headache  
    insomnia  
    ...  
    
- Le programme va générer un fichier de type ".csv" pour traiter les informations sur un tableur.
    
    Avec pour nom : "results.csv"
    
    Dans le cas échéant, changer la variable **String `pathOut`** avec le nom que vous désirez.
    
    EXEMPLE de résultat :
    
    
    headache,5  
    high blood pressure,6  
    insomnia,2  
    ...  

### Pré-requis

Ce projet nécessite,
- avoir des notions en language Java.
- de pouvoir lire un fichier contenant les symptômes dans la disposition citée précédement.
- d'avoir un environnement de développement intégré (IDE) pour pouvoir lancer le programme correctement.
- d'avoir Java JDK 13.


### Installation

Pour un installer ce projet,
il suffit de le téléchargé, d'ouvrir le dossier dans votre IDE favori et de configurer le JRE vers Java 13.

## Démarrage

Une fois le programme configurer, il suffit d'avoir le fichier texte avec les symptômes dans les dossier.

Avec le nom `symptoms.txt`, à moins que vous modifier le String `pathIn`.

## Contenu

Le package `com.hemebiotech.analytics` est composé de quatres packages,
- `instruction` (contenant les fichiers initiaux, le travail d'alex, le début des interfaces).
- `reader` (contenant une interface `Reader` implémenté à une classe `SymptomsFileReader`)
    
    * Récupère en paramètre le chemin du fichier texte `pathIn`
    * Renvoie une `List<String>` contenant les symptômes.
- `processor` (contenant une interface `Processor` implémenté à une classe `SymptomsProcessor`)

    * Récupère en paramètre un collection, ici la `List<String>` de `reader`
    * Renvoir une `Map<String, Long>` contenant les symtômes en `clé` et leur nombres en `valeur`
- `writer` (contenant une interface `Writer` implémenté à une classe `SymptomsFileWriter`)

    * Récupère en paramètre la `Map<String, Long>` généré par `processor`, aussi que le chemin de sorti `pathOut`
    * Renvoie simplement l'information console que le fichier à été généré ou non.

## Fabriqué avec

* [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/) - IDE de travail
* [Java JDK 13](https://www.oracle.com/java/technologies/javase-jdk13-downloads.html )

## Auteurs

* **Orion Beauny** _alias_ [@OrionBS](https://github.com/OrionBS)



