package com.adapter.default_adapter;

/**
 * Created by xh.zhi on 2018-8-29.
 * 缺省适配器角色：实现这个接口的子类，很可能出现很多方法是空着的情况
 * 因为之前接口设计的过大，导致接口中原本不该出现的方法出现了，结果现在子类根本用不上这个方法，
 * 但由于JAVA语言规则的原因，实现一个接口必须实现它的全部方法，所以我们的子类不得不被迫写一堆空方法在那，只为了编译通过。
 *
 * 所以我们只需实现我们关心的方法即可。
 */
public class DefaultUserInfo implements IBaseUserInfo{
    @Override
    public String getUserName() {
        System.out.println("我叫james");
        return "james";
    }

    @Override
    public String getJobPosition() {
        System.out.println("职位是高级总裁");
        return "高级总裁";
    }

    @Override
    public String getTelNumber() {
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getHourseTelNumber() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }
}
