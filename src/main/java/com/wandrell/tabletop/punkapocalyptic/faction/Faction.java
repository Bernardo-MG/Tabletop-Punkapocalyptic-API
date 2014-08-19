package com.wandrell.tabletop.punkapocalyptic.faction;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.unit.AvailabilityUnit;

public interface Faction {

    public Collection<AvailabilityUnit> getAvailableUnits();

    public String getName();

}
