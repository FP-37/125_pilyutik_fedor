#include <iostream>

class VolumeOfLiquid {
public:
    VolumeOfLiquid(int volume);

    int getVolume() const;

    VolumeOfLiquid operator+(const VolumeOfLiquid& other) const;
    VolumeOfLiquid operator-(const VolumeOfLiquid& other) const;
    VolumeOfLiquid operator*(int factor) const;
    VolumeOfLiquid operator/(int divisor) const;
    VolumeOfLiquid operator%(int divisor) const;

private:
    int m_volume;
};