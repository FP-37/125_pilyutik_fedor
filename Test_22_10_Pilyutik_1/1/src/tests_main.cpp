#include <iostream>
#include <gtest/gtest.h>
#include "ArrayExtensionTests.hpp"

using namespace std;

int main(int argc, char **argv) {
    ::testing::InitGoogleTest(&argc, argv);  // Initialize Google Test
    return RUN_ALL_TESTS(); // Run all tests
}
