# interact.io_exercice

## You can compile and run server by :
  * mvn clean package
  * java -jar target/DropWizardExample-0.0.1-SNAPSHOT.jar server

### Once you have run the server, you can look at all movies at :
  * http://localhost:8080/movies/ 
### One specific movie by id :
  * http://localhost:8080/movies/{id}
### Movie by release year:
  * http://localhost:8080/movies/year/{year}
### You can create movie by sending json throw POST method:
  * http://localhost:8080/movies/
### You can update movie by sending json throw PUT method:
  * http://localhost:8080/movies/{id}
### You can delete movie by sending json throw DELETE method:
  * http://localhost:8080/movies/{id}






