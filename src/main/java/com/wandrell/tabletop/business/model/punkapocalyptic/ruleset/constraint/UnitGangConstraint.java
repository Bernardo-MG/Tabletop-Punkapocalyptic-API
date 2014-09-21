package com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.constraint;

import com.wandrell.util.tag.NewInstantiable;

public interface UnitGangConstraint extends GangConstraint, NewInstantiable {

    @Override
    public UnitGangConstraint createNewInstance();

    public void setUnit(final String unit);

}
