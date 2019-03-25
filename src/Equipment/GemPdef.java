package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 月亮石，增加物理防御20
 */
public class GemPdef implements IEquipDecorator {
    //维护一个装备对象
    private IEquip equip;

    public GemPdef(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int calculateHp() {
        return equip.calculateHp();
    }

    @Override
    public int calculateMp() {
        return equip.calculateMp();
    }

    @Override
    public int calculatePhysicalAtk() {
        return equip.calculatePhysicalAtk();
    }

    @Override
    public int calculateMagicalAtk() {
        return equip.calculateMagicalAtk();
    }

    @Override
    public int calculatePhysicalDef() {
        return equip.calculatePhysicalDef() + 20;
    }

    @Override
    public int calculateMagicalDef() {
        return equip.calculateMagicalDef();
    }

    @Override
    public double calculateCritRate() {
        return equip.calculateCritRate();
    }

    @Override
    public double calculateBloodSucking() {
        return equip.calculateBloodSucking();
    }

    @Override
    public String description() {
        return equip.description()+"+月亮石";
    }
}