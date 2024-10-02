INSERT INTO user_roles (user_id, role_id)
SELECT u.id, r.id
FROM users u, roles r
WHERE u.username = 'admin' AND r.role_name = 'ROLE_ADMIN';

-- Assign 'ROLE_MANAGER' to managers
INSERT INTO user_roles (user_id, role_id)
SELECT u.id, r.id
FROM users u, roles r
WHERE u.username IN ('manager1', 'manager2', 'manager3') AND r.role_name = 'ROLE_MANAGER';

-- Assign 'ROLE_EDITOR' to editors
INSERT INTO user_roles (user_id, role_id)
SELECT u.id, r.id
FROM users u, roles r
WHERE u.username IN ('editor1', 'editor2', 'editor3', 'editor4', 'editor5') AND r.role_name = 'ROLE_EDITOR';

-- Assign 'ROLE_USER' to regular users
INSERT INTO user_roles (user_id, role_id)
SELECT u.id, r.id
FROM users u, roles r
WHERE u.username IN ('user1', 'user2', 'user3', 'user4', 'user5', 'user6', 'user7', 'user8', 'user9', 'user10') AND r.role_name = 'ROLE_USER';
