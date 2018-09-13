package com.composite.tarnsparent;

import java.util.List;

/**
 * Created by xh.zhi on 2018-9-13.
 * 透明模式
 *  文件接口
 *  抽象构件角色：给参加组合的对象规定一个接口，规范共有的接口及默认行为。这个接口可以用来管理所以的子对象，要提供一个接口
 *  以规范取得和管理下层组件的接口，包括add()、remove()已经getChild()之类的方法
 */
public interface IFile {
    /********1、有的接口及默认行为：公共行为，只是简单列出几个方法**********/
    //获取文件名称
    String getFileName();
    //删除文件
    void delete();

    /********2、管理下层组件：文件夹才有的行为，只是简单列出几个方法****************/
    //创建文件
    void createFile(IFile iFile);
    //创建文件夹
    void createFolder(IFile iFile);
    //删除文件
    void deleteFile(IFile iFile);
    //获取文件夹下所有文件
    List<IFile> getFiles();

}
