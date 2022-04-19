--Roles

INSERT INTO roles (id, authority) VALUES (1, 'ADMIN');
INSERT INTO roles (id, authority) VALUES (2, 'SELLER');
INSERT INTO roles (id, authority) VALUES (3, 'BUYER');


--Users and Roles

--User 1
INSERT INTO users (id, created_at, email, enabled, first_name, is_approved_seller, last_name, modified_at, password, username)
VALUES (1, '2022-04-12', 'fri@miu.com', TRUE, 'Fridom', FALSE, 'Araya', '2022-04-12', '123', 'frid');

INSERT INTO USER_ROLES(user_id, role_id) VALUES (1, 2);


--User 2
INSERT INTO users (id, created_at, email, enabled, first_name, is_approved_seller, last_name, modified_at, password, username)
VALUES (2, '2022-04-13', 'erm@miu.com', TRUE, 'Ermias', FALSE, 'Ghebrez', '2022-04-13', '123', 'ermiji');

INSERT INTO USER_ROLES(user_id, role_id) VALUES (2, 2);


--User 3
INSERT INTO users (id, created_at, email, enabled, first_name, is_approved_seller, last_name, modified_at, password, username)
VALUES (3, '2022-04-14', 'star@miu.com', TRUE, 'Star', FALSE, 'Tsegay', '2022-04-14', '123', 'star');

INSERT INTO USER_ROLES(user_id, role_id) VALUES (3, 3);


--User 4

INSERT INTO users (id, created_at, email, enabled, first_name, is_approved_seller, last_name, modified_at, password, username)
VALUES (4, '2022-04-15', 'essei@miu.com', TRUE, 'Esei', FALSE, 'Kahsay', '2022-04-15', '123', 'essei');

INSERT INTO USER_ROLES(user_id, role_id) VALUES (4, 3);


--User 5
INSERT INTO users (id, created_at, email, enabled, first_name, is_approved_seller, last_name, modified_at, password, username)
VALUES (5, '2022-04-16', 'seyfe@miu.com', TRUE, 'Seyfe', FALSE, 'Gebriel', '2022-04-16', '123', 'seyfe');

INSERT INTO USER_ROLES(user_id, role_id) VALUES (5, 3);

--User 6
INSERT INTO users (id, created_at, email, enabled, first_name, is_approved_seller, last_name, modified_at, password, username)
VALUES (6, '2022-04-17', 'admin@miu.com', TRUE, 'Admin', FALSE, 'Administrator', '2022-04-17', '123', 'admin');

INSERT INTO USER_ROLES(user_id, role_id) VALUES (6, 1);


--FOLLOWS
INSERT INTO follows (id, followee_id, follower_id) VALUES (1, 1, 3);

INSERT INTO follows (id, followee_id, follower_id) VALUES (2, 2, 3);

INSERT INTO follows (id, followee_id, follower_id) VALUES (3, 1, 4);

INSERT INTO follows (id, followee_id, follower_id) VALUES (4, 2, 4);

INSERT INTO follows (id, followee_id, follower_id) VALUES (5, 1, 5);

INSERT INTO follows (id, followee_id, follower_id) VALUES (6, 2, 5);


