#include "task_1.hpp"
#include <vector>
#include <algorithm>
#include <iostream>

// Реализация функции count_max_odd()
int count_max_odd(const std::vector<int>& data) {
    int max_odd = 0;

    // Итерация по всем элементам вектора
    for (const auto& element : data) {
        // Проверка на нечетность и положительность
        if (element % 2 != 0 && element > 0) {
            // Обновление максимального значения, если необходимо
            if (element > max_odd) {
                max_odd = element;
            }
        }
    }

    return max_odd;
}

int main() {
    std::vector<int> data = { 1, 4, -2, 3, 5, -8, 2 };
    auto result_1 = count_max_odd(data);

    std::cout << "Результат для данных: " << data << " равен " << result_1 << std::endl;

    const std::vector<int> data_2 = { 1, 4, -2, 7, 5, -8, 6 };
    auto result_2 = count_max_odd(data_2);

    std::cout << "Результат для данных: " << data_2 << " равен " << result_2 << std::endl;

    return 0;
}