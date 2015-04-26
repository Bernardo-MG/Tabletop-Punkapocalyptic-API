package com.wandrell.tabletop.punkapocalyptic.model.unit.stats;

import com.wandrell.pattern.prototype.Prototype;

public interface EditableAttributesHolder extends AttributesHolder, Prototype {

    @Override
    public EditableAttributesHolder createNewInstance();

    public void setActions(final Integer actions);

    public void setAgility(final Integer agility);

    public void setCombat(final Integer combat);

    public void setPrecision(final Integer precision);

    public void setStrength(final Integer strength);

    public void setTech(final Integer tech);

    public void setToughness(final Integer toughness);

}
