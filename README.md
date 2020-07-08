# Banking-System-Java
This will be a banking system written in Java using OOP concepts and implementations.

## Project Planning:
1. Person class (abstract)
    - Full name (string)
    - First name and last name based on full name attribute (strings)
    - Address (string)
    - SSN (string) with validation later on
    - Birth date (Date object)
    - getAge()
    - Email (string)
    - Creates an account class 
2. Client and banker class. Banker will be able to change things whereas clients can only see their info.
    - Inherits from person class
    - Banker class will have more attributes/privileges
3. Account class
    - Banking number (string)
    - Banker/Client it belongs to
    - Amount of money in the account
    - later on add recent transactions ArrayList
    

Other Notes:
Possibly create an admin class later to change stuff like names or SSN's.
The Client class should only be able to get, whereas the bank class can get and set.