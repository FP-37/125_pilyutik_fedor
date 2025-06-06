-- Создание таблицы T61
CREATE TABLE T61 (
    id INT PRIMARY KEY AUTO_INCREMENT,
    count INT NOT NULL
);

-- Создание таблицы T62
CREATE TABLE T62 (
    title CHAR(32) PRIMARY KEY,
    relative DECIMAL NOT NULL
);

-- Создание таблицы связи T61_T62
CREATE TABLE T61_T62 (
    t61_id INT NOT NULL,
    t62_title CHAR(32) NOT NULL,
    PRIMARY KEY (t61_id, t62_title),
    FOREIGN KEY (t61_id) REFERENCES T61(id) ON DELETE CASCADE,
    FOREIGN KEY (t62_title) REFERENCES T62(title) ON DELETE CASCADE
);

-- Добавление данных в таблицу T61
INSERT INTO T61 (count) VALUES (10);

-- Добавление данных в таблицу T62
INSERT INTO T62 (title, relative) VALUES ('Title1', 1.5);

-- Добавление данных в таблицу связи T61_T62
INSERT INTO T61_T62 (t61_id, t62_title) VALUES (1, 'Title1');