# Guest Generator

Most people keep a guest list for a wedding or event, usually in the form of an excel document, which can be converted to `csv` very easily. This program is used to turn your `csv` guest list into something that the app can handle easily and efficiently.

Inside the `Guest` class of the `app` package, you can see how an `enum` is used for each guest. This program produces Java code to compile this enumerated guest list.

## Usage

Copy your guest list into the `guests.csv` file. Note that this isn't really a normal `csv`, instead of commas to seperate the columns, it uses semi-colons, since some people may include commas in people's names (or groups) for the seating assignment. For example:

```
Luke;Klinker;1
Hannah;Johson;1
Klinker;Family;2
Tim and Suzie;Johnson;3
...
```

The first two columns are name fields, while the last column is the table number.

Now that the list is compiled, we need to run the program. Easy enough from the command-line, but if you are here, you probably know how to run a Java program.

```
# to compile the program
$ javac GuestCsvParser.java
# to run the program
$ java GuestCsvParser
```

For the above input text, it produces something like this:

``` java
LUKE_KLINKER(1, "Luke Klinker", 1),
HANNAH_JOHSON(2, "Hannah Johson", 1),
KLINKER_FAMILY(3, "Klinker Family", 2),
TIM_AND_SUZIE_JOHNSON(4, "Tim and Suzie Johnson", 3),
```

This is basically just drag and drop into the `Guest` enumerated type in the `app` module, except for one thing. On the very last line, the very last character, there is a comma. Change this to a semi-colon instead.

``` java
LUKE_KLINKER(1, "Luke Klinker", 1),
HANNAH_JOHSON(2, "Hannah Johson", 1),
KLINKER_FAMILY(3, "Klinker Family", 2),
TIM_AND_SUZIE_JOHNSON(4, "Tim and Suzie Johnson", 3);
```
