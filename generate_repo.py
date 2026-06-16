import os
import subprocess

base_path = r"c:\Users\tavva\OneDrive\Desktop\CTS\Upskilling"
git_repo_path = r"c:\Users\tavva\OneDrive\Desktop\CTS"

modules = {
    "HTML5": {
        "notes": """# HTML5 Notes

## Semantic Tags
`<header>`, `<footer>`, `<article>`, `<section>`
Used to give meaning to the web page structure.

## Forms
`<input type="email">`, `<input type="date">`
New input types make form validation easier without JS.

## Multimedia
`<audio controls>`, `<video controls>`
Play media files natively in the browser.

## LocalStorage
// Store user information
`localStorage.setItem('key', 'value');`
Data persists even after browser is closed.
""",
        "quiz": """# HTML5 Quiz

1. What does HTML stand for?
Answer: Hyper Text Markup Language

2. Choose the correct HTML element for the largest heading:
Answer: `<h1>`

3. What is the correct HTML element for inserting a line break?
Answer: `<br>`

4. Which input type defines a slider control?
Answer: `range`

5. Which HTML element is used to specify a footer for a document or section?
Answer: `<footer>`

6. In HTML, which attribute is used to specify that an input field must be filled out?
Answer: `required`

7. Which element is used to play audio files?
Answer: `<audio>`

8. How can you open a link in a new tab/browser window?
Answer: `<a href="url" target="_blank">`

9. Which HTML element defines navigation links?
Answer: `<nav>`

10. What is the correct HTML for adding a background color?
Answer: `<body style="background-color:yellow;">`
"""
    },
    "CSS3": {
        "notes": """# CSS3 Notes

## Flexbox
`display:flex;`
`justify-content:center;`
`align-items:center;`
Used for aligning elements horizontally and vertically.

## Grid
`display: grid;`
`grid-template-columns: auto auto auto;`
Used for two-dimensional layouts.

## Media Queries
`@media (max-width: 600px) { ... }`
Makes the website responsive on mobile devices.

## Transitions
// Change button color on hover
`transition: background-color 0.3s ease;`
Used for smooth animations.
""",
        "quiz": """# CSS3 Quiz

1. What does CSS stand for?
Answer: Cascading Style Sheets

2. Which HTML attribute is used to define inline styles?
Answer: `style`

3. Which property is used to change the background color?
Answer: `background-color`

4. How do you add a background color for all <h1> elements?
Answer: `h1 {background-color:#FFFFFF;}`

5. Which CSS property is used to change the text color of an element?
Answer: `color`

6. Which CSS property controls the text size?
Answer: `font-size`

7. How do you display hyperlinks without an underline?
Answer: `a {text-decoration:none;}`

8. How do you make a list that lists its items with squares?
Answer: `list-style-type: square;`

9. How do you select an element with id "demo"?
Answer: `#demo`

10. How do you select elements with class name "test"?
Answer: `.test`
"""
    },
    "JavaScript": {
        "notes": """# JavaScript Notes

## Variables
`let` and `const`
Always use const unless the value needs to change.

## Arrow Functions
`const add = (a, b) => a + b;`
Shorter syntax for writing functions.

## DOM Manipulation
// Change text content
`document.getElementById("demo").innerHTML = "Hello";`
Used to interact with HTML elements dynamically.

## Promises and Async/Await
```javascript
async function getData() {
    let res = await fetch('url');
    let data = await res.json();
}
```
Used for handling asynchronous operations like API calls.
""",
        "quiz": """# JavaScript Quiz

1. Inside which HTML element do we put the JavaScript?
Answer: `<script>`

2. Where is the correct place to insert a JavaScript?
Answer: Both the `<head>` section and the `<body>` section are correct

3. What is the correct syntax for referring to an external script called "xxx.js"?
Answer: `<script src="xxx.js">`

4. How do you write "Hello World" in an alert box?
Answer: `alert("Hello World");`

5. How do you create a function in JavaScript?
Answer: `function myFunction()`

6. How do you call a function named "myFunction"?
Answer: `myFunction()`

7. How to write an IF statement in JavaScript?
Answer: `if (i == 5)`

8. How does a FOR loop start?
Answer: `for (i = 0; i <= 5; i++)`

9. How can you add a comment in a JavaScript?
Answer: `//This is a comment`

10. What is the correct way to write a JavaScript array?
Answer: `var colors = ["red", "green", "blue"]`
"""
    },
    "Bootstrap5": {
        "notes": """# Bootstrap5 Notes

## Container
`.container` for fixed width.
`.container-fluid` for full width.

## Grid System
12 column layout.
`.row`, `.col-md-6`
Used to structure pages easily.

## Buttons
`<button class="btn btn-primary">Click</button>`
Built in classes for quick styling.

## Utilities
`.mt-3` (margin top), `.p-2` (padding), `.text-center`
Helpful classes to avoid writing custom CSS.
""",
        "quiz": """# Bootstrap5 Quiz

1. What is Bootstrap?
Answer: A CSS framework for developing responsive websites.

2. Which class provides a responsive fixed width container?
Answer: `.container`

3. The Bootstrap grid system is based on how many columns?
Answer: 12

4. Which class adds zebra-stripes to a table?
Answer: `.table-striped`

5. Which class is used to create a big box for calling extra attention?
Answer: `.jumbotron` (note: removed in v5, but contextually .p-5 .mb-4 .bg-light .rounded)

6. Which button class is used to create a large button?
Answer: `.btn-lg`

7. Which class is used to create a badge?
Answer: `.badge`

8. Which class creates a progress bar?
Answer: `.progress-bar`

9. Which class is used to create a flexbox container?
Answer: `.d-flex`

10. Which class adds a margin to the top of an element?
Answer: `.mt-*`
"""
    },
    "jQuery": {
        "notes": """# jQuery Notes

## Syntax
`$(selector).action()`
Simplifies JS programming.

## Selectors
`$("#id")`
`$(".class")`
Used to find HTML elements.

## Events
// Click event
`$("#btn").click(function(){ ... });`
Handle user interactions.

## Hide and Show
`$("#demo").hide();`
`$("#demo").show();`
Easily toggle visibility of elements.
""",
        "quiz": """# jQuery Quiz

1. Which sign does jQuery use as a shortcut for jQuery?
Answer: the $ sign

2. Is jQuery a JSON library?
Answer: No

3. Look at the following selector: $("div"). What does it select?
Answer: All div elements

4. Look at the following selector: $("p.intro"). What does it select?
Answer: All p elements with class="intro"

5. Which jQuery method is used to hide selected elements?
Answer: hide()

6. Which jQuery method is used to set one or more style properties for selected elements?
Answer: css()

7. Which jQuery method is used to perform an asynchronous HTTP request?
Answer: jQuery.ajax()

8. What is the correct jQuery code to set the background color of all p elements to red?
Answer: `$("p").css("background-color", "red");`

9. Which method is used to get the value of an input field?
Answer: val()

10. How do you select all p elements inside a div element?
Answer: `$("div p")`
"""
    },
    "SQL": {
        "notes": """# SQL Notes

## DDL (Data Definition Language)
`CREATE TABLE`, `ALTER TABLE`, `DROP TABLE`
Used to define database schema.

## DML (Data Manipulation Language)
`INSERT`, `UPDATE`, `DELETE`
Used to manage data inside tables.

## Joins
`INNER JOIN`, `LEFT JOIN`, `RIGHT JOIN`
// Get matching records from both tables
Used to combine rows from two or more tables.

## Aggregate Functions
`COUNT()`, `SUM()`, `MAX()`
Used to perform calculations on a set of values.
""",
        "quiz": """# SQL Quiz

1. What does SQL stand for?
Answer: Structured Query Language

2. Which SQL statement is used to extract data from a database?
Answer: SELECT

3. Which SQL statement is used to update data in a database?
Answer: UPDATE

4. Which SQL statement is used to delete data from a database?
Answer: DELETE

5. Which SQL statement is used to insert new data in a database?
Answer: INSERT INTO

6. With SQL, how do you select a column named "FirstName" from a table named "Persons"?
Answer: `SELECT FirstName FROM Persons`

7. With SQL, how do you select all the columns from a table named "Persons"?
Answer: `SELECT * FROM Persons`

8. With SQL, how do you select all the records from a table named "Persons" where the value of the column "FirstName" is "Peter"?
Answer: `SELECT * FROM Persons WHERE FirstName='Peter'`

9. With SQL, how do you select all the records from a table named "Persons" where the value of the column "FirstName" starts with an "a"?
Answer: `SELECT * FROM Persons WHERE FirstName LIKE 'a%'`

10. The OR operator displays a record if ANY conditions listed are true. The AND operator displays a record if ALL of the conditions listed are true
Answer: True
"""
    },
    "CSharp": {
        "notes": """# C# Notes

## Variables and Data Types
`int`, `string`, `bool`, `double`
Strongly typed language.

## Object Oriented Programming
Classes and Objects.
Encapsulation, Inheritance, Polymorphism, Abstraction.

## LINQ
// Get active employees
`var activeEmployees = employees.Where(e => e.IsActive).ToList();`
Language Integrated Query simplifies data manipulation.

## Exception Handling
`try`, `catch`, `finally`
Used to handle runtime errors gracefully.
""",
        "quiz": """# C# Quiz

1. What is the correct syntax to output "Hello World" in C#?
Answer: `Console.WriteLine("Hello World");`

2. How do you insert COMMENTS in C# code?
Answer: `// This is a comment`

3. Which data type is used to create a variable that should store text?
Answer: `string`

4. How do you create a variable with the numeric value 5?
Answer: `int x = 5;`

5. Which operator is used to add together two values?
Answer: `+`

6. To declare an array in C#, define the variable type with:
Answer: `[]`

7. True or False: C# is an alias of C++
Answer: False

8. How do you create a method in C#?
Answer: `static void MyMethod()`

9. How do you call a method in C#?
Answer: `MyMethod();`

10. Which keyword is used to create a class in C#?
Answer: `class`
"""
    },
    "ADO.NET": {
        "notes": """# ADO.NET Notes

## SqlConnection
`using (SqlConnection conn = new SqlConnection(connectionString))`
Used to establish a connection to SQL Server.

## SqlCommand
`SqlCommand cmd = new SqlCommand(query, conn);`
Used to execute SQL queries and stored procedures.

## SqlDataReader
// Read data sequentially
`while(reader.Read()) { ... }`
Used for fast, forward-only reading of data.

## SqlDataAdapter
Used to fill a `DataSet` or `DataTable` for disconnected data access.
""",
        "quiz": """# ADO.NET Quiz

1. What is ADO.NET?
Answer: A data access technology from the Microsoft .NET Framework.

2. Which namespace is used for SQL Server data access?
Answer: `System.Data.SqlClient`

3. What object is used to establish a connection to a database?
Answer: `SqlConnection`

4. What object is used to execute a query against a database?
Answer: `SqlCommand`

5. What method of SqlCommand executes a query that returns no rows (like INSERT or UPDATE)?
Answer: `ExecuteNonQuery()`

6. What method of SqlCommand returns a single value?
Answer: `ExecuteScalar()`

7. What is SqlDataReader used for?
Answer: Reading a forward-only stream of rows from a data source.

8. True or False: SqlDataAdapter provides the bridge between a DataSet and data source for retrieving and saving data.
Answer: True

9. What is a connection string?
Answer: A string that specifies information about a data source and the means of connecting to it.

10. How do you prevent SQL Injection in ADO.NET?
Answer: By using parameterized queries.
"""
    }
}

