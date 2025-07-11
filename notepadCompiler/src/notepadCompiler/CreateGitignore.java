package notepadCompiler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateGitignore {

    public static void main(String[] args) {
        // Path to your project folder - change this if needed
        String projectPath = "D:\\internship\\Notepad compiler\\.gitignore";

        // Content of the .gitignore file
        String content = """
            # Ignore compiled class files
            *.class

            # Ignore Eclipse-specific files/folders
            .project
            .classpath
            .settings/

            # Ignore build folders
            bin/
            target/

            # Ignore OS files
            .DS_Store
            Thumbs.db
            """;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(projectPath))) {
            writer.write(content);
            System.out.println(".gitignore file created successfully at " + projectPath);
        } catch (IOException e) {
            System.err.println("Error writing .gitignore file: " + e.getMessage());
        }
    }
}
