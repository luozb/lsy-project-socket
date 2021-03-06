package lsy.project.socket.api.contants;


/**
 * 车辆的洗扫启动类型模式
 *
 * @author: lisongyue@edenep.net
 * @company: Eden Technology
 * @motto: 代码也可以是一种艺术
 * @version: 1.0
 * @date: 2020/7/15 10:56
 */
public enum VehicleSweepingConditionEnum {
    /**
     * 全洗扫启动
     */
    fullwashstart("全洗扫启动", 0),
    /**
     * 左洗扫启动
     */
    leftwashstart("左洗扫启动", 1),
    /**
     * 右洗扫启动
     */
    rightwashstart("右洗扫启动", 2),
    /**
     * 全扫启动
     */
    sweepallstart("全扫启动", 3),
    /**
     * 左扫启动
     */
    sweeptheleftstart("左扫启动", 4),
    /**
     * 右扫启动
     */
    sweeptherightstart("右扫启动", 5),
    /**
     * 全洗启动
     */
    washallstart("全洗启动", 6),
    /**
     * 左洗启动
     */
    washtheleftstart("左洗启动", 7),
    /**
     * 右洗启动
     */
    washtherightstart("右洗启动", 8);

    private String desc;

    private int index;

    private VehicleSweepingConditionEnum(String desc, int index) {
        this.desc = desc;
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return desc;
    }

    public static String getWorkStatus(int index) {
        for (VehicleSweepingConditionEnum v : VehicleSweepingConditionEnum.values()) {
            if (v.getIndex() == index) {
                return v.getDesc();
            }
        }
        return null;
    }
}
