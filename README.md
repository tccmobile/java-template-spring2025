# Java Project with DevContainer

This project is a Java application configured with DevContainer support, making it easy to get started with a consistent development environment.

## Prerequisites

- [Visual Studio Code](https://code.visualstudio.com/)
- [Docker Desktop](https://www.docker.com/products/docker-desktop/)
- [VS Code Remote - Containers extension](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers)

## Development Environments

You can develop this project either using local DevContainer or GitHub Codespaces.

### Option 1: GitHub Codespaces

1. Open the repository on GitHub
2. Click the green "Code" button
3. Select the "Codespaces" tab
4. Click "Create codespace on main"

The codespace will automatically:
- Create a cloud-based development environment
- Set up the DevContainer with all dependencies
- Configure VS Code in the browser
- Install all required extensions

You can also:
- Use VS Code locally with GitHub Codespaces by clicking the "Open in VS Code" button
- Stop your codespace when not in use to save resources
- Resume your codespace later with all your changes preserved
- Configure codespace resources (CPU/RAM) in GitHub settings

**Note**: Codespaces provides up to 60 hours of free usage per month for personal accounts.

The development environment comes with:
- All Java development extensions
- GitHub Copilot integration
- GitHub Copilot Chat for AI assistance

**Note**: GitHub Copilot requires an active subscription or GitHub Student/Enterprise account.

### Option 2: Local Development with DevContainer

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <project-directory>
   ```

2. Open the project in VS Code:
   ```bash
   code .
   ```

3. When prompted by VS Code, click "Reopen in Container" or:
   - Press `F1`
   - Type "Reopen in Container"
   - Select "Remote-Containers: Reopen in Container"

4. Wait for the container to build and initialize. This will:
   - Set up Java 17
   - Install Maven
   - Configure all necessary VS Code extensions
   - Set up the development environment

## Project Structure 
```
project-root/
├── .devcontainer/ # DevContainer configuration
├── src/
│ ├── main/
│ │ ├── java/ # Application source code
│ │ └── resources/ # Application resources
│ └── test/
│ ├── java/ # Test source code
│ └── resources/ # Test resources
└── pom.xml # Maven configuration
```

## Building the Project

To build the project, run:

```bash
mvn clean package
```

## Running the Application

There are several ways to run the application:

1. Using VS Code:
   - Open `App.java`
   - Click the "Run" button above the `main` method
   - Or press `F5`

2. Using Maven:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.App"
   ```

3. Using Java directly (after building):
   ```bash
   java -cp target/java-project-1.0-SNAPSHOT.jar com.example.App
   ```

## Running Tests

There are multiple ways to run the tests:

1. Using VS Code:
   - Open the Testing sidebar (beaker icon)
   - Click the play button to run all tests
   - Or click the play button next to individual tests

2. Using Maven:
   ```bash
   mvn test
   ```

3. Using VS Code Test Explorer:
   - Navigate to the test file
   - Click the "Run Test" link above the test method

## Development Features

This project comes with several development features:

- **Java Development Kit**: JDK 17 pre-installed
- **Maven**: Build automation tool
- **JUnit 5**: Testing framework
- **VS Code Extensions**:
  - Java Extension Pack
  - Maven for Java
  - Debugger for Java
  - Test Runner for Java

## Debugging

To debug the application:

1. Set breakpoints by clicking the gutter (space to the left of the line numbers)
2. Press F5 or use the Run and Debug sidebar
3. Use the debug toolbar to:
   - Continue (F5)
   - Step Over (F10)
   - Step Into (F11)
   - Step Out (Shift+F11)

## Common Issues and Solutions

1. **Container fails to build**
   - Ensure Docker Desktop is running
   - Try rebuilding the container: Command Palette → "Rebuild Container"

2. **Maven build fails**
   - Check your internet connection
   - Try clearing Maven cache: `mvn clean`

3. **Tests not running**
   - Ensure JUnit dependencies are properly configured in `pom.xml`
   - Refresh Maven project: Right-click on `pom.xml` → Update Project

## Contributing

1. Create a new branch for your feature
2. Make your changes
3. Run all tests
4. Submit a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details. 