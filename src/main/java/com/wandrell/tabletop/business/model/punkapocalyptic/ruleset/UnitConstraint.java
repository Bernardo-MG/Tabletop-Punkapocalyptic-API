package com.wandrell.tabletop.business.model.punkapocalyptic.ruleset;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Band;

public interface UnitConstraint {

    public String getErrorMessage();

    public Boolean isValid(final Band band);

}
