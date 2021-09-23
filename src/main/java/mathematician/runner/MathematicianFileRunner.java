package mathematician.runner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class MathematicianFileRunner {

    public static final Path calculatorFilesPath = Path.of("src","main", "resources", "calculator");
    public static final Path operationFilePath = calculatorFilesPath.resolve("in.txt");

    public static void main(String[] args) throws IOException {
        List<String> operations = readAllLines(operationFilePath);

        for (String operation : operations) {
            int result = CalculateResult.getResult(operation);
            System.out.println(operation + " = " + result);
        }
    }
}
