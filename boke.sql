CREATE TABLE user (
  id_u int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(50) NOT NULL,
  password varchar(50) NOT NULL
);

CREATE TABLE label (
  id_l int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  tagname varchar(50) NOT NULL
);

CREATE TABLE blogs (
  id_b int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  id_u int,
  headline varchar(50) NOT NULL,
  content varchar(50) NOT NULL,
  dateline date,
  FOREIGN KEY (id_u) REFERENCES user(Id_u)
);

CREATE TABLE middle (
  id_m int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  id_l int,
  id_b int,
  FOREIGN KEY (Id_l) REFERENCES label(Id_l),
  FOREIGN KEY (Id_b) REFERENCES blogs(Id_b)
);