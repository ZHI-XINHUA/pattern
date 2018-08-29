package com.adapter.default_adapter;

/**
 * Created by xh.zhi on 2018-8-29.
 *
 *   源角色：被适配接口
 */
public interface IBaseUserInfo {

    /**
     * 获取用户名
     * @return
     */
    String getUserName();

    /**
     * 获取职位
     * @return
     */
    String  getJobPosition();

    /**
     * 获取手机号码
     * @return
     */
    String getTelNumber();

    /**
     * 获取办公室号码
     * @return
     */
    String getOfficeTelNumber();

    /**
     * 获取家庭号码
     * @return
     */
    String getHourseTelNumber();

    /**
     * 获取住址
     * @return
     */
    String getAddress();
}
