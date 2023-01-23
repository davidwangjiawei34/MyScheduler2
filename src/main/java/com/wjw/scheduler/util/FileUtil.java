package com.wjw.scheduler.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileUtil {
    private static final String path = ".\\mySchedule";
    private static final String scheduleFile = "schedule.txt";
    private static final File file = new File(".\\mySchedule\\schedule.txt");

    public static void writeFile(String content){
        try (BufferedWriter writer
                     = Files.newBufferedWriter(Paths.get(path),StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            if (file.exists()) {
                writer.write(content);
                System.out.println("File exists");
            } else {
                System.out.println("File not exists, create it ...");
                //getParentFile() 获取上级目录(包含文件名时无法直接创建目录的)
                if (!file.getParentFile().exists()) {
                    System.out.println("not exists");
                    //创建上级目录
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
                writer.write(content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
