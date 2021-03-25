# Maratona Java do canal DevDojo: <br>210 videos do iniciante ao avançado

<i>Instrutor: Willian Suane  </i> | <i>Início: 23 de março</i> | <i>Término: 23 de maio</i>

Meta: 4 videos e exercícios/dia

Basics
=================================================================

### Install

Existem dois pacotes:

JRE x JDK

Se quiser somente rodar aplicações Java --> Java Runtime Environment
Se quiser criar, debugar ou/e compilar --> Java Development Kit

### Java Keywords

obs: Arquivos com extensão ".class " são arquivos compilados para bytecode (binário JVM)

Existem decompiladores que fazem o trabalho inverso.

Para compilar o primeiro arquivo, abra o editor de texto > boiler plate

	class OlaMundo {
	
		public static void main(String[ ] args) {
		
			System.out.println("Esse foi meu primeiro programa compilado pra bytecode")
		}
	}
	
	// ir para o Terminal e invocar o compiler e o arquivo com extensão .java
	// como parâmetro: $ javac OlaMundo.java
	

Após, se tudo ocorrer bem, será gerado um arquivo .class :

	// Execute no Terminal (local onde se encontra o arquivo):
	
	$ java OlaMundo
	
	// obs: se o arquivo for modificado ele terá que ser recompilado novamente.




### Code convention

Criação de classes - CamelCase

- Comments


		// comentário de única linha
		
		/*
			comentário de diversas linhas
		*/
		
		/***
		* Comentário oficial para documentação
		**/




Variables
===================================================================

- Primitive Types
- Integer numbers
- Floating point numbers
- Characters
- Booleans
- Local variables
- Variable Scope Local

Operators
==================================================================

Flow Control
=================================================================

- if, else
- switch
- while
- do while
- for
- break
- continue

Arrays
===================================================================

- two-dimensional arrays
- multi-dimensional arrays
- enhanced for
- main method

# Classes and Objects (Course realy beggins)

- Classes
- Declaring Classes
- Convention for naming Classes
- Objects
- Abstraction
- Cohesion
- Attributes
- Declaring Attributes
- Convention for naming attributes
- How access attributes through other classes?
- Initializing attributes
- Methods
- Declaring methods
- Convention for naming methods
- methods return
- passing parameters
- how to access methods through other classes
- Common mistakes
- Varargs
- Passing primitive types as parameter
- Passing reference type (objects) as parameter

## Encapsulation

- Getters and Setters
- Get methods
- Set methods
- Is Methods
- Access modifiers
- Public modifiers
- Private modifiers
- Object this
- Tight coupling
- Loose coupling

## Overloading methods

- Overloading
- Overloading with ambiguous types

## Constructors

- Declaring constructors
- Common mistakes
- Overloading constructors
- Using implicit object this
- initialization block
- Garbage collector

## Static modifier

- Static Attributes
- When to use and not use static attributes
- Static methods
- Static initialization block

## Association and Inheritance

- Association
- Inheritance
- Inheritance and private modifier
- Protecter Modifier
- Implicit reference Super
- Constructores X Inheritance
- Overriding Methods
- Final modifier
- Final modifier in Class declaration
- Final modifier in methods declaration
- Final modifier in attributes declaration

## Enums

## Abstratic Classes and Interfaces

- Abstract modifier
- Abstract Classes
- Abstract methods
- Common mistakes
- Interfaces in Java
- Defining an Interface
- Extending an Interface
- Interface vs Abstract Class
- Common mistakes

## Polymorphism

- Cast of objects
- Cast up
- Cast down 
- Operator instanceOf
- Polymorphic parameters
- Covariant returns

## Packages

- Declaring packages
- Using classes from other packages
- Default modifiers
- Static import

## Error Handling

- Exceptions
- Class Error
- Class Exception
- Runtime Exceptions
- Handling exceptions
- Instruction Throw
- Instruction Throws
- Try/catch
- Try/catch/finally
- Handling multiple exceptions
- Creating Custom exceptions
- Asserts
- Executing with asserts

## Collections

- Collections framework
- Methods equals( ) and hashCode( )
- Interface java.util.Collection
- Interface java.util.List
- ArrayList
- LinkedList
- Set
- HashSet
- Iterator
- LinkedHashSet
- SortedSet and NavigableSet
- TreeSet
- How to order arrays and lists?
- Interface Queue
- Interface Deque
- Interface Map
- HashMap
- HashTable
- LinkedHashMap
- SortedMap and NavigableMap
- TreeMap
- Overview Collections

## Utility Classe 

- Wrapper Classes
- Boxing
- String
- Comparing Strings
- StinrgBuffer and String Builder
- Dates with Java.util.Date
- Dates with java.util.Calendar
- Formatting and Converting dates
- Formatters
- Formatting numbers with java.text.NumberFormat
- Regular Expressions

## Java Database Connectivity - JDBC

- Design Patterns - DAO
- Driver JDBC
- Package java.sql
- Connecting with database
- Package java.sql.DriveManager
- Package java.sql.Connection
- Getting a connection
- Closing connection
- Package java.sql.statement
- Package java.sql.ResultSet
- Package java.sql.PreparedStatement

## Generics

- Generic Types
- Generic and legacy code
- Polymorphism and Generics
- Generic methods
- Generic Declarations

## Input and Output

- Stream of bytes
- Package java.io.stream
- Package java.io.outputStream
- Reading and Writing bytes into files
- Reading and Writing primitive types into files
- Optimizing writing and Reading with buffers
- Serializing Objects
- Filtering Files
- Stream of Characters
- Package java.io.writer
- Package java.io.reader
- Reading and Writing Files
- Reading and Writing Files with Buffer

## Multi-Threads

- Defining, instantiating and Starting threads
- Thread States and Transitions
- Prevent thread Execution
- Sleeping
- Thread priorities and Yield( )
- Synchronizing Code
- Locks
- Thread Deadlock
- Thread Interaction

## Design Patterns

- Builder
- Singleton
- DAO
- Factory

## Parameterizing Behaviors

## Functional Programming

- Lambdas
- Method references
- Default methods in Interfaces
- Optional
- Streams
- Streams Paralelos

## Asynchronous Programming

- CompletableFuture
- Async Exceptions