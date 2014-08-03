package com.wandrell.tabletop.punkapocalyptic.inventory;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.rule.SpecialRule;

public interface Weapon {

    public String getName();

    public Integer getPenetration();

    public Collection<SpecialRule> getSpecialRules();

    public Integer getStrength();

}
