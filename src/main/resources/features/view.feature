Feature: View
    As a user
    I can view total income and expense (add all incomes minus all expenses)
    also view total income and total expense separately

Scenario: View total
    Given a user have income 200 and expense 100
    When I view
    Then total is 100

Scenario: View total income
    Given a user have income 100,200
    When I view
    Then total income is 300

Scenario: View total expense
    Given a user have expense 100,200
    When I view
    Then total income is -300