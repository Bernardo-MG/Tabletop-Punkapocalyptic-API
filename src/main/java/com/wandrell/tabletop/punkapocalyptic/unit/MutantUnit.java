package com.wandrell.tabletop.punkapocalyptic.unit;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.mutation.Mutation;

public interface MutantUnit extends Unit {

    @Override
    public MutantUnit createNewInstance();

    public Collection<Mutation> getMutations();

}
