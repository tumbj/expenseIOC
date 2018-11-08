# new feature
# Tags: optional
    
Feature: Edit
    As a user
    I can edit income and expense(amount, date, category, description)
    So that I view new edit
Scenario: Edit income
    Given a user have income 100
    When I edit 50
    Then income is 50

Scenario: Edit expense
    Given a user have expense 100
    When I edit 50
    Then expense is 50