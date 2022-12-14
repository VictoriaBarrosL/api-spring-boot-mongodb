# Roadmap Java project

Projeto criado utilizando a linguagem Java com o Spring Boot como framework para o desenvolvimento da aplicação, tem como objetivo a familiarização e prática da linguagem baseado em recursos apresentados nos cursos do Roadmap disponibilizado.
O projeto se refere a um sistema que contém posts e esses respectivamente contém autores, o que permite a implementação como objetos agregados em um banco de dados não relacional (NoSQL), além de trazer a compreensão das principais diferenças entre os paradigmas orientado a documentos e relacional.


<img width="516" alt="umldiagram" src="https://user-images.githubusercontent.com/96137264/207614672-4b9aed48-88f1-4781-984c-38df23731be2.png">
 
O projeto adota o método de construção em camadas que funciona da seguinte forma:

Repository > Service > Resource

1.	Repository é a interface que assina o método;
2.	Service é a camada que implementa o método assinada na repository;
3.	Resource é a camada que usa o método implementado pela camada de serviço.

<img width="518" alt="layersimg" src="https://user-images.githubusercontent.com/96137264/207615785-46443138-dab7-48d1-8802-d4b79ea8bcd6.png">
 

No projeto, também foram implementadas as operações básicas de CRUD, onde é possível estudar a lógica além de conhecer e implementar recursos do framework.

<img width="500" alt="crudimg" src="https://user-images.githubusercontent.com/96137264/207615891-10dffbc3-b5fe-46ac-a13f-1618b11e4945.png">


O projeto foi criado utilizando demais frameworks tais como StarUML, MongoDB Compass,  Postman e Git.
