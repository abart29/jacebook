ALTER TABLE posts
ADD COLUMN user_id BIGINT;

ALTER TABLE posts
ADD CONSTRAINT fk_user
FOREIGN KEY (user_id)
REFERENCES users(id);