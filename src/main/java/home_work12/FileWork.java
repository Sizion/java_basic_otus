package home_work12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) {

        File file = new File(".");

        FileFilter filter = new FileFilter() {

            public boolean accept(File f) {
                return f.getName().endsWith("txt");
            }
        };

        File[] files = file.listFiles(filter);

        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }

        System.out.println("Выбирай файл, с которым хочешь поработать");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        //Чтение из файла
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(fileName))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char)n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Разрешаю тебе в этом файле что-то написать");
        //Запись в файл
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName))) {
            byte[] buffer = scanner.nextLine().getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
