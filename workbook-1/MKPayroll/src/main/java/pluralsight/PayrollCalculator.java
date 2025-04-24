package pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PayrollCalculator {
    public static void main(String[] args) {
        final String INPUT_FILE = "employee.csv";
        final String OUTPUT_FILE = "payroll_results.csv";

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE));
        ) {
            String line;

            System.out.println("Employee Payroll");
            bufferedWriter.write("ID|Name|Gross Pay|Address\n");

            while((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hours = Double.parseDouble(parts[2]);
                double rate = Double.parseDouble(parts[3]);

                String outputLine = String.format("%d|%s|%.2f|%s\n", id, name, hours * rate, name.equalsIgnoreCase("Ilya Gofman") ? "110 Fiddler Road, Stratford, CN, USA, 06614" : "");
                bufferedWriter.write(outputLine);
            }
            System.out.println("Payroll processed. Results saved to " + OUTPUT_FILE );
        } catch(Exception e) {
            System.out.println("Error processing payroll: " + e.getMessage());
        }
    }
}