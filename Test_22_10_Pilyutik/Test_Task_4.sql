-- Создание таблицы T41
CREATE TABLE T41 (
                     id INT PRIMARY KEY AUTO_INCREMENT,
                     count INT NOT NULL
);

-- Создание таблицы T42
CREATE TABLE T42 (
                     title CHAR(32) PRIMARY KEY,
                     relative DECIMAL NOT NULL
);

-- Создание связи между таблицами T41 и T42
CREATE TABLE T41_T42 (
    t41_id INT NOT NULL,
    t42_title CHAR(32) NOT NULL,
    PRIMARY KEY (t41_id, t42_title),
    FOREIGN KEY (t41_id) REFERENCES T41(id) ON DELETE CASCADE,
    FOREIGN KEY (t42_title) REFERENCES T42(title) ON DELETE CASCADE
);

-- Добавление данных в таблицу T41
INSERT INTO T41 (count) VALUES (10);

-- Добавление данных в таблицу T42
INSERT INTO T42 (title, relative) VALUES ('Title1', 1.5);

-- Добавление данных в таблицу связи T41_T42
INSERT INTO T41_T42 (t41_id, t42_title) VALUES (1, 'Title1');