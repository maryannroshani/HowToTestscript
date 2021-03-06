#Feature: Check the page Headings
#
#Scenario: Check page title for adoption page
#    Given I am on the zoo website
#    When I click the link "adoption_link"
#    Then I check page title is "Adoption"
#    And I close the browser
#
#    Given I am on the zoo website
#    When I click the link "about_link"
#    Then I check page title is "About"
#    And I close the browser
#
#    Given I am on the zoo website
#    When I click the link "contact_link"
#    Then I check page title is "Contact"
#    And I close the browser
#


#
#  Scenario Outline: Test page headings
#    Given I am on the zoo website
#    When I click the link <Link>
#    Then I check page title is <Title>
#    And I close the browser
#
#    Examples:
#      | Link         | Title    |
#      | adoption_link | Adoption |
#      | about_link    | About    |
#      | contact_link  | Contact  |