package com.wandrell.tabletop.business.model.punkapocalyptic.availability;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Equipment;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.WeaponEnhancement;

public interface UnitEquipmentAvailability {

    /**
     * Returns the equipment options.
     * 
     * @return the equipment options
     */
    public Collection<Equipment> getEquipmentOptions();

    /**
     * Returns the weapon enhancement options.
     * 
     * @return the weapon enhancement options
     */
    public Collection<WeaponEnhancement> getWeaponEnhancementOptions();

}
