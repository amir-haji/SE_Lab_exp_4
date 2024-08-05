@tag

  Feature: calculator

    Scenario: add two numbers
      Given Two input values, 1 and 2
      When I add the two values
      Then I expect the result 3

      Scenario Outline: add two numbers
        Given Two input values, <first> and <second>
        When I add the two values
        Then I expect the result <result>

        Examples:
         | first | second | result |
         | 1 | 12 | 13 |
         | -1 | 6 | 5 |
         | 2 | 2 | 4 |

    Scenario: division and square root numbers
      Given Two input values, 16 and 4
      When I sqrt the two values
      Then I expect the result 2

    Scenario Outline: sqrt two numbers
      Given Two input values, <first> and <second>
      When I sqrt the two values
      Then I expect the result <result>

      Examples:
        | first | second | result |
        | 4 | 1 | 2 |
        | 36 | 4 | 3 |
        | 16 | 4 | 2 |