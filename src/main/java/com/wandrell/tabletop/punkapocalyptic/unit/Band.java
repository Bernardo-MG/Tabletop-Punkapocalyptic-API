package com.wandrell.tabletop.punkapocalyptic.unit;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.faction.Faction;
import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Band extends NewInstantiable {

    public void addUnit(final Unit unit);

    public void clearUnits();

    @Override
    public Band createNewInstance();

    public ValueHandler getBullets();

    public Faction getFaction();

    public Collection<Unit> getUnits();

}
