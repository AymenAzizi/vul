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

java
java
String sanitizedInput = HtmlSanitizer.sanitize(userInput);
out.println(sanitizedInput);\nout.println(sanitizedInput);
out.println(sanitizedInput);

java
java
List<String> allowedCommands = Arrays.asList("ls", "dir", "echo");
String command = userInput;
if (allowedCommands.contains(command)) {
    Runtime.getRuntime().exec(command);
} else {
    // Handle the case when the user input is not in the allowed list
}\nString command = userInput;
if (allowedCommands.contains(command)) {
if (allowedCommands.contains(command)) {    Runtime.getRuntime().exec(command);
} else {
if (!allowedCommands.contains(userInput)) {
    throw new SecurityException("Invalid command");
Runtime.getRuntime().exec(ESAPI.encoder().encodeForHTML(userInput));
Runtime.getRuntime().exec(ESAPI.encoder().encodeForHTML(userInput));\n



        }

Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

java
java
import com.owasp.esapi.ESAPI;
java
String sanitizedInput = input.replaceAll("\\s+|[`~!@#$%^&*()+=|{}[]:;'<>,.?/\\\\\\\\\"", "");
Runtime.getRuntime().exec("cmd.exe /c " + sanitizedInput);\njava
String sanitizedInput = ESAPI.encoder().encodeForHTML(userInput);
ProcessBuilder pb = new ProcessBuilder("cmd", "/c", sanitizedInput);
pb.redirectErrorStream(true);
Process p = pb.start();
BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}\n
// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));\n
// ...
java
String sanitizedInput = ESAPI.encoder().encodeForHTML(userInput);
ProcessBuilder pb = new ProcessBuilder("cmd", "/c", sanitizedInput);
pb.redirectErrorStream(true);
Process p = pb.start();
java
String sanitizedInput = input.replaceAll("\\s+|[`~!@#$%^&*()+=|{}[]:;'<>,.?/\\\\\\\\\"", "");
Runtime.getRuntime().exec("cmd.exe /c " + sanitizedInput);
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}
```\n        Avoid using user input in command execution. If necessary, validate and sanitize the input:

```java
// Instead of:
Runtime.getRuntime().exec("cmd.exe /c " + userInput);


        Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;
