# Library Management System

Welcome to the Library Management System project! This system is designed to manage library operations efficiently using Object-Oriented Programming (OOP) principles.

## Project Overview

The Library Management System is built to handle various aspects of library management, including managing books, users, and transactions. It offers functionalities for checking in and out books, tracking due dates, and managing library inventory.

## Features

### User Management

- **User Registration & Login**: Users can create accounts, log in, and manage their profiles.
- **Admin Panel**: Administrators have special access to manage books and oversee transactions.

### Book Management

- **Add/Remove Books**: Administrators can add new books to the inventory or remove existing ones.
- **Book Details**: View detailed information about each book, including title, author, ISBN, and availability.
- **Search & Filter**: Users can search for books and filter by various criteria such as author, genre, and publication year.

### Loan Management

- **Check-Out Books**: Users can check out books and track due dates.
- **Return Books**: Users can return books, and the system updates the availability status.
- **Overdue Management**: Track overdue books and manage fines if applicable.

### Utilities

- **Database Management**: Handles data storage and retrieval.
- **Logging**: Captures system operations and errors for monitoring and debugging.

## OOP Design

### Key Classes

- **User**
  - **Attributes**: `userID`, `name`, `email`, `password`, `address`
  - **Methods**: `register()`, `login()`, `updateProfile()`

- **Admin** (inherits from `User`)
  - **Methods**: `addBook()`, `removeBook()`, `viewTransactions()`

- **Book**
  - **Attributes**: `bookID`, `title`, `author`, `ISBN`, `genre`, `publicationYear`, `availableCopies`
  - **Methods**: `updateAvailability()`, `searchBook()`

- **Loan**
  - **Attributes**: `loanID`, `user`, `book`, `loanDate`, `dueDate`, `returnDate`
  - **Methods**: `checkOutBook()`, `returnBook()`, `trackOverdue()`

- **Database**
  - **Attributes**: `connectionString`
  - **Methods**: `connect()`, `executeQuery()`, `fetchResults()`

- **Logger**
  - **Attributes**: `logFile`
  - **Methods**: `logError()`, `logInfo()`

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/AyaaMohammedsayed/Library-management-system.git
