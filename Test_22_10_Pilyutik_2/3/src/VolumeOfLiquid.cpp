#include "VolumeOfLiquid.hpp"

VolumeOfLiquid::VolumeOfLiquid(int volume)
    : m_volume(volume) {
}

int VolumeOfLiquid::getVolume() const {
    return m_volume;
}

VolumeOfLiquid VolumeOfLiquid::operator+(const VolumeOfLiquid& other) const {
    int totalVolume = m_volume + other.m_volume;
    return VolumeOfLiquid(totalVolume);
}

VolumeOfLiquid VolumeOfLiquid::operator-(const VolumeOfLiquid& other) const {
    if (m_volume < other.m_volume) {
        return VolumeOfLiquid(0);
    }
    int difference = m_volume - other.m_volume;
    return VolumeOfLiquid(difference);
}

VolumeOfLiquid VolumeOfLiquid::operator*(int factor) const {
    int multipliedVolume = m_volume * factor;
    return VolumeOfLiquid(multipliedVolume);
}

VolumeOfLiquid VolumeOfLiquid::operator/(int divisor) const {
    if (divisor == 0) {
        throw std::invalid_argument("Divisor cannot be zero");
    }
    int dividedVolume = m_volume / divisor;
    return VolumeOfLiquid(dividedVolume);
}

VolumeOfLiquid VolumeOfLiquid::operator%(int divisor) const {
    if (divisor == 0) {
        throw std::invalid_argument("Divisor cannot be zero");
    }
    int remainder = m_volume % divisor;
    return VolumeOfLiquid(remainder);
}