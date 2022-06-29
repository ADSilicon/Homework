package com.ad.homework04.File;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class UseFile {

    private static Scanner sc=new Scanner(System.in);
    private static final String ROOT = "." + File.separator;

    public static void main(String[] args) throws IOException {

        File dir=createDirs();
        File newDir=renameDir(dir);
        if(newDir==null)return;
        String fileName=createFiles(newDir);
        String fileNameNew = renameFiles(newDir, fileName);

        deleteFiles(newDir, fileNameNew);

        deleteDir(newDir);

    }

    private static void deleteDir(File newDir) {
        System.out.println("删除文件夹？");
        boolean deleteDir = sc.nextBoolean();
        if(deleteDir){
            System.out.println("删除文件夹：" + newDir.delete());
        }

    }

    private static File createDirs() {
        List<String> pathList=new ArrayList<>();
        while(true){
            System.out.println("输入文件路径");
            String path=sc.next();
            if (path.isBlank())
                break;
            pathList.add(path);
        }
        return createDir(pathList.toArray(new String[0]));

    }

    private static File createDir(String... path) {

        String rest =joinRestDir(path);
        System.out.println("将在" + ROOT + "下创建" + rest);
        File dir = new File(ROOT, rest);
        if(dir.exists()&&dir.isDirectory()){
            System.out.println("文件已存在"+dir.toString());
            return dir;
        }else {
            boolean flag = dir.mkdirs();
            if (flag)
                return dir;
        else
            throw new IllegalArgumentException("无法在" + ROOT + "下创建" + rest);

        }

    }
    private static void deleteFiles(File newDir, String fileNameNew) {
        System.out.println("删除文件？");
        boolean flag=sc.nextBoolean();
        if(flag){
            for (int i = 0; i < 20; i++) {
                File fn = new File(newDir, fileNameNew + i + ".txt");
                System.out.println("删除文件"+fn.delete());
            }
        }
    }

    private static String renameFiles(File newDir, String fileName) {
        System.out.println("请输入新的文件名的前缀：");
        String fileNameNew = sc.next().trim();
        for (int i = 0; i < 20; i++) {
            File f = new File(newDir, fileName + i + ".txt");
            File fn = new File(newDir, fileNameNew + i + ".txt");
        }
        return fileNameNew;
    }


    private static String joinRestDir(String... path) {
    return Arrays.stream(path).map(String::trim).collect(Collectors.joining(File.separator));

    }

    private static String createFiles(File file) throws IOException {

        System.out.println("输入文件的前缀：");
        String filename= sc.next().trim();
        for (int i = 0; i < 20; i++) {
            File f = new File(file.getParent(), filename);
            System.out.println("创建文件" +f.getName()+": "+f.createNewFile());
        }
        return filename;
    }

    private static File renameDir(File dir) {
        System.out.println("请输入新的文件夹的名字：");
        String newDirName = sc.nextLine().trim();

        File newDir = new File(dir.getParent(), newDirName);
        boolean flag=dir.renameTo(newDir);
        if(flag)
            System.out.println("改名为" + newDirName + "成功");
     else {
            System.out.println("改名为" + newDirName + "失败");
            return null;
        }
        return newDir;

    }
    }
