DROP DATABASE ifp;
CREATE DATABASE ifp;

CONNECT ifp;

 INSERT INTO journaliste (journalisteName) VALUES ("Journalist1"),("Journalist2"),("Journalist3");
 INSERT INTO news(titre, contenu, date, fk_journaliste) VALUES ("News1","Content1",'2020-02-06',1),("News2","Content2",'2020-02-05',2),("News3","Content3",'2020-02-04',3),("News4","Content4",'2020-02-03',1),("News5","Content5",'2020-02-02',2),("News6","Content6",'2020-02-01',3);
 INSERT INTO note(noteValue,fk_news,fk_journaliste) VALUES (10,1,1),(15,1,2),(14,2,2),(17,2,3),(6,3,1),(10,3,3),(11,4,1),(13,4,2),(17,5,2),(12,5,3),(11,6,1),(10,6,3);
