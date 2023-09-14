CREATE TABLE customer (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          first_name VARCHAR(255),
                          last_name VARCHAR(255),
                          phone_number VARCHAR(255),
                          customer_address VARCHAR(255),
                          national_code VARCHAR(255)
);

CREATE TABLE card (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      card_number VARCHAR(255),
                      card_type VARCHAR(255),
                      issuer_code VARCHAR(255),
                      bank_name VARCHAR(255),
                      expiration_date DATE,
                      is_active BOOLEAN,
                      customer_id INT,
                      FOREIGN KEY (customer_id) REFERENCES customer(id),
                      UNIQUE (customer_id, card_type)
);



INSERT INTO customer (first_name, last_name, phone_number, customer_address, national_code)
VALUES ('Mahdi', 'Salmanizadehgan', '09104328635', 'Pirozi Street', '0371440955');

INSERT INTO customer (first_name, last_name, phone_number, customer_address, national_code)
VALUES ('Reza', 'Hosseini', '09126399110', 'Nirohavae Street', '0036451185');

INSERT INTO card (card_number, card_type, issuer_code, bank_name, expiration_date, is_active, customer_id)
VALUES ('5022-2910-9772-8008', 'Credit', '302303', 'Bank Pasargad', '2025-12-31', true, 1);

INSERT INTO card (card_number, card_type, issuer_code, bank_name, expiration_date, is_active, customer_id)
VALUES ('6037-9973-3456-7890', 'Debit', '320551', 'Bank Meli', '2026-12-31', false, 1);


INSERT INTO card (card_number, card_type, issuer_code, bank_name, expiration_date, is_active, customer_id)
VALUES ('5022-2910-9772-4520', 'Credit', '302303', 'Bank Pasargad', '2025-12-31', true, 2);

INSERT INTO card (card_number, card_type, issuer_code, bank_name, expiration_date, is_active, customer_id)
VALUES ('6037-9973-3456-2284', 'Debit', '320551', 'Bank Meli', '2026-12-31', false, 2);

