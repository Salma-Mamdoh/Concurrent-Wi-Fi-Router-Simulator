import java.io.FileWriter;
import java.io.IOException;

class Output {
    private static final String FILE_NAME = "output.txt";
    private FileWriter fileWriter;

    public Output() {
        try {
            // Create a FileWriter with the specified file name
            fileWriter = new FileWriter(FILE_NAME, true); // 'true' indicates append mode
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String message) {
        try {
            // Write the message to the file
            fileWriter.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void flush() {
        try {
            // Flush the FileWriter to ensure data is written immediately
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closeFileWriter() {
        try {
            // Close the FileWriter
            if (fileWriter != null) {
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
