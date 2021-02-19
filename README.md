# Systèmes de recherches et de recommandations de médecin  
une plateforme qui permet de rechercher un medcin par ville ou une specialité specifique  
il permet ausssi de recommender un medcin a parir des douleurs  
  
## Technologies utilisés  
* Springboot : pour la partie serveur  
* MongoDB : pour la base de donnes
* Reast js : pour la partie web client  
  

## Outils utillisés :  
Eclipse, Visual Studio Code, Live Share  
  
## Installation :  
* serveur :  fichier de configuration pom.xml   
* client web : on utilise la commande : `npm install`  
  
## Utilisation :  
  
l application contient 3 acteurs : client (personne), medcin , admin
### cas d un client :  
  
un client peux rechercher un medcin par ville et ou pecialité ou par des douleurs.  
  
#### recherche par ville  
  
![recherche par ville](/Images/client/recherche%20par%20ville.bmp)  
  
#### recherche par specialité  
  
![recherche par ville](/Images/client/recherche%20par%20spécialité.bmp)   
  
###" recherche par les douleurs  
  
![recherche par ville](/Images/client/recherche%20par%20douleurs.bmp)  
  
#### voir la localisation du clinique dans le profil d un pedcin  
  
![recherche par ville](/Images/client/Profil%20medecin.bmp)  
  
### cas d un medcin :  
un medcin peu  inscrire son organisation (clinique), se connecter et modifier son profile  
  
#### demande dinscription d un clinique  
  
![recherche par ville](/Images/medecin/inscription%20clinique.bmp)  
  
#### se connecter :  
  
![recherche par ville](/Images/medecin/login%20medecin.bmp)  
  
#### modifier son profile 
  
![recherche par ville](/Images/medecin/modification%20profil%20medecin.bmp)  
  
![recherche par ville](/Images/medecin/modification%20Clinique.bmp)  
  
![recherche par ville](/Images/medecin/modification%20Adress.bmp)  
  
![recherche par ville](/Images/medecin/modification%20WebSite.bmp)  
  
### cas d un admin  
un admin peu se connecter , ajouter supprimer des admins, supprimer un medcin, accepter ou refuser les demmandes dinscription, modifier son profil  
  
#### se connecter :  

![recherche par ville](/Images/admin/login%20admin.bmp)  
  
#### ajouter supprimer admin  
  
![recherche par ville](/Images/admin/liste%20create%20admin.bmp)  
  
#### liste des medcin et suppression d un medcin 
  
![recherche par ville](/Images/admin/Liste%20medecin%20suppression.bmp)   
  
#### liste des demandes, accepter ou regeter   
  
![recherche par ville](/Images/admin/iste%20demande%20accepter%20rejeter.bmp)  
  
#### modifier so profile
  
![recherche par ville](/Images/admin/modification%20profil%20admin.bmp)  
