package com.ad.homework04.File;

import java.io.File;

public class Separator {
    public static void main(String[] args) {
        System.out.println("文件路径分隔符：" + File.separator);
        System.out.println("环境变量分隔符" + File.pathSeparator);
    }
}
