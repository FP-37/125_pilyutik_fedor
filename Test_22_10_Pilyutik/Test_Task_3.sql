-- Создание таблицы T31
CREATE TABLE T31 (
    id INT PRIMARY KEY,
    count INT NOT NULL,
    relative DECIMAL NOT NULL
);

-- Добавление данных
INSERT INTO T31 (id, count, relative) VALUES
    (1, 2, 3.5),
    (10, 12, 33.1),
    (2, 0, -12.2);