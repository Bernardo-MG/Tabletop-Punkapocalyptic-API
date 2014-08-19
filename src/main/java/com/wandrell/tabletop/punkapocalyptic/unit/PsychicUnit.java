package com.wandrell.tabletop.punkapocalyptic.unit;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.mutation.PsychicPower;

public interface PsychicUnit extends Unit {

    @Override
    public PsychicUnit createNewInstance();

    public Collection<PsychicPower> getPsychicPowers();

}
