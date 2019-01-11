package com.builder;

/**
 * Created by xh.zhi on 2018-10-29.
 *  飞船建造接口
 *
 *   抽象建造者（Builder）角色：给出一个抽象接口，已规范产品对象的各个组成成分建造。
 */
public interface AirShipBuilder {
    /**
     * 建造引擎
     * @return
     */
    Engine builderEngine();

    /**
     * 建造轨道舱
     * @return
     */
    OrbitalModule builderOrbitalModule();

    /**
     * 建造逃逸塔
     * @return
     */
    EscapeTower  builderEscapeTower();
}
