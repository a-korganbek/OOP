package problem4;

import java.io.*;

public class Sensor {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("sensor.txt"));
             DataOutputStream dos = new DataOutputStream(new FileOutputStream("sensor.bin"))) {

            String line;
            while ((line = br.readLine()) != null) {
                double value = Double.parseDouble(line.trim()); 
                dos.writeDouble(value);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файлов: " + e.getMessage());
            return; 
        } catch (NumberFormatException e) {
            System.out.println("Некорректное число в sensor.txt: " + e.getMessage());
            return;
        }

        
        try (RandomAccessFile raf = new RandomAccessFile("sensor.bin", "rw")) {
            raf.seek(29 * 8); 
            raf.writeDouble(999.9);
        } catch (IOException e) {
            System.out.println("Ошибка при патче sensor.bin: " + e.getMessage());
            return;
        }

        
        double sum = 0;
        double max = Double.MIN_VALUE;
        int count = 0;

        try (DataInputStream dis = new DataInputStream(new FileInputStream("sensor.bin"))) {
            while (dis.available() > 0) { 
                double val = dis.readDouble();
                sum += val;
                if (val > max) max = val;
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении sensor.bin: " + e.getMessage());
            return;
        }

        
        if (count > 0) {
            System.out.println("Average: " + (sum / count));
            System.out.println("Max: " + max);
        } else {
            System.out.println("Нет данных для подсчёта.");
        }
    }
}