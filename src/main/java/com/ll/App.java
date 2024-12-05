package com.ll;

import com.ll.domain.system.controller.SystemController;

import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private final SystemController systemController;

    public App(Scanner scanner) {
        this.scanner = scanner;
        this.systemController = new SystemController();
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");
        String cmd = scanner.nextLine();
        if (cmd.equals("종료")) {
            systemController.actionExit();
        }
    }
}
