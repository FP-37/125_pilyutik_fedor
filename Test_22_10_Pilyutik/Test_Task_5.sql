-- Создание таблицы T51
CREATE TABLE T51 (
    id INT PRIMARY KEY AUTO_INCREMENT,
    count INT NOT NULL
);

-- Создание таблицы T52
CREATE TABLE T52 (
    title CHAR(32) PRIMARY KEY,
    relative DECIMAL NOT NULL
);

-- Создание связи между таблицами T51 и T52
CREATE TABLE T51_T52 (
    t51_id INT NOT NULL,
    t52_title CHAR(32) NOT NULL,
    PRIMARY KEY (t51_id, t52_title),
    FOREIGN KEY (t51_id) REFERENCES T51(id) ON DELETE CASCADE,
    FOREIGN KEY (t52_title) REFERENCES T52(title) ON DELETE CASCADE
);

-- Добавление данных в таблицу T51
INSERT INTO T51 (count) VALUES (10);

-- Добавление данных в таблицу T52
INSERT INTO T52 (title, relative) VALUES ('Title1', 1.5);

-- Добавление данных в таблицу связи T51_T52
INSERT INTO T51_T52 (t51_id, t52_title) VALUES (1, 'Title1');