package by.ivramko.OOP.polymorphism;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        User contentManage = new ContentManager();
        User admin = new Admin();

        contentManage.validateAccessRights();
        admin.validateAccessRights();


        System.out.println();
        System.out.println("=========================");
        System.out.println();

        Archiver zip = new ZipArchiver();
        Archiver rar = new RarArchiver();

        zip.archiveFiles(new File(" "));
        rar.archiveFiles(new File(" "));

    }
}
