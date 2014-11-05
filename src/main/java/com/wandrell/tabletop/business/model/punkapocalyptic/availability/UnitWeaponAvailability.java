package com.wandrell.tabletop.business.model.punkapocalyptic.availability;

import java.util.Collection;

public interface UnitWeaponAvailability {

    /**
     * Returns the maximum amount of weapons the unit can acquire.
     * 
     * @return the maximum amount of weapons the unit can acquire
     */
    public Integer getMaxWeapons();

    /**
     * Returns the minimum amount of weapons the unit should acquire.
     * 
     * @return the minimum amount of weapons the unit should acquire
     */
    public Integer getMinWeapons();

    /**
     * Returns the weapon options.
     * 
     * @return the weapon options
     */
    public Collection<WeaponOption> getWeaponOptions();

}
