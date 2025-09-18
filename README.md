# mybook

## Installations
1. Install dependencies with Maven
2. Install PostgresSQL

## Endpoints
GET /book - All books. (all authenticated users)

POST /book - Register a new book (ADMIN access required).

POST /auth/login - Login into the app

POST /auth/register - Register a new user

## Authentication

USER -> Standard user role for logged-in users.
ADMIN -> Admin role for managing registrations.

## Database

Project is using PostgresSQL as database. Necessary database migrations are managed using Flyway.
