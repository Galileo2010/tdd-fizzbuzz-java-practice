package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
public class HelloWorld {
    private Dependency dependency;

    public HelloWorld(Dependency dependency) {

        this.dependency = dependency;
    }
    public String beenCalled() {
        return dependency.say();
    }

    public String fizzBuzz(int number){
        // 重构
        String result = "";
        if (number%3==0) result += "Fizz";
        if (number%5==0) result += "Buzz";
        if (number%7==0) result += "Whizz";
        if (result.length() == 0) result += number;
        return result;

/*
if (number%3==0&& number%5==0 && number%7==0)
return "FizzBuzzWhizz";
else if (number%5==0 && number%7==0)
return "BuzzWhizz";
else if (number%3==0 && number%7==0)
return "FizzWhizz";
else if (number%3==0 && number%5==0)
return "FizzBuzz";
else if (number%3 == 0)
return "Fizz";
else if (number%5 == 0)
return "Buzz";
else if (number%7 == 0)
return "Whizz";
else
return String.format("%d",number);
*/
    }
}
