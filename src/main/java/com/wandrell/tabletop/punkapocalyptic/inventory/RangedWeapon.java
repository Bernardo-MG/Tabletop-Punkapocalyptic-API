package com.wandrell.tabletop.punkapocalyptic.inventory;

public interface RangedWeapon extends Weapon {

    public interface RangedDistance {

        public Integer getLongDistance();

        public Integer getMediumDistance();

        public Integer getShortDistance();

    }

    public RangedDistance getDistancesImperialUnits();

    public RangedDistance getDistancesMetricSystem();

}
