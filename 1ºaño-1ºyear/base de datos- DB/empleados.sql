CREATE TABLE empleados (
cod_empleado TINYINT UNSIGNED,
nombre VARCHAR(30) NOT NULL,
apellidos VARCHAR (40) NOT NULL,
dni CHAR(9) UNIQUE NOT NULL,
mail VARCHAR(70)
telefono VARCHAR(15) NOT NULL,
sueldo FLOAT(7,2) UNSIGNED NOT NULL,
departamento VARCHAR(20) NOT NULL,
fec_nac DATE NOT NULL,
fec_alta DATE NOT NULL,
direccion VARCHAR(100) NOT NULL,
cod_postal CHAR(5) NOT NULL,
ciudad VARCHAR(30) NOT NULL,
observaciones VARCHAR(150),
PRIMARY KEY(cod_empleado)
) ENGINE = InnoDB;

61-70

INSERT INTO empleados (cod_empleado, nombre,apellidos,dni,mail,telefono,sueldo,departamento,fec_nac,fec_alta,direccion,cod_postal,ciudad,observaciones)
  VALUES (61,'carlos','Fideo diaz','11122233A','cf2002@gmail.com','696112233',11000,'recursos humanos','2002-08-04','2021-08-01','Calle manolo el loco','28001','Madrid',''),
  (62,'Alonso','Litario escrito','11122244A','al2002@gmail.com','696112244',11000,'recursos humanos','2002-06-08','2021-05-01','Calle rio tajo','28001','Madrid',''),
  (63,'Asier','Justo turuelo','11122255A','aj2001@gmail.com','696112255',11000,'recursos humanos','2001-12-27','2021-05-31','Calle rio ebro','28001','Madrid',''),
  (64,'Mariano','Rajoy lobo','11122266A','mr1989@gmail.com','696112266',21000,'contabilidad','1989-12-11','2020-01-01','Avenida de la ida','24001','Zaragoza',''),
  (65,'Pedro','Sancho aquiles','11122277A','ps1992@gmail.com','696112277',20000,'contabilidad','1992-04-028','2020-02-01','Calle hablando','24001','Zaragoza',''),
  (66,'Irene','Diaz ayuso','11122288A','id1995@gmail.com','696112288',22000,'contabilidad','1995-02-24','2020-12-21','Calle congreso','23001','Barcelona',''),
  (67,'Ariana','Grande pequeño','11122299A','ag2000@gmail.com','696112299',14000,'logistica','2000-06-13','2021-03-01','Calle bajo la sombra','28001','Madrid',''),
  (68,'Hanna','Montana gómez','11133311A','hm2001@gmail.com','696113311',12500,'logistica','2000-07-13','2021-03-01','Calle diamante','28001','Madrid',''),
  (69,'Pablo','Iglesias religiosas','11133322A','pi1981@gmail.com','696113322',8500,'limpieza','1981-09-24','2020-12-14','Calle no moncloa','28001','Madrid','tiene mal perder'),
  (70,'Benito','Tormenta oscura','11133333A','bt2002@gmail.com','69613333',9000,'limpieza','2002-02-08','2021-01-01','Avenida de los reyes','28001','Madrid','');