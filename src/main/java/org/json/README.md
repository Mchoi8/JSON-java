# Milestone 5

- Added an asynchronous method toJSONObject() that takes in an Exception function callback that uses a class ReaderXML to run a thread and returns a future object as it is running the function of parsing the XML file to a JSONObject. That future object is then called even though the parsing might still be running on a huge xml file.

```public static Future<JSONObject> toJSONObject(Reader reader, Consumer<JSONObject> func, Consumer<Exception> e) ```
linebreak
```ReaderXML class```

3 Test Cases for Milestone 5

```milestone5Test1()```
- Testing if the toJSONObject() returns a Future<JSONObject> object on a small XML file by checking the type of the return  

```milestone5Test2()```
- Testing if the toJSONObject() returns a Future<JSONObject> object on a medium sized XML file by checking the type of the return  

```milestone5Test3()```
- Testing if the toJSONObject() returns a Future<JSONObject> object on a large XML file by checking the type of the return  





# Milestone 4

Used the simple solution of streaming the JSONObject as Maps of key values as String and Object.
  - Tried to create a class as JSON Nodes with key value, and path attributes, but ended up with the simple solution for easier testing.
  - Focused on getting the top level elements rather than looking at nested objects.
  - The goal is to help developers in going through JSONObject data through streams and its methods.

3 Test Cases for Milestone 4

```streamTest1()```
- Testing if the toStream() works and nodes are printed out 

```streamTest2()```
- Testing if the toStream() works and nodes are collected into a list and printed out

```streamTest3()```
- Testing if the toStream() works and nodes are flatmapped collected into a list and printed out








# Milestone 3

## Used the overloaded static method to use the prefix 'swe262_'

3 Test Cases for Milestone 3

```milestoneTest1()```
```milestoneTest2()```
```milestoneTest3()```






# Milestone 2



Two test cases for Milestone 2

```taskTwoTest()```
```taskFiveTest()```
