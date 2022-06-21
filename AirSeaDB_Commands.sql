create table PASSENGER (
ID_num int primary key GENERATED ALWAYS AS IDENTITY,
UserName varchar(40),
Password varchar(40),
FName varchar(40),
LName varchar(40),
Email varchar(70),
Phone_num int ,
Gender char(1),
CONSTRAINT Passenger_gender check (Gender IN ('F','M'))
);
create table AIRLINE (
Name varchar(40),
Code varchar(40) primary key);
create table ADMIN (
Admin_ID int primary key GENERATED ALWAYS AS IDENTITY,
UserName varchar(40),
Password varchar(40),
FName varchar(40),
LName varchar(40),
AirLine_Code varchar(40),
foreign key(AirLine_Code) references AIRLINE (Code) 
);
create table AIRPLANE (
Reg_No int primary key  GENERATED ALWAYS AS IDENTITY,
Type varchar(40),
First_Seats int,
Economy_Seats int,
AirLine_Code varchar(40),
foreign key(AirLine_Code) references AirLine (Code) 
);

create table FLIGHT (
Flight_No int primary key GENERATED ALWAYS AS IDENTITY,
Flight_Price double,
Dep_Date Date,
Dep_Time Time,
Arr_Date Date,
Arr_Time Time,
Departure_City varchar(40),
Arrival_City varchar(40),
AirPlane_RegNo int,
Class varchar(40) CONSTRAINT Class_check CHECK (Class IN ('First',
'Economy')),

foreign key(AirPlane_RegNo) references AIRPLANE (Reg_No) 
);
create table TICKET (
Ticket_No int primary key GENERATED ALWAYS AS IDENTITY,
Filght_No int ,
Passenger_ID int ,
No_Of_Tickets int,
foreign key(Filght_No) references FLIGHT (Flight_No) ,
foreign key(Passenger_ID) references PASSENGER (ID_num) 
);
create table BILL (
Bill varchar(100) primary key ,
Ticket_No int  not null references TICKET (Ticket_No) on delete cascade
);
INSERT INTO PASSENGER (USERNAME, PASSWORD, FNAME, LNAME, EMAIL, PHONE_NUM, GENDER) 
	VALUES ('Sara10', 'Sara1234', 'Sara', 'Aldossary', 'saldoss@gmail.com', 552938112, 'F');
INSERT INTO PASSENGER
 (UserName, Password, FName, LName, Email, Phone_num, Gender) VALUES
 ('Rana20', 'Rana0000', 'Rana', 'AlThani', 'ranaalth@gmail.com', 0505121299, 'F');
INSERT INTO AIRLINE (Name,Code) VALUES ('AirSea','22DC40');

INSERT INTO ADMIN (UserName, Password, FName, LName, AirLine_Code) VALUES ('Sadeem2000', 'Sadeem1225', 'Sadeem', 'Alshaia', '22DC40');
INSERT INTO AIRPLANE (Type, First_Seats, Economy_Seats,AirLine_Code) VALUES ('Airbus A220', 50, 150,'22DC40');

INSERT INTO FLIGHT (Flight_Price, Dep_Date, Dep_Time, Arr_Date, Arr_Time, Departure_City, Arrival_City, AirPlane_RegNo,Class) VALUES 
(550.5, '2021-04-22', '14:00:00', '2021-04-22', '15:00:00', 'Dammam', 'Riyadh', 1,'First'),
(300, '2021-04-24', '17:00:00', '2021-04-24', '19:00:00', 'Riyadh', 'Jeddah', 1,'First'),

(270, '2021-04-25', '12:00:00', '2021-04-25', '12:00:00', 'Jeddah', 'Riyadh', 1,'Economy');


INSERT INTO TICKET (Filght_No,Passenger_ID, No_Of_Tickets) VALUES
(1, 1, 2),(2, 2, 4);
INSERT INTO BILL (Bill, Ticket_No) VALUES 
('(Sara Aldossary,2021-04-20,1101,Visa)', 1),
('(Rana AlThani,2021-04-20,1200,Mada)', 2);
