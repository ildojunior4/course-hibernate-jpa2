CREATE TABLE client (
	code INTEGER NOT NULL AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	age INTEGER,
	sex VARCHAR(1) NOT NULL,
	job VARCHAR(30),
	PRIMARY KEY(code)
);

INSERT INTO client values(null,"ILDO ZACARIAS",21,"M","Manager of IT");

CREATE TABLE current_account(
	code INTEGER NOT NULL AUTO_INCREMENT,
	number INTEGER NOT NULL,
	balance DECIMAL,
	code_client INTEGER NOT NULL,
	PRIMARY KEY(code),
    FOREIGN KEY (code_client) REFERENCES client (code)
);

INSERT INTO current_account values(null,775544,25000.00,1);

select cli.name
	, ca.balance
from client cli
	, current_account ca
where cli.code = ca.code_client;