package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

import java.io.Serializable;

/**
 * 初识之衣
 */
public class BeginnerClothes extends Clothes implements Serializable {
    private static final long serialVersionUID = 8779735934552203349L;

    public BeginnerClothes() {
        this.hp = 100;
        this.physicalDef = 50;
    }

    @Override
    public int calculateHp() {
        return this.hp;
    }

    @Override
    public int calculateMp() {
        return 0;
    }

    @Override
    public int calculatePhysicalAtk() {
        return 0;
    }

    @Override
    public int calculateMagicalAtk() {
        return 0;
    }

    @Override
    public int calculatePhysicalDef() {
        return this.physicalDef;
    }

    @Override
    public int calculateMagicalDef() {
        return 0;
    }

    @Override
    public double calculateCritRate() {
        return 0;
    }

    @Override
    public double calculateBloodSucking() {
        return 0;
    }

    @Override
    public int calculateSellMoney() {
        return 1500;
    }

    @Override
    public String description() {
        return "初识之衣";
    }

    @Override
    public String toString() {
        return "BeginnerClothes{" +
                "hp=" + hp +
                ", physicalDef=" + physicalDef +
                '}';
    }
}
