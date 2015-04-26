package com.wandrell.tabletop.punkapocalyptic.model.unit;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.model.ruleset.SpecialRule;
import com.wandrell.tabletop.punkapocalyptic.model.unit.stats.AttributesHolder;

public interface UnitTemplate {

    public AttributesHolder getAttributes();

    public Integer getBaseCost();

    public String getNameToken();

    /**
     * Returns the special rules assigned to the unit.
     * 
     * @return the special rules assigned to the unit
     */
    public Collection<SpecialRule> getSpecialRules();

}
