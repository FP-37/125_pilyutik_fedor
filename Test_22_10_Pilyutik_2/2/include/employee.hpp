#include "Employee.hpp"
#include <string>

class Employee {
public:
    Employee(const std::string& name, int age, const std::string& profession, float salary);

    std::string getName() const;
    int getAge() const;
    std::string getProfession() const;
    float getSalary() const;

private:
    std::string m_name;
    int m_age;
    std::string m_profession;
    float m_salary;
};