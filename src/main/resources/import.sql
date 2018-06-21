-- Password are hashed using a BCrypt hash with a cost of 10
-- password = 'password' BCrypt 10 hashed
insert into user(id,username,email, authorities) values(1,'mbecca','beccariamatias@gmail.com', 'ROLE_USER');
