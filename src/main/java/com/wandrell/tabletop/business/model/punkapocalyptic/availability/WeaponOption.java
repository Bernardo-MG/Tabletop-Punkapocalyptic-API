package com.wandrell.tabletop.business.model.punkapocalyptic.availability;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.WeaponEnhancement;

public interface WeaponOption {

    public Collection<WeaponEnhancement> getEnhancements();

    public Weapon getWeapon();

}
