package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 太阳石，增加20点物理攻击力
 */
public class GemPatk implements IEquipDecorator {
    //维护一个装备对象
    private IEquip equip;

    public GemPatk(IEquip equip) {
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
        return equip.calculatePhysicalAtk() + 20;
    }

    @Override
    public int calculateMagicalAtk() {
        return equip.calculateMagicalAtk();
    }

    @Override
    public int calculatePhysicalDef() {
        return equip.calculatePhysicalDef();
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
        return equip.description()+"+太阳石";
    }
}