package w13_Listen.rechentrainer;

import java.util.Random;
import java.util.Scanner;

public class Rechentrainer {

    private List postponedTasks = new List();
    private List allTasks = new List();
    private int totalTasks = 0;
    private int correctAnswers = 0;
    private int wrongAnswers = 0;

    public static void main(String[] args) {
        Rechentrainer trainer = new Rechentrainer();
        trainer.start();
        trainer.statistics();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String operations = "+-*";

        while (true) {
            System.out.print("Choose operation (+, -, *, or 'q' to quit): ");
            char operator = scanner.next().charAt(0);
            if (operator == 'q') break;

            if (operations.indexOf(operator) == -1) {
                System.out.println("Invalid operation!");
                continue;
            }

            int nr1 = random.nextInt(10) + 1;
            int nr2 = random.nextInt(10) + 1;
            int result = 0;

            switch (operator) {
                case '+': result = nr1 + nr2; break;
                case '-': result = nr1 - nr2; break;
                case '*': result = nr1 * nr2; break;
            }

            Knoten taskNode = new Knoten(nr1, nr2, operator, result);
            allTasks.addAtEnd(nr1, nr2, operator, result);
            totalTasks++;

            boolean correct = false;
            while (!correct) {
                System.out.print(nr1 + " " + operator + " " + nr2 + " = ");
                int answer = scanner.nextInt();

                if (taskNode.getResult() == answer) {
                    System.out.println("Correct!");
                    correctAnswers++;
                    correct = true;
                } else {
                    System.out.println("Wrong! Try again.");
                    wrongAnswers++;
                    postponeTask(taskNode);
                    correct = false;
                }
            }

            handlePostponedTasks();
        }
    }

    private void postponeTask(Knoten taskNode) {
        postponedTasks.addAtEnd(taskNode.getNr1(), taskNode.getNr2(), taskNode.getOperator(), taskNode.getResult());
    }

    private void handlePostponedTasks() {
        if (totalTasks % 10 == 0 && !postponedTasks.isEmpty()) {
            Knoten taskNode = postponedTasks.removeAtBeginning();
            Scanner scanner = new Scanner(System.in);
            boolean correct = false;

            while (!correct) {
                System.out.print(taskNode.getNr1() + " " + taskNode.getOperator() + " " + taskNode.getNr2() + " = ");
                int answer = scanner.nextInt();

                if (taskNode.getResult() == answer) {
                    System.out.println("Correct!");
                    correctAnswers++;
                    taskNode.setAttempts(taskNode.getAttempts() + 1); // Increment attempts
                    correct = true;

                    if (taskNode.getAttempts() < 2) {
                        postponedTasks.addAtEnd(taskNode.getNr1(), taskNode.getNr2(), taskNode.getOperator(), taskNode.getResult());
                    }
                } else {
                    System.out.println("Wrong! Try again.");
                    wrongAnswers++;
                    correct = false;
                }
            }
        }
    }

    public void statistics() {
        System.out.println("\n--- Statistics ---");
        System.out.println("Total tasks: " + totalTasks);
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Wrong answers: " + wrongAnswers);

        System.out.println("\nPostponed tasks:");
        Knoten k = postponedTasks.getFirst();
        while (k != null) {
            System.out.println(k.getNr1() + " " + k.getOperator() + " " + k.getNr2() + " = " + k.getResult());
            k = k.getNext();
        }
    }
}
