package com.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xh.zhi on 2018-9-13.
 */
public class MainTest {
    public static void main(String[] args) {
        List<IFile> files1 = new ArrayList<IFile>();
        List<IFile> files2 = new ArrayList<IFile>();
        //模拟文件夹下面的文件
        for(int i=1;i<=5;i++){
            files1.add(new File("test"+i+".java"));
            files2.add(new File("速度与激情"+i+".avi"));
        }
        Folder movie = new Folder("我的电影",files2);
        //创建root
        Folder c = new Folder("C盘",files1);
        //创建文件
        c.createFile(new File("需求文档.doc"));
        //创建子文件夹
        c.createFolder(movie);

        List<IFile> list = c.getFiles();
        for (IFile node:list) {
            //子文件夹
            if(node instanceof Folder){
                System.out.println("======"+node.getFileName()+"========");
                Folder folder = (Folder) node;
                List<IFile> cnodes = folder.getFiles();
                for (IFile cnode:cnodes) {
                    System.out.println(cnode.getFileName());
                }
                System.out.println("======"+node.getFileName()+"========");
            }else{
                System.out.println(node.getFileName());
            }

        }
    }
}
