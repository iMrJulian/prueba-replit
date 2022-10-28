# Apropiación

### Clonado

![image](https://user-images.githubusercontent.com/36264252/197901328-08b6e16d-8aa7-4ba2-bd1b-f004225e7fb3.png)

### Correr servidor

![image](https://user-images.githubusercontent.com/36264252/198295521-d3587895-e9eb-4f0b-82b9-3a24f489a025.png)

### Probar su funcionamiento

Get /
![image](https://user-images.githubusercontent.com/36264252/198417149-4dd802c8-570a-4abc-a82e-4d351add595c.png)

Post /upload/{id}
![image](https://user-images.githubusercontent.com/36264252/198299704-3d5b0b19-3fdf-45fc-8d17-a3e95153db38.png)

Get /upload/{id}
![image](https://user-images.githubusercontent.com/36264252/198302111-045e9c56-5fb5-45ae-927d-5fd2b4404412.png)

Get pruebasapi.intranetoas.udistrital.edu.co:8094/v1/tipo_documento/{id}
![image](https://user-images.githubusercontent.com/36264252/198417343-a7960e87-cac9-46a4-b5bf-3f8df0bc989e.png)

Insertar metadatos en un documento a partir de la obtención de el desde nuxeo, para luego insertarlo como propiedades del mismo en base64 a partir de un encoded, tomandolo como un diccionario donde tiene llave valor.
![image](https://user-images.githubusercontent.com/36264252/198588803-7a3a916a-9165-48aa-964c-da5a504f860d.png)

El gestor_documental_mid ya esta haciendo un proceso de firma electronica, generandola con la libreria Cryptography a partir de la generación de una llave privada y donde el metodo .sign de esta llave privada, crea la firma electronica sin necesidad de obtener el hash primero.
![image](https://user-images.githubusercontent.com/36264252/198616727-38844e7b-4a01-47ae-8c82-e78282363178.png)

Adicionalmente se encontro que el gestor documental no esta estampando la firma, si no que la pasa como metadata del documento.
![image](https://user-images.githubusercontent.com/36264252/198617573-c1d8bcad-ce65-4415-a5b2-6d20a1a36d99.png)