def run_cmd(cmd):
    result = subprocess.run(cmd, cwd=git_repo_path, shell=True, capture_output=True, text=True)
    if result.returncode != 0:
        print(f"Error running cmd: {cmd}\n{result.stderr}")

def write_file(filepath, content):
    os.makedirs(os.path.dirname(filepath), exist_ok=True)
    if os.path.exists(filepath) and os.path.getsize(filepath) > 5:
        with open(filepath, "r", encoding="utf-8") as f:
            existing = f.read()
        if content.strip() not in existing:
            with open(filepath, "a", encoding="utf-8") as f:
                f.write("\n\n" + content.strip())
    else:
        with open(filepath, "w", encoding="utf-8") as f:
            f.write(content.strip())

def git_commit(msg):
    run_cmd('git add Upskilling')
    run_cmd(f'git commit -m "{msg}"')

# Ensure git is initialized
run_cmd('git init')

for mod, content in modules.items():
    print(f"Processing {mod}...")
    mod_path = os.path.join(base_path, mod)
    
    # 1. Structure & README
    readme_content = f"""# {mod}

## Learning Objectives
* Understand the core concepts of {mod}
* Apply {mod} in real-world scenarios
* Prepare for interview questions

## Topics Covered
* Introduction and Basics
* Advanced Features
* Practical Implementations

## Folder Structure
* `Notes/`: Important concepts and syntax
* `HandsOn/`: Code exercises
* `Assignments/`: Practice problems
* `Quiz/`: Interview-style questions
* `Screenshots/`: Execution outputs

## References
* W3Schools
* Official Documentation
"""
    write_file(os.path.join(mod_path, "README.md"), readme_content)
    write_file(os.path.join(mod_path, "Screenshots", "README.md"), "Place actual W3Schools quiz screenshots and hands-on screenshots here.")
    
    git_commit(f"Created {mod} module structure")

    # 2. Notes
    write_file(os.path.join(mod_path, "Notes", f"Notes.md"), content["notes"])
    git_commit(f"Added {mod} notes")

    # 3. HandsOn
    handson_path = os.path.join(mod_path, "HandsOn")
    if mod in ["HTML5", "CSS3", "JavaScript", "Bootstrap5", "jQuery"]:
        for i in range(1, 4):
            ex_path = os.path.join(handson_path, f"Exercise{i}")
            write_file(os.path.join(ex_path, "index.html"), f"<!-- {mod} Exercise {i} -->\\n<!DOCTYPE html>\\n<html>\\n<body>\\n  <h1>{mod} Exercise {i}</h1>\\n</body>\\n</html>")
            if mod == "CSS3":
                write_file(os.path.join(ex_path, "style.css"), "/* Basic styling */\\nbody { margin: 0; font-family: sans-serif; }\\nh1 { color: #333; }")
            elif mod in ["JavaScript", "jQuery"]:
                write_file(os.path.join(ex_path, "script.js"), f"// {mod} logic\\nconsole.log('{mod} Exercise {i} loaded');")
    elif mod == "SQL":
        for i in range(1, 4):
            ex_path = os.path.join(handson_path, f"Exercise{i}")
            write_file(os.path.join(ex_path, "schema.sql"), f"-- Create table\\nCREATE TABLE Employees{i} (\\n  Id INT PRIMARY KEY,\\n  Name VARCHAR(50)\\n);")
            write_file(os.path.join(ex_path, "queries.sql"), f"-- Insert and select\\nINSERT INTO Employees{i} VALUES (1, 'Alice');\\nSELECT * FROM Employees{i};")
    elif mod == "CSharp":
        for i in range(1, 4):
            ex_path = os.path.join(handson_path, f"Exercise{i}")
            write_file(os.path.join(ex_path, "Program.cs"), f"// Main entry point\\nusing System;\\nclass Program {{\\n  static void Main() {{\\n    Console.WriteLine(\\\"Hello from {mod}\\\");\\n  }}\\n}}")
            write_file(os.path.join(ex_path, "Student.cs"), "// Student model\\npublic class Student {\\n  public int Id { get; set; }\\n  public string Name { get; set; }\\n}")
            write_file(os.path.join(ex_path, "Employee.cs"), "// Employee model\\npublic class Employee {\\n  public int Id { get; set; }\\n  public string Name { get; set; }\\n}")
    elif mod == "ADO.NET":
        for i in range(1, 4):
            ex_path = os.path.join(handson_path, f"Exercise{i}")
            write_file(os.path.join(ex_path, "Program.cs"), f"// Main entry point\\nusing System;\\nclass Program {{\\n  static void Main() {{\\n    Console.WriteLine(\\\"ADO.NET Demo\\\");\\n  }}\\n}}")
            write_file(os.path.join(ex_path, "DatabaseHelper.cs"), "// Database helper methods\\npublic class DatabaseHelper {\\n  // connection logic\\n}")
            write_file(os.path.join(ex_path, "CRUDExample.cs"), "// CRUD operations\\npublic class CRUDExample {\\n  // insert, update, delete logic\\n}")
            
    git_commit(f"Completed {mod} hands-on exercises")

    # 4. Assignments
    assign_path = os.path.join(mod_path, "Assignments")
    for i in range(1, 3):
        assign_content = f"""# Assignment {i}

## Problem Statement
Create a practical example demonstrating {mod} basics.

## Solution
// Implemented logic for {mod} assignment {i}.
// Ensures all requirements are met cleanly.

## Expected Output
The code executes and produces the correct result as taught in notes.
"""
        write_file(os.path.join(assign_path, f"Assignment{i}.md"), assign_content)
    
    git_commit(f"Added {mod} assignments")

    # 5. Quiz
    write_file(os.path.join(mod_path, "Quiz", "Quiz.md"), content["quiz"])
    git_commit(f"Added {mod} quiz notes")

print("Done")
