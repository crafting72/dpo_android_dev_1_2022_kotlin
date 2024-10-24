# Homework goals
- To consider in practice the features of working with abstract classes.
- To practice the skill of creating a hierarchy of bank card classes using inheritance and abstract classes.

# What needs to be done
1. Create an abstract BankCard class that will describe the "Bank Card" entity. This class should provide the "Balance" property, as well as functions: 
- "Top up" — replenishes the card with the transferred amount;
- "Pay" — debits the transferred amount from the card and returns a Boolean result;
- "Get balance information";
- "Get information about available funds" — returns information about the balance, credit limit and any other funds.
2. Create two BankCard derivatives of the DebitCard and CreditCard classes.
3. In the DebitCard class, implement the "Top up" and "Get balance information" functions.
4. The CreditCard class should have an additional "Credit limit" property. The main assets of a credit card consist of two parts: the credit part and own funds.
When replenishing a credit card, you must first repay the credit part, and only then increase your own funds.
When paying, your own funds are debited first, then credit ones.  


Example

A credit card with a limit of 10,000. 

Credit facilities: 10 000.

Own funds: 0. 



After topping up the card by 5,000:

Credit facilities: 10 000.

Own funds: 5,000. 

   

   After paying for 5,000:

   Credit facilities: 10 000.

   Own funds: 0.

   

   After paying for 3,000: 

   Credit facilities: 7 000.

   Own funds: 0.

   

   After depositing 2,000: 

   Credit facilities: 9 000.

   Own funds: 0.

   

   After depositing 2,000: 

   Credit facilities: 10 000.

   Own funds: 1 000.

   

Implement the "Top up", "Pay" and "Get balance information" functions. Both own and credit funds should be taken into account.
   
5. Create several derived classes from DebitCard and CreditCard.
6. Add various bonus programs for specific debit and credit cards in the form of separate variables. 


Examples 
