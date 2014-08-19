package com.wandrell.tabletop.punkapocalyptic.unit;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.punkapocalyptic.inventory.Equipment;
import com.wandrell.tabletop.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.punkapocalyptic.rule.SpecialRule;
import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Unit extends NewInstantiable {

    public void addEquipment(final Equipment equipment);

    public void addRule(final SpecialRule rule);

    public void addWeapon(final Weapon weapon);

    public void clearEquipment();

    public void clearRules();

    public void clearWeapons();

    @Override
    public Unit createNewInstance();

    public ValueHandler getActions();

    public ValueHandler getAgility();

    public Armor getArmor();

    public ValueHandler getCombat();

    public Collection<Equipment> getEquipment();

    public ValueHandler getFreeWeaponSlots();

    public String getName();

    public ValueHandler getPrecision();

    public Collection<SpecialRule> getSpecialRules();

    public ValueHandler getStrength();

    public ValueHandler getTech();

    public ValueHandler getToughness();

    public ValueHandler getValoration();

    public Collection<Weapon> getWeapons();

    public void setArmor(final Armor armor);

}
