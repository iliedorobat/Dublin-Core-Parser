# Dublin-Core-Parser
Java parser for metadata structured according to Dublin Core (XML Schema)

DCMI Qualifiers:<br/>
https://www.dublincore.org/specifications/dublin-core/dcmes-qualifiers/

## Requirements
JDK 11+ or OpenJDK 11+

## Setup
1. Download and install [JDK 11](https://www.oracle.com/nl/java/technologies/javase/jdk11-archive-downloads.html) or [OpenJDK 11](https://openjdk.org/install/) (or newer versions)
2. Clone the repository:
```bash
  git clone https://github.com/iliedorobat/Dublin-Core-Parser.git
```
3. Generate the library:
```bash
  ./gradlew shadowJar
```

## Test the library:
```bash
  java -jar target/Dublin-Core-Parser-1.2.jar
```
