Feature: Can calculate him the insurance premium?

 
Scenario: The customer is over 80 years old
 Given The customer is 81 old
 When Calculate the premium
 Then Show -1.0
 
 
 Scenario: The customer is male, unmarried, and under 25 years old
  Given The customer is "male", "unmarried", and 24 years old
  When Calculate the Premium second case
  Then Show 2000.0 premium
 
 Scenario: The customer is female and under 80 years old 
 Given The customer is "female" and 79 years old
 When Calculate the premium for female third case
 Then Show 300.0 premium for female

 
 Scenario: The customer is a male between 45 and 65 years old and unmarried. 
  Given Customer is "male", "unmarried" and 46 years old, last case
  When Calculate the premium for a male last case
  Then Show 400.0 for last case


 

