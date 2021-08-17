<h1>I - Création d'un azure container registry ACR </h2>
<h2>1 - Création d'un ressource groupe</h2>
    nas@Azure:~$ az group create --name aitechContainerRegistryRg --location eastus<br/><br/>
<h2>2 - Création d'un azure container registry</h2>
    nas@Azure:~$ az acr create --resource-group aitechContainerRegistryRg --name aitechContainerRegistry --sku Basic<br/><br/>
<h2>3 - Lier le compte devops au compte azure</h2>
    URL : https://dev.azure.com/<br/><br/>
    a - {Organisation} -> {ProjetName} -> Settings -> Service connections -> New service connection -> Azure Resource Manager -> Service principal (automatic) -> New Azure service         connection<br/>
    b- Suivre les étapes d'authenfication (Compte azure) après l'ouverture de la pop up <br/>
    c- Rensigner le champs : Service connection name (ex : aitechdevops)<br/>
    d- Cliquer sur save<br/><br/>
 <h2>4- Lier le compte devops à azure container registry</h2>
    URL : https://dev.azure.com/<br/><br/>
    a - {Organisation} -> {ProjetName} -> Settings -> Service connections -> New service connection -> Docker Registry -> Azure Container Registry<br/>
    b- Suivre les étapes d'authenfication (Compte azure) après l'ouverture de la pop up<br/> 
    c - Renseigner le champ Azure container registry c'est à dire le ACR créé à l'étape 2 ( ex : aitechContainerRegistryRg)<br/> 
    d - Renseigner le champ Service connection name ( ex : aitechContainerRegistry)<br/>
    f - Cliquer sur save.<br/><br/>
    
  ![Azure_container_registry](https://user-images.githubusercontent.com/5339905/129707635-0687875a-b864-4427-a7ac-3c4f087ee8ad.jpg)<br/>
  
  <h1>II - Spring projet avec la configuration d'une simple pipline</h1>
  - Le projet est un simple projet spring boot avec une methode exposée en tant que web service REST.<br/>
  <h2>1 - azure-pipelines.yml</h2>
  
  ![Azure_container_registry](https://user-images.githubusercontent.com/5339905/129710018-1e2b36ab-70c7-46c6-896d-c5af3dda40a3.jpg)

  <h2>2 - Dockerfile</h2> 
  
  ![Azure_container_registry](https://user-images.githubusercontent.com/5339905/129710267-f6380686-1c72-4ede-92a0-5efec13aea5c.jpg)


   <h2>3 - Dans azure container registry</h2>
   
  ![Azure_container_registry](https://user-images.githubusercontent.com/5339905/129710709-54be6a49-5102-45b7-9bea-caa64522520d.jpg)

    
