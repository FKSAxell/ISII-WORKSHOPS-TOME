Feature: Can calculate him the insurance premium?
Scenario: The customer has over 80 years old
 Given Customer is over 80 years
 When Calculate the premium
 Then Show -1
 
Scenario Outline: The customer is or isnt over 80 years old
 Given The customer is "<years>" old
 When Calculate the premium
 Then Show "<answer>"
 
 
 #Scenario: The customer is male,unmarried and under 25 years old
 #Given Customer is male,unmarried and under 25 years old
 #When Calculate the premium
 #Then Show basePremium increased by 1500
 
#Scenario Outline: The customer is male,unmarried and under 25 years old
# Given The customer is "<years>" #old and is "<unmarried>"
# When Calculate the premium
# Then Show "<answer>"

 
 #Scenario: The customer is female and nor over 80 years old
 #Given Customer is female and nor over 80 years old
 #When Calculate the premium
 #Then Show basePremium subtracted by 200

#Scenario Outline: The customer is female and nor over 80 years old
 #Given The customer is "<years>" # old and is "<female>"
 #When Calculate the premium
 #Then Show "<answer>"
 
Scenario: The customer is between 45 and 65 years old
 Given Customer is between 45 and 65 years old
 When Calculate the premium
 Then Show basePremium subtracted by 100

Scenario Outline: The customer is between 45 and 65 years old
 Given The customer is "<years>" old
 When Calculate the premium
 Then Show "<answer>"
