insert into CLIENTS (id, name) values (1,'Bill Gates');
insert into CLIENTS (id, name) values (2,'Paul Tim');
insert into CLIENTS (id, name) values (3,'Jacky Niels');
insert into CLIENTS (id, name) values (4,'Romeo Stun');
insert into CLIENTS (id, name) values (5,'Eva Manniak');
insert into CLIENTS (id, name) values (6,'Meddy Teranne');
insert into CLIENTS (id, name) values (7,'Olivia Patate');
insert into CLIENTS (id, name) values (8,'Harry Zoulou');
insert into CLIENTS (id, name) values (9,'Lambda Name');
insert into CLIENTS (id, name) values (10,'Jhon Doe');
insert into CONCESSIONNAIRES (id, name) values (1,'Nissan');
insert into CONCESSIONNAIRES (id, name) values (2,'Toyota');
insert into CONCESSIONNAIRES (id, name) values (3,'Ford');
insert into CONCESSIONNAIRES (id, name) values (4,'Renault');
insert into CONCESSIONNAIRES (id, name) values (5,'Ferrari');
insert into MARQUES (id, name) values (1,'Ford');
insert into MARQUES (id, name) values (2,'Honda');
insert into MARQUES (id, name) values (3,'Toyota');
insert into MARQUES (id, name) values (4,'Ferrari');
insert into MARQUES (id, name) values (5,'Peugeot');
insert into ADRESSES (id, name, concessionnaires_id) values (1,'5 rue du molinel',1);
insert into ADRESSES (id, name, concessionnaires_id) values (2,'18 rue Jean Jaures',1);
insert into ADRESSES (id, name, concessionnaires_id) values (3,'6 boulevard Vauban',2);
insert into ADRESSES (id, name, concessionnaires_id) values (4,'123 boulevard Victor Hugo',2);
insert into ADRESSES (id, name, concessionnaires_id) values (5,'5 impasse de la vie',1);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (1, 'Mustang', 1,1);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (2, 'Ka', 1,3);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (3, 'Civic', 2,2);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (4, 'Jazz', 2,4);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (5, 'Yaris', 3,3);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (6, 'Supra', 3,5);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (7, 'Enzo', 4,1);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (8, 'Spider', 4,2);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (9, '206', 5,3);
insert into VOITURES (id, name, MARQUES_id, CLIENTS_id) values (10, '308', 5,4);




