# Flyway
## Software Info
- From version 6.0, some features are supported by Team license only
- Current version is 7.x
- MySQL 5.6 or earlier version is supported by Team license only for the version 6+
## Basic Concepts
## Configuration Parameters
- schemas: specifies which DB (or schema) will be managed by flyway. If they don't exist, then flyway will attempt create them. 
## Maven Flyway Plugin
### Usage
```
> mvn flyway:<goal>
```
### Goals
- migrate
- info
- clean
  - it will erase all objects in the schema
- validate
- undo
- baseline
- repair

## MySQL