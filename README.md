# Exercise 8: Packages and Interfaces

Author: Ayoub Farhi, student ID 77491

Java project (Gradle) built on exercise 7. It adds interfaces to the Person/Staff and Animal class hierarchies.

## Task 1: Salary interface

`Staff` implements the `Salary` interface. The interface has three methods:

- `salaryToPayFarhi77491(hours, rate)`: normal abstract method. `Staff` must override it.
- `salaryForOvertimeFarhi77491(overtimeHours, rate)`: default method. `Staff` may override it, but does not have to.
- `shouldReceiveBonusFarhi77491(yearsOfExperience)`: static method. It cannot be overridden. Call it on the interface: `Salary.shouldReceiveBonusFarhi77491(years)`.

## Task 2: Animal interfaces

- `AnimalBehavior`: method `sleepFarhi77491()`. Implemented by `Dog`, `Pigeon` and `Blowfish`.
- `AnimalMove`: default method `moveFarhi77491()`. Implemented by `Animal`. `Dog`, `Pigeon` and `Blowfish` override it.
- `AnimalName`: static method `nameFarhi77491(String)`. Called on the interface for each animal.

## How to run

1. Open the project in IntelliJ IDEA and wait for Gradle to finish loading.
2. Run `Main` for task 1 (use 6 for years of experience).
3. Run `animals.Main` for task 2.

## Expected output

Task 1: `Salary to pay (160h x 30): 4800.0`, `Overtime (10h x 30): 600.0`, `Bonus: true`.

Task 2: three sleep messages, then "Dog run", "Pigeon fly", "Blowfish swim" with an "Animal name" line for each animal.