package za.co.diputu.model.characters;

import lombok.Getter;
import lombok.Setter;
import za.co.diputu.model.artifacts.Armor;
import za.co.diputu.model.artifacts.Weapon;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public abstract class Hero extends Character {
    @NotNull
    private Weapon weapon;
    @NotNull
    private Armor armor;
    private String HeroName;

    int level;
    int experience;
}
