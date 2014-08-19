package com.wandrell.tabletop.punkapocalyptic.unit;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.punkapocalyptic.inventory.Weapon;

public interface AvailabilityUnit extends Unit {

    public Collection<Armor> getArmorsSelection();

    public Collection<Weapon> getWeaponsSelection();

}
