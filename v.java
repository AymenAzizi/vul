import java.sql.*;
import java.io.*;

public class VulnerableApp {
    public static void main(String[] args) {
        // SQL Injection Vulnerability
        String userInput = args[0];
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
            Sanitize user input before rendering it as HTML:

Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

// Use ESAPI encoder to prevent XSS
// Use ESAPI encoder to prevent XSS
import org.owasp.esapi.ESAPI;

// Instead of:
// out.println(userInput);

// Use ProcessBuilder instead of Runtime.exec with user input
List<String> commands = new ArrayList<>();
commands.add("command");
commands.add(sanitizedParam);
ProcessBuilder processBuilder = new ProcessBuilder(commands);
Process process = processBuilder.start();\nout.println(ESAPI.encoder().encodeForHTML(userInput));\n
// Instead of:

// Use ProcessBuilder instead of Runtime.exec with user input
List<String> commands = new ArrayList<>();
commands.add("command");
commands.add(sanitizedParam);
// Use ESAPI encoder to prevent XSS
import org.owasp.esapi.ESAPI;

// Instead of:
// out.println(userInput);

// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));\nProcess process = processBuilder.start();
if (!allowedCommands.contains(userInput)) {
    throw new SecurityException("Invalid command");
// Use ESAPI encoder to prevent XSS
import org.owasp.esapi.ESAPI;

// Use ESAPI encoder to prevent XSS
import org.owasp.esapi.ESAPI;

// Use ESAPI encoder to prevent XSS
// Use ProcessBuilder instead of Runtime.exec with user input
List<String> commands = new ArrayList<>();
commands.add("command");
commands.add(sanitizedParam);
ProcessBuilder processBuilder = new ProcessBuilder(commands);
Process process = processBuilder.start();\n
// Instead of:
// out.println(userInput);

// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));\n// out.println(userInput);

// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));\n// out.println(userInput);

        }

Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

// Use ESAPI encoder to prevent XSS
import org.owasp.esapi.ESAPI;

// Instead of:
// Use ESAPI encoder to prevent XSS
import org.owasp.esapi.ESAPI;

// Instead of:
// out.println(userInput);

// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));
```\n        Avoid using user input in command execution. If necessary, validate and sanitize the input:

// Use ProcessBuilder instead of Runtime.exec with user input
List<String> commands = new ArrayList<>();
commands.add("command");
commands.add(sanitizedParam);
commands.add(sanitizedParam);ProcessBuilder processBuilder = new ProcessBuilder(commands);
ProcessBuilder processBuilder = new ProcessBuilder(commands);Process process = processBuilder.start();

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;
