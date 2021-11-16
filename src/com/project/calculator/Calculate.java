package com.project.calculator;

import java.util.Stack;

public class Calculate {
    private static Stack stack = new Stack();
    String cheek;
    public String evaluation(String infix,boolean isDegree)
    {
        String []postfix=infixToPostfix(infix);
        for (int i = 0; i <postfix.length; i++)
        {
            if (postfix[i] == null) break;
            cheek = postfix[i];
            if (isOperator(cheek))
            {
                if (cheek.equals("-") || cheek.equals("+") || cheek.equals("*") || cheek.equals("/") || cheek.equals("^"))
                {
                    double result = 0;
                    double op2 = Double.parseDouble(stack.pop().toString());
                    double op1 = Double.parseDouble(stack.pop().toString());
                    switch (cheek)
                    {
                        case "+":
                            result = op1 + op2;
                            stack.push(result);
                            break;
                        case "-":
                            result = op1 - op2;
                            stack.push(result);
                            break;
                        case "*":
                            result = op1 * op2;
                            stack.push(result);
                            break;
                        case "/":
                            result = op1 / op2;
                            stack.push(result);
                            break;
                        case "^":
                            result = Math.pow(op1, op2);
                            stack.push(result);
                            break;
                    }
                }
                else {
                    double result = 0;
                    double op1 = Double.parseDouble(stack.pop().toString());
                    switch (cheek) {
                        case "Tan":
                            result = (isDegree) ? Math.tan((op1 * Math.PI) / 180) : Math.tan(op1);
                            stack.push(result);
                            break;
                        case "Sin":
                            result = (isDegree) ? Math.sin((op1 * Math.PI) / 180) : Math.sin(op1);
                            stack.push(result);
                            break;
                        case "Cos":
                            result = (isDegree) ? Math.cos((op1 * Math.PI) / 180) : Math.cos(op1);
                            stack.push(result);
                            break;
                        case "Log":
                            result = Math.log10(op1);
                            stack.push(result);
                            break;
                        case "Ln":
                            result = Math.log(op1);
                            stack.push(result);
                            break;
                        case "Sqrt":
                            result = Math.sqrt(op1);
                            stack.push(result);
                            break;
                    }
                }
            }  else{
                stack.push(cheek);
            }
        }
        return stack.pop().toString();
    }

    private boolean isOperator(String input)
    {
        if (Character.isDigit(input.charAt(0)))
            return false;
        else return true;
    }
    private static int priority(String inputChar)
    {
        if (inputChar.equals("+")||inputChar.equals("-")) return 0;
        else if (inputChar.equals("*")||inputChar.equals("/")) return 1;
        else if (inputChar.equals("^")) return 2;
        else if (inputChar.equals("Sin")||inputChar.equals("Cos")
                ||inputChar.equals("Tan")||inputChar.equals("Sqrt")||inputChar.equals("Log")) return 3;

        return -1;
    }
    private static String[] infixToPostfix(String input)
    {
        String[] postFix = new String[input.length()];
        int kye = 0;
        String character;
        for (int i = 0; i < input.length(); i++)
        {
            postFix[kye]="";
            character = String.valueOf(input.charAt(i));
            if (Character.isDigit(character.charAt(0)))
            {
                while (Character.isDigit(input.charAt(i)) || input.charAt(i) == '.')
            {
                    postFix[kye] +=String.valueOf(input.charAt(i));
                    i++;
                    if (i==input.length())break;
            }
                i--;
                kye++;
            }else if (character.equals("("))
            {
                stack.push(character);
            }else if (character.equals(")"))
            {
                while (!String.valueOf(stack.peek()).equals("("))
                {
                    postFix[kye]=String.valueOf(stack.pop());
                    kye++;
                }
                stack.pop();
            }else if (character.equals("-")||character.equals("+")||character.equals("*")||
                    character.equals("/")||character.equals("^")||character.equals("S")||character.equals("C") || character.equals("T"))
            {
                String operator="";
                int count=0;
                while (Character.isLetter(input.charAt(i)))
                {
                    operator+=String.valueOf(input.charAt(i));
                    i++;
                    count++;
                }
                if (count>0)
                {
                    stack.push(operator);
                    i--;
                }else if (count==0) {
                    while
                    (stack.size()>0 && !String.valueOf(stack.peek()).equals("(") && priority(character)<=priority(String.valueOf(stack.peek())))
                    {
                         postFix[kye]=String.valueOf(stack.pop());
                         kye++;
                    }
                    stack.push(character);
                }
            }
        }
         while (stack.size()>0)
         {
             postFix[kye]=String.valueOf(stack.pop());
             kye++;
         }
         return postFix;
    }
}
