@Test
Feature: Form

  @001
  Scenario Outline: CreateForm
    #Then Fill the field "Option 2" answer with "Answer1-2"
    #Then Fill the field "Option 3" answer with "Answer1-3"
    Given Click on create a new Form
    Then Fill the fields of tittle and description with '<FormTittle>' and '<FormDescription>'
    When Fill the field of the first question with '<FirstQuestion>'
    Then Fill the field 1-1 with '<Answer1-1>'
    Then Fill the field 1-2 with '<Answer1-2>'
    Then Fill the field 1-3 with '<Answer1-3>'
    When Click on add another question
    Then Fill the field of the second question with '<SecondQuestion>'
    Then Fill the field 2-1 with '<Answer2-1>'
    Then Fill the field 2-2 with '<Answer2-2>'
    Then Fill the field 2-3 with '<Answer2-3>'
    When Click on the send button
    Then Fill the field of the mail to send to '<Destination>'
    Then Send the form

    Examples:
      | FormTittle     | FormDescription     | FirstQuestion | SecondQuestion | Answer1-1 | Answer1-2 | Answer1-3 | Answer2-1 | Answer2-2 | Answer2-3 | Destination       |
      | Tittle Example | Description example | FirstQuestion | SecondQuestion | Answer1-1 | Answer1-2 | Answer1-3 | Answer2-1 | Answer2-2 | Answer2-3 | example@gmail.com |

  @002
  Scenario Outline: Delete Form
    Given Search the form '<FormToSearch>'
    Then Delete form

    Examples:
      | FormToSearch  |
      | Untitled form |

  @003
  Scenario Outline: Edit Form
    Given Search the form '<FormToSearch>'
    When Click on the form
    Then Fill the fields of tittle and description with '<FormTittle>' and '<FormDescription>'
    Then Fill the field of the first question with '<FirstQuestion>'

    Examples:
      | FormToSearch | FormTittle  | FormDescription | FirstQuestion |
      | ExampleForm  | ChangedForm | NewDescription  | NewQuestion   |

  @004
  Scenario Outline: Search Form
    Given Search the form '<FormToSearch>'
    Then Check the results

    Examples:
      | FormToSearch |
      | ExampleForm  |