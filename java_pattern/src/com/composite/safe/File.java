package com.composite.safe;

import java.util.List;

/**
 * Created by xh.zhi on 2018-9-13.
 *  安全模式
 *  文件
 *  树叶构件(Leaf)角色：代办参加组合的树叶对象。一个树叶没有下级的子对象。定义出参加组合的原始对象行为。
 */
public class File implements IFile {
    private String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }
    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public void delete() {
        //假装删除
        fileName ="";
    }

}
