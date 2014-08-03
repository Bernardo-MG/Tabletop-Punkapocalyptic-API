package com.wandrell.tabletop.punkapocalyptic.inventory;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.rule.SpecialRule;

public interface Armor {

    public Integer getArmor();

    public String getName();

    public Collection<SpecialRule> getSpecialRules();

}
