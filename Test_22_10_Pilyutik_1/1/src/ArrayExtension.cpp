#include <iostream>
#include <vector>
#include <algorithm>
#include <stdexcept>

class ArrayExtension {
private:
    std::vector<int> array;
public:
    ArrayExtension(const std::vector<int>& arr) : array(arr) {}

    std::vector<int>::size_type size() const {
        return array.size();
    }

    int& operator[](int index) {
        if (index < 0 || static_cast<std::size_t>(index) >= array.size()) {
            throw std::out_of_range("Index out of bounds");
        }
        return array[index];
    }

    int operator[](int index) const {
        if (index < 0 || static_cast<std::size_t>(index) >= array.size()) {
            throw std::out_of_range("Index out of bounds");
        }
        return array[index];
    }

    std::vector<int> sorted() const {
        std::vector<int> sorted_arr = array;
        std::sort(sorted_arr.begin(), sorted_arr.end());
        return sorted_arr;
    }

    std::vector<int> every_nth(int n) const {
        std::vector<int> every_nth_arr;
        if (n <= 0) {
            throw std::invalid_argument("n must be positive");
        }
        for (std::size_t i = 0; i < array.size(); i += n) {
            every_nth_arr.push_back(array[i]);
        }
        return every_nth_arr;
    }

    bool is_increasing() const {
        return std::is_sorted(array.begin(), array.end());
    }

    bool is_decreasing() const {
        return std::is_sorted(array.begin(), array.end(), std::greater<int>());
    }

    bool is_all_even() const {
        for (int x : array) {
            if (x % 2 != 0) {
                return false;
            }
        }
        return true;
    }
};