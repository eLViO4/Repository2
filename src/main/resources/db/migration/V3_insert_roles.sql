INSERT INTO roles (role_name)
SELECT 'ROLE_ADMIN'
WHERE NOT EXISTS (SELECT 1 FROM roles WHERE role_name = 'ROLE_ADMIN');
INSERT INTO roles (role_name)
SELECT 'ROLE_MANAGER'
WHERE NOT EXISTS (SELECT 1 FROM roles WHERE role_name = 'ROLE_MANAGER');
INSERT INTO roles (role_name)
SELECT 'ROLE_EDITOR'
WHERE NOT EXISTS (SELECT 1 FROM roles WHERE role_name = 'ROLE_EDITOR');
INSERT INTO roles (role_name)
SELECT 'ROLE_USER'
WHERE NOT EXISTS (SELECT 1 FROM roles WHERE role_name = 'ROLE_USER');

INSERT INTO roles (role_name)
SELECT 'ROLE_GUEST'
WHERE NOT EXISTS (SELECT 1 FROM roles WHERE role_name = 'ROLE_GUEST');