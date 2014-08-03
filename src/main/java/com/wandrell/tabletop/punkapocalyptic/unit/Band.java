package com.wandrell.tabletop.punkapocalyptic.unit;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.faction.Faction;
import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Band extends NewInstantiable {
    
    public Band createNewInstance();
    
    public Collection<Unit> getUnits();
    
    public void addUnit(final Unit unit);
    
    public void clearUnits();
    
    public ValueHandler<Integer> getBullets();
    
    public Faction getFaction();

}
