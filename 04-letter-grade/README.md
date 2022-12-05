# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * % by 100, then have if statements for + and -


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * Add if (grade = 100), make it return A+


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * Add if (grade < 60), make it always return F if the grade is under 60
