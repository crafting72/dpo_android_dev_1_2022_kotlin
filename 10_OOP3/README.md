# The purpose of the practical work
Put into practice the features of working with interfaces and anonymous objects.

# What needs to be done
Write a console currency converter where the user can enter the amount in rubles and the currency symbol into the console, and the program will convert it into the desired currency.
1. Create the CurrencyConverter interface. It should describe:

   a. The currencyCode field, which stores the international currency code as a string;

   b. the convertRub function, which converts rubles into currency.
3. Create several implementations of the CurrencyConverter interface. In each, define the currencyCode field and the convertRub function.
4. Create a singleton Converters object that stores all the currency converters you have created. Declare the get(currencyCode:String) function in it, which returns the converter based on the passed currencyCode.
5. In the main function, use the Converters object and the get function to get several converters for different currencies.
6. Consider cases when unknown currency codes are passed to the get function of the Converters object (for example, there is no converter for the Zimbabwean dollar, you have not described a converter for this currency). In such cases, use anonymous objects that implement the CurrencyConverter interface for each of the unknown currencies.
7. For each of the converters, check the correctness of the calculations and output a message in the format "n rubles = m%currency code%" to the console.

# Output
![](https://github.com/user-attachments/assets/10445127-3978-4472-81ff-aa4638434f41)
