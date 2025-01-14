# FindMyTrain Application

## Overview
The **FindMyTrain** application is a Java-based system designed to manage and query train schedules, stations, and platforms efficiently. It provides users with an interactive way to find trains operating between specific stations. The application leverages object-oriented principles to model real-world train systems effectively.

---

## Features
- **Station Management**: Handles multiple stations with unique platforms.
- **Platform Allocation**: Links platforms to trains for accurate scheduling.
- **Train Scheduling**: Includes arrival and departure times for each train.
- **Interactive Querying**: Find available trains between two stations with schedules.

---

## Classes and Responsibilities

### 1. Platform
Represents a platform at a station.
- **Attributes**:
  - `platformNumber`: Unique identifier.
  - `train`: Train assigned to the platform.
- **Methods**:
  - Getters and setters.
  - `toString()`: Displays platform details.

### 2. Station
Represents a train station with platforms.
- **Attributes**:
  - `stationId`: Unique ID.
  - `stationName`: Name.
  - `platformList`: List of platforms.
- **Methods**:
  - Getters and setters.
  - `toString()`: Displays station details.

### 3. Train
Represents a train.
- **Attributes**:
  - `trainID`: Unique ID.
  - `trainName`: Name.
  - `type`: Train type.
- **Methods**:
  - Getters and setters.
  - `toString()`: Displays train details.

### 4. Schedule
Represents a train's schedule.
- **Attributes**:
  - `train`: Train reference.
  - `station`: Station reference.
  - `platform`: Platform reference.
  - `arrivalTime`, `departureTime`: Times.
- **Methods**:
  - Getters and setters.
  - `toString()`: Displays schedule details.

### 5. TrainSystem
Manages the system.
- **Attributes**:
  - `stations`: Map of stations.
  - `trains`: Map of trains.
  - `schedules`: Schedule list.
- **Methods**:
  - `addStations`, `addTrains`, `addSchedules`.
  - `findMyTrains(String source, String destination)`.

### 6. FindMyTrainApp
Entry point for the application.
- **Functionalities**:
  - Initializes system with sample data.
  - Accepts input for finding trains.

---

## How to Run
1. Compile all `.java` files.
2. Execute `FindMyTrainApp`.
3. Follow prompts for querying trains.

---

## Sample Input/Output
### Input/Output:

---

## Technology Stack
- **Language**: Java
- **Concepts**: Object-Oriented Programming (OOP)
- **Tools**: IntelliJ IDEA, JDK

---

## Future Enhancements
- Database Integration.
- GUI Implementation.
- Advanced filtering (e.g., train type, schedule).
- Real-time train updates via API.

---

## Contributors
- **Rohit Dhumal**
  - Role: Developer
  - Contact: rohitdhumal248@gmail.com

---

Thank you for exploring the **FindMyTrain** application! Feedback is welcome.

