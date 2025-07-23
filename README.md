# 🚀 Selenium-Framework-BDD

A robust end-to-end (E2E) automation testing framework built with **Selenium**, **Java**, **Cucumber (BDD)**, and **TestNG**, designed to promote test reusability, maintainability, and behavior-driven development.

---

### 🎯 Goals

* Implement **Behavior Driven Development (BDD)** using **Cucumber**, making tests more readable and business-friendly.
* Apply the **Page Object Model (POM)** to separate test logic from UI elements for better code organization and maintainability.
* Use **TestNG** for managing execution flows, parallelism, hooks, and tag filtering.
* Automatically capture **screenshots on test failures** for easier debugging and reporting.

---

### 🧩 Project Structure

```text
src/
├── main/
│   └── java/
│       └── pageobjects/       # Page Object classes
└── test/
    ├── java/
    │   ├── stepdefinitions/   # Step Definitions linked to Gherkin
    │   └── runners/           # TestNG + Cucumber test runners
    └── resources/
        └── features/          # Gherkin (.feature) files
```

---

### ⚙️ Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/HassenDAI-QA/Selenium-Framework-BDD.git
   cd Selenium-Framework-BDD
   ```

2. Build the project using Maven:

   ```bash
   mvn clean install
   ```

3. Run tests:

   ```bash
   mvn test -Dcucumber.options="--tags @smoke"
   ```

---

### ✅ Best Practices Included

* **Page Object Model** for clean separation of test logic and UI.
* **Explicit waits** instead of `Thread.sleep()` for reliable test execution.
* **Cucumber tags** for test categorization (e.g., `@smoke`, `@regression`).
* **Automatic screenshot capture** on failure to speed up debugging.
* **Reusable Step Definitions** to avoid duplication and encourage modular code.

---

### 🧪 Sample Gherkin Scenario

```gherkin
Feature: User Login

  @smoke
  Scenario: Successful login with valid credentials
    Given I open the login page
    When I enter a valid username and valid password
    Then I should be redirected to the homepage
```

---

### 🔧 Possible Extensions

* Integration with **Allure Reports** or **HTML Reports**.
* CI/CD pipelines (GitHub Actions, Jenkins, GitLab CI, etc.).
* Integration with **WebDriverManager** for automatic driver handling.
* Expansion to mobile testing via **Appium**.

---

### 🤝 Contributing

1. Fork this repository.
2. Create your feature branch:
   `git checkout -b feature/my-feature`
3. Commit your changes:
   `git commit -am 'Add new feature'`
4. Push to the branch:
   `git push origin feature/my-feature`
5. Open a **Pull Request**.

---

### 📚 References & Inspiration

* [Cucumber BDD with Java & Selenium – PixelQA](https://www.pixelqa.com/blog/post/cucumber-bdd-with-java-selenium-framework)
* [5 Pro Tips for Cucumber + Selenium – LinkedIn Post](https://www.linkedin.com/posts/hassendai_testautomation-selenium-cucumber-activity-7320015673974247424-Y4g5)

---

### 📄 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.
