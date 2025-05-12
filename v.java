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

Sanitize user input before rendering it as HTML:
Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

Avoid using user input in command execution. If necessary, validate and sanitize the input:

```java
// Instead of:
Runtime.getRuntime().exec("cmd.exe /c " + userInput);

// Use a whitelist approach:
List<String> allowedCommands = Arrays.asList("ls", "dir", "echo");
if (!allowedCommands.contains(userInput)) {
    throw new SecurityException("Invalid command");
}
Runtime.getRuntime().exec(userInput);
```\nout.println(userInput);

// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));
```\n```java
```java// Import the OWASP ESAPI library

Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

// Instead of:
out.println(userInput);

// Use:
Avoid using user input in command execution. If necessary, validate and sanitize the input:

```java
// Instead of:
Runtime.getRuntime().exec("cmd.exe /c " + userInput);

// Use a whitelist approach:
List<String> allowedCommands = Arrays.asList("ls", "dir", "echo");
if (!allowedCommands.contains(userInput)) {
    throw new SecurityException("Invalid command");
}
Runtime.getRuntime().exec(userInput);
```\n```\n
```java
Sanitize user input before rendering it as HTML:

```java
Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

// Instead of:
out.println(userInput);

// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));
```\nimport org.owasp.esapi.ESAPI;

// Instead of:
out.println(userInput);

// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));
```\n// Instead of:Runtime.getRuntime().exec("cmd.exe /c " + userInput);

if (!allowedCommands.contains(userInput)) {
    throw new SecurityException("Invalid command");
Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

        }

Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;

Sanitize user input before rendering it as HTML:

```java
```java// Import the OWASP ESAPI library
Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;
Avoid using user input in command execution. If necessary, validate and sanitize the input:

```java
// Instead of:
Runtime.getRuntime().exec("cmd.exe /c " + userInput);

// Use a whitelist approach:
List<String> allowedCommands = Arrays.asList("ls", "dir", "echo");
if (!allowedCommands.contains(userInput)) {
    throw new SecurityException("Invalid command");
}
Runtime.getRuntime().exec(userInput);
```
// Instead of:
out.println(userInput);

// Use:
out.println(ESAPI.encoder().encodeForHTML(userInput));
```
```\n        Avoid using user input in command execution. If necessary, validate and sanitize the input:

```java
// Instead of:
Runtime.getRuntime().exec("cmd.exe /c " + userInput);


        Sanitize user input before rendering it as HTML:

```java
// Import the OWASP ESAPI library
import org.owasp.esapi.ESAPI;
