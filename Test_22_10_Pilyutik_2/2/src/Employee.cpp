#include "Employee.hpp"

Employee::Employee(const std::string& name, int age, const std::string& profession, float salary)
    : m_name(name), m_age(age), m_profession(profession), m_salary(salary) {
}

std::string Employee::getName() const {
    return m_name;
}

int Employee::getAge() const {
    return m_age;
}

std::string Employee::getProfession() const {
    return m_profession;
}

float Employee::getSalary() const {
    return m_salary;
}