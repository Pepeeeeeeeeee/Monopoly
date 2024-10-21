-- Drop existing tables
drop table if exists properties cascade;
drop table if exists users cascade;

-- Create tables
CREATE TABLE Properties (
    propertyId SERIAL PRIMARY KEY,
    PropertyName varchar(255) NOT NULL,
	PropertyValue int NOT NULL,
	SetId int NOT NULL,
	DefaultRent int NOT NULL,
	SetRent int NOT NULL,
	RentOneHouse int NOT NULL,
	RentTwoHouses int NOT NULL,
	RentThreeHouses int NOT NULL,
	RentFourHouses int NOT NULL,
	RentHotel int NOT NULL,
	HouseCost int NOT NULL,
	HotelCost int NOT NULL,
	MortgageValue int NOT NULL
);

CREATE TABLE Users (
    uId SERIAL PRIMARY KEY,
	uName varchar(255) NOT NULL,
	uPassword varchar(255) NOT NULL
	);
