# new feature
# Tags: optional
    
Feature: Expense
    As a user
    I  add  expense to account
    so that I can view balance

Scenario: Normal Expense
        Given a user have balance 200
        When I expense 100 I can explain
        Then balance is 100

Scenario: Over Expense
        Given a user have balance 200
        When I expense 300 I can explain
        Then balance is -100

