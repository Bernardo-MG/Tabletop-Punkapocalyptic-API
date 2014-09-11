package com.wandrell.tabletop.business.model.punkapocalyptic.ruleset;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;

public interface UnitConstraint {

    public String getErrorMessage();

    public Boolean isValid(final Gang band);

}
