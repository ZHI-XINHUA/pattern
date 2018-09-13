package com.composite.tarnsparent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xh.zhi on 2018-9-13.
 * 文件夹
 * 树枝构件(Composite)角色：代表参加组合的有子对象的对象，并给出树枝构件对象的行为
 */
public class Folder implements IFile{
    private String folderName;

    private List<IFile> files;

    public Folder(String folderName,List<IFile> files){
        this.folderName = folderName;
        this.files = files;
    }

    @Override
    public String getFileName() {
        return folderName;
    }

    @Override
    public void delete() {
        files = null;
    }

    @Override
    public void createFile(IFile iFile) {
        files.add(iFile);
    }

    @Override
    public void createFolder(IFile iFile) {
        files.add(iFile);
    }

    @Override
    public void deleteFile(IFile iFile) {
        files.remove(iFile);
    }

    @Override
    public List<IFile> getFiles() {
        return files;
    }
}
