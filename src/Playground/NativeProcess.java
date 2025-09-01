package Playground;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class NativeProcess {

    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("ping", "-n", "4", "google.com");
            StringBuilder os = new StringBuilder(System.getProperty("os.name").toLowerCase());
            System.out.println(os);

            Process process = pb.start();

            // Read output
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream())
            );
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            boolean finished = process.waitFor(10, TimeUnit.SECONDS);
            if (!finished) {
                process.destroy();
                System.out.println("Process killed after timeout!");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
