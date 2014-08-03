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

    public void clearEquipment();

    public Unit createNewInstance();
    
    public void addRule(final SpecialRule rule);
    
    public void addWeapon(final Weapon weapon);
    
    public void clearWeapons();
    
    public void clearRules();

    public ValueHandler<Integer> getActions();
    
    public ValueHandler<Integer> getAgility();
    
    public Armor getArmor();

    public ValueHandler<Integer> getCombat();

    public Collection<Equipment> getEquipment();

    public ValueHandler<Integer> getFreeWeaponSlots();

    public String getName();

    public ValueHandler<Integer> getPrecision();

    public Collection<SpecialRule> getSpecialRules();

    public ValueHandler<Integer> getStrength();

    public ValueHandler<Integer> getTech();

    public ValueHandler<Integer> getToughness();

    public ValueHandler<Integer> getValoration();

    public Collection<Weapon> getWeapons();

    public void setArmor(final Armor armor);

}
