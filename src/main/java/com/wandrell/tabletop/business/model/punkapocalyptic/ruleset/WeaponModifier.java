package com.wandrell.tabletop.business.model.punkapocalyptic.ruleset;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;

public interface WeaponModifier {

    public void applyToWeapon(final Weapon weapon);

}
