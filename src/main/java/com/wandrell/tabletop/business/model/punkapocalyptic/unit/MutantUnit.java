package com.wandrell.tabletop.business.model.punkapocalyptic.unit;

import java.util.Collection;

public interface MutantUnit extends Unit {

    public void addMutation(final Mutation mutation);

    public void clearMutations();

    public Collection<Mutation> getMutations();

    public void removeMutation(final Mutation mutation);

}
