package com.builder;

/**
 * Created by xh.zhi on 2018-10-29.
 *  中国飞船装配
 *
 *  导演者（装配）Director 角色：担任这个角色的类调用具体建造者角色以创建产品对象。此角色并没有产品类的具体知识，真正拥有产品
 *  类的具体知识的是具体建造者角色。
 */
public class ChinaAirshipDirector implements AirShipDirector
{
    /**持有建造者，具体构建交给建造者**/
    private AirShipBuilder builder;

    public ChinaAirshipDirector(AirShipBuilder builder){
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine e = builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower et = builder.builderEscapeTower();

        //装配成飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setSscapeTower(et);
        ship.setOrbitalModule(o);

        return ship;
    }
}
