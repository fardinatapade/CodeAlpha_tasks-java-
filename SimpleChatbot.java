//Task 2= Artificial intelligence chatbot 

import java.util.Scanner;

public class SimpleChatbot {
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! Type 'bye' to exit.");

        while (true) 
        {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("hello"))
            {
                System.out.println("Chatbot: Hi there! How can I help?");
            } 
           
            else if (userInput.contains("how are you")) 
            {
                System.out.println("Chatbot: I'm just a bot, but I'm doing great!");
            } 
            
            else if (userInput.contains("what is java?")) 
            {
                System.out.println("Chatbot: Java is a programming language and computing platform "
                        + "that's used to create applications for many devices.");
            } 
            
            else if (userInput.contains("who is founder of java?")) 
            {
                System.out.println("Chatbot: James Arthur Gosling OC (born 19 May 1955) is a "
                        + "Canadian computer scientist, best known as the founder and "
                        + "lead designer behind the Java programming language.");
            } 
            
            else if (userInput.contains("tell me a joke")) 
            {
                System.out.println("Chatbot: Why did the computer catch a cold? "
                        + "Because it left its Windows open!");
            } 
            
            else if (userInput.contains("bye")) 
            {
                System.out.println("Chatbot: Goodbye! Have a nice day.");
                break;
            } 
            
            else 
            {
                System.out.println("Chatbot: Sorry, I don't understand.");
            }
        }

        scanner.close();
    }
}