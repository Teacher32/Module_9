package com.mod9.FIS;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class FileInputStreamEx {
    public static void main(String[] args) throws IOException {     // throws - бросать, выбросить
//         String fileName = "SmallFile.txt";                          // открываем файл SmallFile.txt для чтения
//         FileInputStream fis = new FileInputStream(fileName);        // создаем поток ввода из этого файла

         File file = new File("files" + File.separator + "SmallFile.txt");
         FileInputStream fis = new FileInputStream(file);

        boolean isExists = file.exists();
        if (isExists) {
            System.out.println("Файл с именем " + file + " существует.");
        }
        else {
            System.out.println("Файл с именем " + file + " НЕ НАЙДЕН!");
        }


        int i = fis.read();          // вводим переменную i и присваиваем ей значение прочитанного из файла байта
        while (i != -1) {               // используем цикл, в которому словие "пока байт из потока не равен -1," ...
            System.out.print((char) (i));    // ... выводим байт из потока в консоль и ...
            i = fis.read();             // ... читаем следующий байт из потока.
        }
        fis.close();                    // после того, как read() вернул -1, закрываем поток методом close()
    }
}