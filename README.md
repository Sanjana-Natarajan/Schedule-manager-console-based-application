# Schedule-manager-console-based-application
# Task Scheduler - Java Project

## Overview

**Scheduler** is a is a console-based task scheduling application implemented in Java. Users can check current schedules, add or delete tasks, and solve task conflicts.  This project is a base for more complex scheduling systems and is well suited to users who would like to control their daily routines.

### Key Features
- Add tasks with title, description, date, and time.
- Remove tasks by selecting them from the list.
- View all current tasks with details (including overlapping tasks).
- Prevent overlapping tasks with time conflict checking.
- Logs system events and user actions.
- Custom exception handling for user input and task selection.
  
## Project Structure

All Java classes are located in a single source file named `Scheduler.java`. Below is the breakdown of the key classes:

- **TaskSchedulerApp**: The main class responsible for user interaction and handling application flow.
- **Task**: Represents a task with attributes like title, description, due date, and time.
- **TaskCoordinator**: Handles task-related operations like adding, removing, and viewing tasks, while ensuring no time conflicts.
- **SystemMonitor**: Manages logging of system events such as task additions and removals.
- **ScheduleExceptions**: Custom exceptions for handling invalid task selection and other errors.
- **UserInputGuardian**: Validates user input to ensure correct data entry.

## Installation

1. Clone the repository to your local machine.
2. Navigate to the project directory, 'Scheduler'.
3. Compile the Java file and run application.
