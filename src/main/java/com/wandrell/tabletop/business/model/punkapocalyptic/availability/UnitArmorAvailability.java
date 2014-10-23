package com.wandrell.tabletop.business.model.punkapocalyptic.availability;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Armor;

public interface UnitArmorAvailability {

    /**
     * Returns the armor options.
     * 
     * @return the armor options
     */
    public Collection<Armor> getArmorOptions();

    public Armor getInitialArmor();

}
