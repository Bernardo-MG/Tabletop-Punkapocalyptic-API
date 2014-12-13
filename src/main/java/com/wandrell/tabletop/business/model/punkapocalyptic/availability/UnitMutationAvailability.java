package com.wandrell.tabletop.business.model.punkapocalyptic.availability;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Mutation;

public interface UnitMutationAvailability {

    public Integer getMaxMutations();

    public Collection<Mutation> getMutationOptions();

}
