package com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.modifier;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Armor;

public interface ArmorInitializerModifier {

    public String getName();

    public Armor modify(final Armor armor);

}
