# Coffee Machine CLI App

A console-based simulation of a coffee machine that demonstrates clean architecture and design patterns in a focused domain.

## Features

🎯 **Core Functionality**
- Interactive CLI interface
- Six primary operations:
    - `buy` - Purchase coffee drinks
    - `fill` - Replenish machine resources
    - `take` - Collect accumulated money
    - `clean` - Maintain machine cleanliness
    - `remaining` - Check machine status
    - `exit` - Close application
- "back" option in purchase menu for improved UX
- Modular I/O system supporting interface flexibility

## Technical Architecture

### Design Patterns

#### 1. Command Pattern
- Each operation is a standalone Command object
- Eliminates complex conditional logic
- Enables easy addition of new features
- Maintains single responsibility principle

#### 2. Enum Singleton
Implementation of key components as enum singletons:
- `CoffeeMachine`
- `CoffeeMachineController`
- `ConsoleIO`
- `CommandManager`

**Benefits:**
- Guaranteed single instance
- Built-in thread safety
- Serialization protection
- Idiomatic Java implementation

#### 3. Clean Architecture
Component separation for maintainability:
- `CoffeeMachineApp`: Application flow coordinator
- `CoffeeMachine`: State management
- `Commands`: Behavioral encapsulation
- `ConsoleIO`: I/O abstraction layer

## Implementation Insights

This project evolved from a simple exercise into a practical demonstration of software engineering principles:
- Command Pattern for scalable action handling
- Enum Singleton for robust instance management
- Architectural patterns applied at appropriate scale

## Getting Started

1. Clone the repository
2. Build with Maven
3. Run the application
4. Follow CLI prompts to interact with the machine

## Prerequisites

- Java 17 or higher
- Maven 3.6+