package com.wandrell.tabletop.model.punkapocalyptic.ruleset;

import com.wandrell.tabletop.model.punkapocalyptic.unit.Band;

public interface UnitConstraint {

    public String getErrorMessage();

    public Boolean isValid(final Band band);

}
