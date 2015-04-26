package com.wandrell.tabletop.punkapocalyptic.model.unit;

import com.wandrell.tabletop.punkapocalyptic.model.unit.stats.AttributesHolder;

public interface UnitTemplate {

    public AttributesHolder getAttributes();

    public Integer getBaseCost();

    public String getNameToken();

}
