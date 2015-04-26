package com.wandrell.tabletop.punkapocalyptic.model.unit.stats;

import com.wandrell.tabletop.punkapocalyptic.model.unit.event.AttributesListener;

public interface AttributesHolder {

    public void addAttributesListener(final AttributesListener listener);

    /**
     * Returns the actions attribute value.
     * 
     * @return the actions attribute value
     */
    public Integer getActions();

    /**
     * Returns the agility attribute value.
     * 
     * @return the agility attribute value
     */
    public Integer getAgility();

    /**
     * Returns the combat attribute value.
     * 
     * @return the combat attribute value
     */
    public Integer getCombat();

    /**
     * Returns the precision attribute value.
     * 
     * @return the precision attribute value
     */
    public Integer getPrecision();

    /**
     * Returns the strength attribute value.
     * 
     * @return the strength attribute value
     */
    public Integer getStrength();

    /**
     * Returns the tech attribute value.
     * 
     * @return the tech attribute value
     */
    public Integer getTech();

    /**
     * Returns the toughness attribute value.
     * 
     * @return the toughness attribute value
     */
    public Integer getToughness();

    public void removeAttributesListener(final AttributesListener listener);

}
